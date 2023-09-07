/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Codigo;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private String nomUsuario1,nomUsuario2;
    
    
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        botonComenzar.setVisible(false);
        etiquetaAsignacionUsuario1.setVisible(false);
        etiquetaAsignacionUsuario2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel = new javax.swing.JPanel();
        etiquetaPrincipalTresEnRaya = new javax.swing.JLabel();
        etiquteaUsuario1 = new javax.swing.JLabel();
        cajaTextoUsuario1 = new javax.swing.JTextField();
        etiquteaUsuario2 = new javax.swing.JLabel();
        cajaTextoUsuario2 = new javax.swing.JTextField();
        etiquetaImagenGif = new javax.swing.JLabel();
        etiquetaAsignacionUsuario1 = new javax.swing.JLabel();
        etiquetaAsignacionUsuario2 = new javax.swing.JLabel();
        botonComenzar = new javax.swing.JButton();
        botonGuardarUsuarios = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        itemSalir = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        paginaAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tres en Raya");

        panel.setBackground(new java.awt.Color(255, 255, 0));
        panel.setLayout(new java.awt.GridBagLayout());

        etiquetaPrincipalTresEnRaya.setFont(new java.awt.Font("Segoe Script", 1, 56)); // NOI18N
        etiquetaPrincipalTresEnRaya.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaPrincipalTresEnRaya.setText("Tres en Raya");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 100, 0, 100);
        panel.add(etiquetaPrincipalTresEnRaya, gridBagConstraints);

        etiquteaUsuario1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        etiquteaUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquteaUsuario1.setText("Digite el Nombre del Usuario 1 :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(50, 50, 0, 0);
        panel.add(etiquteaUsuario1, gridBagConstraints);

        cajaTextoUsuario1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 50);
        panel.add(cajaTextoUsuario1, gridBagConstraints);

        etiquteaUsuario2.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        etiquteaUsuario2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquteaUsuario2.setText("Digite el Nombre del Usuario 2 :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 50, 0, 0);
        panel.add(etiquteaUsuario2, gridBagConstraints);

        cajaTextoUsuario2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 50);
        panel.add(cajaTextoUsuario2, gridBagConstraints);

        etiquetaImagenGif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gifTresEnRaya.gif"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 50, 20);
        panel.add(etiquetaImagenGif, gridBagConstraints);

        etiquetaAsignacionUsuario1.setBackground(new java.awt.Color(0, 0, 0));
        etiquetaAsignacionUsuario1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        etiquetaAsignacionUsuario1.setText("Usuario 1 jugara primero, su ficha es X");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(60, 50, 0, 0);
        panel.add(etiquetaAsignacionUsuario1, gridBagConstraints);

        etiquetaAsignacionUsuario2.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        etiquetaAsignacionUsuario2.setText("Usuario 2 su ficha es O");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 0, 0);
        panel.add(etiquetaAsignacionUsuario2, gridBagConstraints);

        botonComenzar.setBackground(new java.awt.Color(0, 0, 0));
        botonComenzar.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        botonComenzar.setForeground(new java.awt.Color(255, 255, 255));
        botonComenzar.setText("Empezar Juego");
        botonComenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComenzarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 50, 50, 100);
        panel.add(botonComenzar, gridBagConstraints);

        botonGuardarUsuarios.setBackground(new java.awt.Color(0, 0, 0));
        botonGuardarUsuarios.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        botonGuardarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardarUsuarios.setText("Guardar");
        botonGuardarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarUsuariosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 50, 0, 100);
        panel.add(botonGuardarUsuarios, gridBagConstraints);

        barraMenu.setBackground(new java.awt.Color(204, 204, 204));
        barraMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        menu1.setText("Juego");
        menu1.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N

        itemSalir.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menu1.add(itemSalir);

        barraMenu.add(menu1);

        menu2.setText("Ayuda");
        menu2.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N

        paginaAyuda.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        paginaAyuda.setText("About Tres en raya");
        paginaAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paginaAyudaMouseClicked(evt);
            }
        });
        paginaAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paginaAyudaActionPerformed(evt);
            }
        });
        menu2.add(paginaAyuda);

        barraMenu.add(menu2);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarUsuariosActionPerformed
        nomUsuario1=cajaTextoUsuario1.getText();
        nomUsuario2=cajaTextoUsuario2.getText();
        
        etiquetaAsignacionUsuario1.setText("Usuario "+nomUsuario1.toUpperCase()+" jugara primero, su ficha es X");
        etiquetaAsignacionUsuario2.setText("Usuario "+nomUsuario2.toUpperCase()+ " su ficha es O ");
        etiquetaAsignacionUsuario1.setVisible(true);
        etiquetaAsignacionUsuario2.setVisible(true);
        botonComenzar.setVisible(true);
        botonGuardarUsuarios.setVisible(false);
        //cajaTextoUsuario1.setText("");
        //cajaTextoUsuario2.setText("");
        cajaTextoUsuario1.setEnabled(false);
        cajaTextoUsuario2.setEnabled(false);
    }//GEN-LAST:event_botonGuardarUsuariosActionPerformed

    private void botonComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComenzarActionPerformed
        VentanaDelJuego ventanaJuego= new VentanaDelJuego(nomUsuario1,nomUsuario2);
        ventanaJuego.setVisible(true);
        dispose();
        ventanaJuego.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_botonComenzarActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    private void paginaAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paginaAyudaMouseClicked

    }//GEN-LAST:event_paginaAyudaMouseClicked

    private void paginaAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginaAyudaActionPerformed
        try {
            try {
                Desktop.getDesktop().browse(new URI("https://es.wikipedia.org/wiki/Tres_en_l%C3%ADnea"));
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (URISyntaxException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_paginaAyudaActionPerformed

    /**
     * @param args the command line arguments
     */
    public String getTextoCajaTextoUsuario1 (){
        String texto;
        texto= cajaTextoUsuario1.getText();
        return texto;
    }
    public String getTextoCajaTextoUsuario2 (){
        String texto;
        texto= cajaTextoUsuario2.getText();
        return texto;
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botonComenzar;
    private javax.swing.JButton botonGuardarUsuarios;
    private javax.swing.JTextField cajaTextoUsuario1;
    private javax.swing.JTextField cajaTextoUsuario2;
    private javax.swing.JLabel etiquetaAsignacionUsuario1;
    private javax.swing.JLabel etiquetaAsignacionUsuario2;
    private javax.swing.JLabel etiquetaImagenGif;
    private javax.swing.JLabel etiquetaPrincipalTresEnRaya;
    private javax.swing.JLabel etiquteaUsuario1;
    private javax.swing.JLabel etiquteaUsuario2;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenuItem paginaAyuda;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
