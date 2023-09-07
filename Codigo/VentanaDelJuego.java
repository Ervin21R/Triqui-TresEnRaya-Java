/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Codigo;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author HP
 */
public class VentanaDelJuego extends javax.swing.JFrame {

    private boolean usuario1,usuario2;
    static int contador=1;
    static int validadorDeEmpate=0;
    private int cantV1=0,cantV2=0,cantEmp=0;
    static String nomUsuario1;
    static String nomUsuario2;
    static String turno="";
    private ImageIcon iconoX; 
    private ImageIcon iconoO;
    
    private boolean activado=false;
    private boolean boton00Down=false,boton10Down=false,boton20Down=false;
    private boolean boton01Down=false,boton11Down=false,boton21Down=false;
    private boolean boton02Down=false,boton12Down=false,boton22Down=false;
    
    static boolean marcaX00=false,marcaX10=false,marcaX20=false;
    static boolean marcaX01=false,marcaX11=false,marcaX21=false;
    static boolean marcaX02=false,marcaX12=false,marcaX22=false;
    
    static boolean marcaO00=false,marcaO10=false,marcaO20=false;
    static boolean marcaO01=false,marcaO11=false,marcaO21=false;
    static boolean marcaO02=false,marcaO12=false,marcaO22=false;
    
    static FelicitacionesGanador ganador;
    static Empatados empate;
    
    
    public VentanaDelJuego(String nomUsuario1,String nomUsuario2) {
        this.nomUsuario1=nomUsuario1;
        this.nomUsuario2=nomUsuario2;
        this.setLocationRelativeTo(null);

        initComponents();
        usuario1=false;
        usuario2=false;
        iconoX=new ImageIcon(getClass().getResource("/Imagenes/X.png"));
        iconoO=new ImageIcon(getClass().getResource("/Imagenes/O.png"));
        ganador= new FelicitacionesGanador(this,true,nomUsuario1, nomUsuario2);
        empate=new Empatados(this,true,nomUsuario1, nomUsuario2);
        
    }
    
    public void comprobarGanador(){
        if(marcaX00==true && marcaX10==true && marcaX20==true){ 
            ganador.setEtiquetaNombreGanador("Felicidades "+nomUsuario1);
            ganador.setVisible(true);  
            limpiarVentana();
            cantV1++;
        }
        else if(marcaO00==true && marcaO10==true && marcaO20==true){
            ganador.setEtiquetaNombreGanador("Felicidades "+nomUsuario2);
            ganador.setVisible(true);
            limpiarVentana();
            cantV2++;
        }
        else if(marcaX01==true && marcaX11==true && marcaX21==true){ 
            ganador.setEtiquetaNombreGanador("Felicidades "+nomUsuario1);
            ganador.setVisible(true);
            limpiarVentana();
            cantV1++;
        }
        else if(marcaO01==true && marcaO11==true && marcaO21==true){
            ganador.setEtiquetaNombreGanador("Felicidades "+nomUsuario2);
            ganador.setVisible(true);
            limpiarVentana();
            cantV2++;  
        }
        else if(marcaX02==true && marcaX12==true && marcaX22==true){ 
            ganador.setEtiquetaNombreGanador("Felicidades "+nomUsuario1);
            ganador.setVisible(true);
            limpiarVentana();
            cantV1++;
        }
        else if(marcaO02==true && marcaO12==true && marcaO22==true){
            ganador.setEtiquetaNombreGanador("Felicidades "+nomUsuario2);
            ganador.setVisible(true); 
            limpiarVentana();
            cantV2++;
        }
        //-------------------------------------------------------------
        else if(marcaX00==true && marcaX01==true && marcaX02==true){ 
            ganador.setEtiquetaNombreGanador("Felicidades "+nomUsuario1);
            ganador.setVisible(true);
            limpiarVentana();
            cantV1++;
        }
        else if(marcaO00==true && marcaO01==true && marcaO02==true){
            ganador.setEtiquetaNombreGanador("Felicidades "+nomUsuario2);
            ganador.setVisible(true);
            limpiarVentana();
            cantV2++;
        }
        else if(marcaX10==true && marcaX11==true && marcaX12==true){ 
            ganador.setEtiquetaNombreGanador("Felicidades "+nomUsuario1);
            ganador.setVisible(true);
            limpiarVentana();
            cantV1++;
        }
        else if(marcaO10==true && marcaO11==true && marcaO12==true){
            ganador.setEtiquetaNombreGanador("Felicidades "+nomUsuario2);
            ganador.setVisible(true);
            limpiarVentana();
            cantV2++;
        }
        else if(marcaX20==true && marcaX21==true && marcaX22==true){ 
            ganador.setEtiquetaNombreGanador("Felicidades "+nomUsuario1);
            ganador.setVisible(true);
            limpiarVentana();
            cantV1++;
        }
        else if(marcaO20==true && marcaO21==true && marcaO22==true){
            ganador.setEtiquetaNombreGanador("Felicidades "+nomUsuario2);
            ganador.setVisible(true);
            limpiarVentana();
            cantV2++;
        }  
        //-------------------------------------------------------------- 
        else if(marcaX00==true && marcaX11==true && marcaX22==true){ 
            ganador.setEtiquetaNombreGanador("Felicidades "+nomUsuario1);
            ganador.setVisible(true);
            limpiarVentana();
            cantV1++;
        }
        else if(marcaO00==true && marcaO11==true && marcaO22==true){
            ganador.setEtiquetaNombreGanador("Felicidades "+nomUsuario2);
            ganador.setVisible(true);
            limpiarVentana();
            cantV2++;     
        }
        else if(marcaX20==true && marcaX11==true && marcaX02==true){ 
            ganador.setEtiquetaNombreGanador("Felicidades "+nomUsuario1);
            ganador.setVisible(true);
            limpiarVentana();
            cantV1++;
        }
        else if(marcaO20==true && marcaO11==true && marcaO02==true){
            ganador.setEtiquetaNombreGanador("Felicidades "+nomUsuario2);
            ganador.setVisible(true);
            limpiarVentana();
            cantV2++;
        }
        else if(validadorDeEmpate==9){
            empate.setLocationRelativeTo(null);
            empate.setVisible(true); 
            limpiarVentana();
            cantEmp++;
        }
    }
    
