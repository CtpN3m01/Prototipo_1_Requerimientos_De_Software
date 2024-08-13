/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import javax.swing.ImageIcon;

/**
 *
 * @author saimo
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenuPrincipal = new javax.swing.JPanel();
        Boton_Configurar_Sistema = new javax.swing.JButton();
        Boton_Iniciar_Programa = new javax.swing.JButton();
        Boton_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenuPrincipal.setBackground(new java.awt.Color(204, 204, 204));

        Boton_Configurar_Sistema.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        Boton_Configurar_Sistema.setText("Configuración");
        Boton_Configurar_Sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Configurar_SistemaActionPerformed(evt);
            }
        });

        Boton_Iniciar_Programa.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        Boton_Iniciar_Programa.setText("Iniciar Programa");
        Boton_Iniciar_Programa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Boton_Iniciar_ProgramaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton_Iniciar_ProgramaMouseExited(evt);
            }
        });
        Boton_Iniciar_Programa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_Iniciar_ProgramaActionPerformed(evt);
            }
        });

        Boton_Salir.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        Boton_Salir.setText("Salir");
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuPrincipalLayout = new javax.swing.GroupLayout(jPanelMenuPrincipal);
        jPanelMenuPrincipal.setLayout(jPanelMenuPrincipalLayout);
        jPanelMenuPrincipalLayout.setHorizontalGroup(
            jPanelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuPrincipalLayout.createSequentialGroup()
                        .addGap(481, 481, 481)
                        .addGroup(jPanelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton_Iniciar_Programa, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelMenuPrincipalLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(Boton_Configurar_Sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelMenuPrincipalLayout.createSequentialGroup()
                        .addGap(578, 578, 578)
                        .addComponent(Boton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(543, Short.MAX_VALUE))
        );
        jPanelMenuPrincipalLayout.setVerticalGroup(
            jPanelMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuPrincipalLayout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(Boton_Iniciar_Programa, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton_Configurar_Sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_Configurar_SistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Configurar_SistemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_Configurar_SistemaActionPerformed

    private void Boton_Iniciar_ProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_Iniciar_ProgramaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_Iniciar_ProgramaActionPerformed

    private void Boton_Iniciar_ProgramaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Iniciar_ProgramaMouseEntered
       //Boton_Iniciar_Programa.setIcon(new javax.swing.ImageIcon("C:\\Users\\saimo\\Documents\\GitHub\\Prototipo_1_Requerimientos_De_Software\\Prototipo1\\src\\main\\java\\imagenes\\engranaje-40.png"));
    }//GEN-LAST:event_Boton_Iniciar_ProgramaMouseEntered

    private void Boton_Iniciar_ProgramaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_Iniciar_ProgramaMouseExited
        //Boton_Iniciar_Programa.setIcon(new javax.swing.ImageIcon("C:\\Users\\saimo\\Documents\\GitHub\\Prototipo_1_Requerimientos_De_Software\\Prototipo1\\src\\main\\java\\imagenes\\engranaje-35.png"));
    }//GEN-LAST:event_Boton_Iniciar_ProgramaMouseExited

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Boton_SalirActionPerformed
    
    private void showJPanel() {
    
    
    
    
    }
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Configurar_Sistema;
    private javax.swing.JButton Boton_Iniciar_Programa;
    private javax.swing.JButton Boton_Salir;
    private javax.swing.JPanel jPanelMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