    private void reiniciarResultados(){
        cantV1=0;cantV2=0;cantEmp=0;
        limpiarVentana();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        espacio00 = new javax.swing.JButton();
        espacio10 = new javax.swing.JButton();
        espacio20 = new javax.swing.JButton();
        espacio01 = new javax.swing.JButton();
        espacio11 = new javax.swing.JButton();
        espacio21 = new javax.swing.JButton();
        espacio02 = new javax.swing.JButton();
        espacio12 = new javax.swing.JButton();
        espacio22 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        juego = new javax.swing.JMenu();
        itemComenzarDeNuevo = new javax.swing.JMenuItem();
        itemMostrarResultados = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();
        ayuda = new javax.swing.JMenu();
        itemAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        espacio00.setBackground(new java.awt.Color(255, 255, 0));
        espacio00.setPreferredSize(new java.awt.Dimension(150, 150));
        espacio00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                espacio00MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                espacio00MouseReleased(evt);
            }
        });
        espacio00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacio00ActionPerformed(evt);
            }
        });
        jPanel1.add(espacio00, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        espacio10.setBackground(new java.awt.Color(255, 255, 0));
        espacio10.setPreferredSize(new java.awt.Dimension(150, 150));
        espacio10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                espacio10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                espacio10MouseReleased(evt);
            }
        });
        espacio10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacio10ActionPerformed(evt);
            }
        });
        jPanel1.add(espacio10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        espacio20.setBackground(new java.awt.Color(255, 255, 0));
        espacio20.setPreferredSize(new java.awt.Dimension(150, 150));
        espacio20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                espacio20MousePressed(evt);
            }
        });
        espacio20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacio20ActionPerformed(evt);
            }
        });
        jPanel1.add(espacio20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        espacio01.setBackground(new java.awt.Color(255, 255, 0));
        espacio01.setPreferredSize(new java.awt.Dimension(150, 150));
        espacio01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                espacio01MousePressed(evt);
            }
        });
        espacio01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacio01ActionPerformed(evt);
            }
        });
        jPanel1.add(espacio01, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, -1));

        espacio11.setBackground(new java.awt.Color(255, 255, 0));
        espacio11.setPreferredSize(new java.awt.Dimension(150, 150));
        espacio11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                espacio11MousePressed(evt);
            }
        });
        espacio11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacio11ActionPerformed(evt);
            }
        });
        jPanel1.add(espacio11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        espacio21.setBackground(new java.awt.Color(255, 255, 0));
        espacio21.setPreferredSize(new java.awt.Dimension(150, 150));
        espacio21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                espacio21MousePressed(evt);
            }
        });
        espacio21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacio21ActionPerformed(evt);
            }
        });
        jPanel1.add(espacio21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        espacio02.setBackground(new java.awt.Color(255, 255, 0));
        espacio02.setPreferredSize(new java.awt.Dimension(150, 150));
        espacio02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                espacio02MousePressed(evt);
            }
        });
        espacio02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacio02ActionPerformed(evt);
            }
        });
        jPanel1.add(espacio02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        espacio12.setBackground(new java.awt.Color(255, 255, 0));
        espacio12.setPreferredSize(new java.awt.Dimension(150, 150));
        espacio12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                espacio12MousePressed(evt);
            }
        });
        espacio12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacio12ActionPerformed(evt);
            }
        });
        jPanel1.add(espacio12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        espacio22.setBackground(new java.awt.Color(255, 255, 0));
        espacio22.setPreferredSize(new java.awt.Dimension(150, 150));
        espacio22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                espacio22MousePressed(evt);
            }
        });
        espacio22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espacio22ActionPerformed(evt);
            }
        });
        jPanel1.add(espacio22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        juego.setText("Juego");
        juego.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N

        itemComenzarDeNuevo.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        itemComenzarDeNuevo.setText("Comenzar de nuevo");
        itemComenzarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemComenzarDeNuevoActionPerformed(evt);
            }
        });
        juego.add(itemComenzarDeNuevo);

        itemMostrarResultados.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        itemMostrarResultados.setText("Mostrar resultados");
        itemMostrarResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMostrarResultadosActionPerformed(evt);
            }
        });
        juego.add(itemMostrarResultados);

        itemSalir.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        juego.add(itemSalir);

        jMenuBar1.add(juego);

        ayuda.setText("Ayuda");
        ayuda.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N

        itemAyuda.setText("About Tres en raya");
        itemAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAyudaActionPerformed(evt);
            }
        });
        ayuda.add(itemAyuda);

        jMenuBar1.add(ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarVentana(){
        boton00Down=false;boton10Down=false;boton20Down=false;
        boton01Down=false;boton11Down=false;boton21Down=false;
        boton02Down=false;boton12Down=false;boton22Down=false;
        
        marcaX00=false;marcaX10=false;marcaX20=false;
        marcaX01=false;marcaX11=false;marcaX21=false;
        marcaX02=false;marcaX12=false;marcaX22=false;
        marcaO00=false;marcaO10=false;marcaO20=false;
        marcaO01=false;marcaO11=false;marcaO21=false;
        marcaO02=false;marcaO12=false;marcaO22=false;
        
        contador=1;
        validadorDeEmpate=0;
        usuario1=false;
        usuario2=false;
        
        espacio00.setIcon(null);
        espacio10.setIcon(null);
        espacio20.setIcon(null);
        espacio01.setIcon(null);
        espacio11.setIcon(null);
        espacio21.setIcon(null);
        espacio02.setIcon(null);
        espacio12.setIcon(null);
        espacio22.setIcon(null);
        
        quienJuegaPrimero();
    }
    
    private void quienJuegaPrimero(){
        
        ElegirNuevoUsuario cambiarTurno= new ElegirNuevoUsuario(this,true,nomUsuario1,nomUsuario2);
        cambiarTurno.setVisible(true);
        cambiarTurno.setLocationRelativeTo(null);
        turno = cambiarTurno.ElegirQuienJuegaPrimero();
        /*
        if(turno.equals("usuario1")){
            turno=true;
        }else if (turno.equals("usuario2")){
            usuario2=true;
        }*/
        
    }
    private void espacio00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacio00ActionPerformed
        
        if(boton00Down==false){
            nuevoTurno();
            if(turno.equals("")){
                if(activado==false && usuario1==true){
                    espacio00.setIcon(iconoX);
                    activado=true;
                    usuario1=false;
                    contador++;
                    marcaX00=true;   
                }else if (activado==false && usuario2==true){
                    espacio00.setIcon(iconoO);
                    activado=true;
                    usuario2=false;
                    contador++;
                    marcaO00=true;   
                }
            }else if(turno.equals("usuario1")){
                espacio00.setIcon(iconoX);
                activado=true;
                usuario1=false;
                contador++;
                marcaX00=true;
                turno="usuario2";
            }else if(turno.equals("usuario2")){
                espacio00.setIcon(iconoO);
                activado=true;
                usuario2=false;
                contador++;
                marcaO00=true;
                turno="usuario1";
            } 
            boton00Down=true;
            validadorDeEmpate++;
        }
        comprobarGanador();
    }//GEN-LAST:event_espacio00ActionPerformed

    private void espacio00MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_espacio00MouseReleased
  
    }//GEN-LAST:event_espacio00MouseReleased

    private void espacio10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacio10ActionPerformed
        
        if(boton10Down==false){
            nuevoTurno();
            if(turno.equals("")){
                if(activado==false && usuario1==true){
                    espacio10.setIcon(iconoX);
                    activado=true;
                    usuario1=false;
                    contador++;
                    marcaX10=true;   
                }else if (activado==false && usuario2==true){
                    espacio10.setIcon(iconoO);
                    activado=true;
                    usuario2=false;
                    contador++;
                    marcaO10=true;   
                }
            }else if(turno.equals("usuario1")){
                espacio10.setIcon(iconoX);
                activado=true;
                usuario1=false;
                contador++;
                marcaX10=true;
                turno="usuario2";
            }else if(turno.equals("usuario2")){
                espacio10.setIcon(iconoO);
                activado=true;
                usuario2=false;
                contador++;
                marcaO10=true;
                turno="usuario1";
            } 
            boton10Down=true;
            validadorDeEmpate++;
        }
        comprobarGanador();
        
    }//GEN-LAST:event_espacio10ActionPerformed

    private void espacio10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_espacio10MouseReleased
  
    }//GEN-LAST:event_espacio10MouseReleased

    private void espacio00MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_espacio00MousePressed
        
        if(boton00Down==false){
            if(contador%2!=0 && usuario1==false){
                    usuario1=true;             
            }
            else if(contador%2==0 && usuario2==false){
                usuario2=true;
            }
        }  
    }//GEN-LAST:event_espacio00MousePressed

    private void espacio10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_espacio10MousePressed
        
        if(boton10Down==false){
            if(contador%2!=0 && usuario1==false){
                usuario1=true;
            }
            else if(contador%2==0 && usuario2==false){
                usuario2=true;
            }
        }
    }//GEN-LAST:event_espacio10MousePressed

    private void espacio20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacio20ActionPerformed
        if(boton20Down==false){
            nuevoTurno();
            if(turno.equals("")){
                if(activado==false && usuario1==true){
                    espacio20.setIcon(iconoX);
                    activado=true;
                    usuario1=false;
                    contador++;
                    marcaX20=true;   
                }else if (activado==false && usuario2==true){
                    espacio20.setIcon(iconoO);
                    activado=true;
                    usuario2=false;
                    contador++;
                    marcaO20=true;   
                }
            }else if(turno.equals("usuario1")){
                espacio20.setIcon(iconoX);
                activado=true;
                usuario1=false;
                contador++;
                marcaX20=true;
                turno="usuario2";
            }else if(turno.equals("usuario2")){
                espacio20.setIcon(iconoO);
                activado=true;
                usuario2=false;
                contador++;
                marcaO20=true;
                turno="usuario1";
            } 
            boton20Down=true;
            validadorDeEmpate++;
        }
        comprobarGanador();
        
    }//GEN-LAST:event_espacio20ActionPerformed

    private void espacio20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_espacio20MousePressed
        if(boton20Down==false){
            if(contador%2!=0 && usuario1==false){
                usuario1=true;
            }
            else if(contador%2==0 && usuario2==false){
                usuario2=true;
            }
        }
    }//GEN-LAST:event_espacio20MousePressed

    private void espacio01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacio01ActionPerformed
        if(boton01Down==false){
            nuevoTurno();
            if(turno.equals("")){
                if(activado==false && usuario1==true){
                    espacio01.setIcon(iconoX);
                    activado=true;
                    usuario1=false;
                    contador++;
                    marcaX01=true;   
                }else if (activado==false && usuario2==true){
                    espacio01.setIcon(iconoO);
                    activado=true;
                    usuario2=false;
                    contador++;
                    marcaO01=true;   
                }
            }else if(turno.equals("usuario1")){
                espacio01.setIcon(iconoX);
                activado=true;
                usuario1=false;
                contador++;
                marcaX01=true;
                turno="usuario2";
            }else if(turno.equals("usuario2")){
                espacio01.setIcon(iconoO);
                activado=true;
                usuario2=false;
                contador++;
                marcaO01=true;
                turno="usuario1";
            } 
            boton01Down=true;
            validadorDeEmpate++;
        }
        comprobarGanador();
        
    }//GEN-LAST:event_espacio01ActionPerformed

    private void espacio01MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_espacio01MousePressed
        if(boton01Down==false){
            if(contador%2!=0 && usuario1==false){
                usuario1=true;
            }
            else if(contador%2==0 && usuario2==false){
                usuario2=true;
            }
        }
    }//GEN-LAST:event_espacio01MousePressed

    private void espacio11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacio11ActionPerformed
        if(boton11Down==false){
            nuevoTurno();
            if(turno.equals("")){
                if(activado==false && usuario1==true){
                    espacio11.setIcon(iconoX);
                    activado=true;
                    usuario1=false;
                    contador++;
                    marcaX11=true;   
                }else if (activado==false && usuario2==true){
                    espacio11.setIcon(iconoO);
                    activado=true;
                    usuario2=false;
                    contador++;
                    marcaO11=true;   
                }
            }else if(turno.equals("usuario1")){
                espacio11.setIcon(iconoX);
                activado=true;
                usuario1=false;
                contador++;
                marcaX11=true;
                turno="usuario2";
            }else if(turno.equals("usuario2")){
                espacio11.setIcon(iconoO);
                activado=true;
                usuario2=false;
                contador++;
                marcaO11=true;
                turno="usuario1";
            } 
            boton11Down=true;
            validadorDeEmpate++;
        }
        comprobarGanador();
        
    }//GEN-LAST:event_espacio11ActionPerformed

    private void espacio11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_espacio11MousePressed
        if(boton11Down==false){
            if(contador%2!=0 && usuario1==false){
                usuario1=true;
            }
            else if(contador%2==0 && usuario2==false){
                usuario2=true;
            }
        }
    }//GEN-LAST:event_espacio11MousePressed

    private void espacio21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacio21ActionPerformed
        if(boton21Down==false){
            nuevoTurno();
            if(turno.equals("")){
                if(activado==false && usuario1==true){
                    espacio21.setIcon(iconoX);
                    activado=true;
                    usuario1=false;
                    contador++;
                    marcaX21=true;   
                }else if (activado==false && usuario2==true){
                    espacio21.setIcon(iconoO);
                    activado=true;
                    usuario2=false;
                    contador++;
                    marcaO21=true;   
                }
            }else if(turno.equals("usuario1")){
                espacio21.setIcon(iconoX);
                activado=true;
                usuario1=false;
                contador++;
                marcaX21=true;
                turno="usuario2";
            }else if(turno.equals("usuario2")){
                espacio21.setIcon(iconoO);
                activado=true;
                usuario2=false;
                contador++;
                marcaO21=true;
                turno="usuario1";
            } 
            boton21Down=true;
            validadorDeEmpate++;
        }
        comprobarGanador();
        
    }//GEN-LAST:event_espacio21ActionPerformed

    private void espacio21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_espacio21MousePressed
        if(boton21Down==false){
            if(contador%2!=0 && usuario1==false){
                usuario1=true;
            }
            else if(contador%2==0 && usuario2==false){
                usuario2=true;
            }
        }
    }//GEN-LAST:event_espacio21MousePressed

    private void espacio02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacio02ActionPerformed
        if(boton02Down==false){
            nuevoTurno();
            if(turno.equals("")){
                if(activado==false && usuario1==true){
                    espacio02.setIcon(iconoX);
                    activado=true;
                    usuario1=false;
                    contador++;
                    marcaX02=true;   
                }else if (activado==false && usuario2==true){
                    espacio02.setIcon(iconoO);
                    activado=true;
                    usuario2=false;
                    contador++;
                    marcaO02=true;   
                }
            }else if(turno.equals("usuario1")){
                espacio02.setIcon(iconoX);
                activado=true;
                usuario1=false;
                contador++;
                marcaX02=true;
                turno="usuario2";
            }else if(turno.equals("usuario2")){
                espacio02.setIcon(iconoO);
                activado=true;
                usuario2=false;
                contador++;
                marcaO02=true;
                turno="usuario1";
            } 
            boton02Down=true;
            validadorDeEmpate++;
        }
        comprobarGanador();
        
    }//GEN-LAST:event_espacio02ActionPerformed

    private void espacio02MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_espacio02MousePressed
        if(boton02Down==false){
            if(contador%2!=0 && usuario1==false){
                usuario1=true;
            }
            else if(contador%2==0 && usuario2==false){
                usuario2=true;
            }
        }
    }//GEN-LAST:event_espacio02MousePressed

    private void espacio12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacio12ActionPerformed
        if(boton12Down==false){
            nuevoTurno();
            if(turno.equals("")){
                if(activado==false && usuario1==true){
                    espacio12.setIcon(iconoX);
                    activado=true;
                    usuario1=false;
                    contador++;
                    marcaX12=true;   
                }else if (activado==false && usuario2==true){
                    espacio12.setIcon(iconoO);
                    activado=true;
                    usuario2=false;
                    contador++;
                    marcaO12=true;   
                }
            }else if(turno.equals("usuario1")){
                espacio12.setIcon(iconoX);
                activado=true;
                usuario1=false;
                contador++;
                marcaX12=true;
                turno="usuario2";
            }else if(turno.equals("usuario2")){
                espacio12.setIcon(iconoO);
                activado=true;
                usuario2=false;
                contador++;
                marcaO12=true;
                turno="usuario1";
            } 
            boton12Down=true;
            validadorDeEmpate++;
        }
        comprobarGanador();
        
    }//GEN-LAST:event_espacio12ActionPerformed

    private void espacio12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_espacio12MousePressed
        if(boton12Down==false){
            if(contador%2!=0 && usuario1==false){
                usuario1=true;
            }
            else if(contador%2==0 && usuario2==false){
                usuario2=true;
            }
        }
    }//GEN-LAST:event_espacio12MousePressed

    private void espacio22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espacio22ActionPerformed
        if(boton22Down==false){
            nuevoTurno();
            if(turno.equals("")){
                if(activado==false && usuario1==true){
                    espacio22.setIcon(iconoX);
                    activado=true;
                    usuario1=false;
                    contador++;
                    marcaX22=true;   
                }else if (activado==false && usuario2==true){
                    espacio22.setIcon(iconoO);
                    activado=true;
                    usuario2=false;
                    contador++;
                    marcaO22=true;   
                }
            }else if(turno.equals("usuario1")){
                espacio22.setIcon(iconoX);
                activado=true;
                usuario1=false;
                contador++;
                marcaX22=true;
                turno="usuario2";
            }else if(turno.equals("usuario2")){
                espacio22.setIcon(iconoO);
                activado=true;
                usuario2=false;
                contador++;
                marcaO22=true;
                turno="usuario1";
            } 
            boton22Down=true;
            validadorDeEmpate++;
        }
        comprobarGanador();
        
    }//GEN-LAST:event_espacio22ActionPerformed

    private void espacio22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_espacio22MousePressed
        if(boton22Down==false){
            if(contador%2!=0 && usuario1==false){
                usuario1=true;
            }
            else if(contador%2==0 && usuario2==false){
                usuario2=true;
            }
        }
    }//GEN-LAST:event_espacio22MousePressed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void itemComenzarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemComenzarDeNuevoActionPerformed
        reiniciarResultados();
    }//GEN-LAST:event_itemComenzarDeNuevoActionPerformed

    private void itemMostrarResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMostrarResultadosActionPerformed
        Resultados resultado=new Resultados(this,true,nomUsuario1,nomUsuario2, cantV1,cantV2,cantEmp);
        resultado.setLocationRelativeTo(null);
        resultado.setVisible(true);
    }//GEN-LAST:event_itemMostrarResultadosActionPerformed

    private void itemAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAyudaActionPerformed
        try {
            try {
                Desktop.getDesktop().browse(new URI("https://es.wikipedia.org/wiki/Tres_en_l%C3%ADnea"));
            } catch (IOException ex) {
                //Logger.getLogger(VentanaDelJuego.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            //Logger.getLogger(VentanaDelJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_itemAyudaActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void nuevoTurno(){
        activado=false;
    }
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDelJuego (null,null).setVisible(true);
            }
        }); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ayuda;
    private javax.swing.JButton espacio00;
    private javax.swing.JButton espacio01;
    private javax.swing.JButton espacio02;
    private javax.swing.JButton espacio10;
    private javax.swing.JButton espacio11;
    private javax.swing.JButton espacio12;
    private javax.swing.JButton espacio20;
    private javax.swing.JButton espacio21;
    private javax.swing.JButton espacio22;
    private javax.swing.JMenuItem itemAyuda;
    private javax.swing.JMenuItem itemComenzarDeNuevo;
    private javax.swing.JMenuItem itemMostrarResultados;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu juego;
    // End of variables declaration//GEN-END:variables
}
