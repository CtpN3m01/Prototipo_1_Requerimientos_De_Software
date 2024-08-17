package Ventanas;

import Funcionamientos.ElevadorEstado;
import static Ventanas.MenuPrincipal.ElevadorPorDentroVentana;
import static Ventanas.MenuPrincipal.ElevadorPorFueraVentana;
import static Ventanas.MenuPrincipal.MenuInicioVentana;

public class ElevadorPorDentro extends javax.swing.JPanel {

    public ElevadorPorDentro() {
        initComponents();
        ContadorPisos.setText(ElevadorEstado.getPisoActual());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AscensorPanel = new javax.swing.JPanel();
        PuertaAdentro_Izquierda = new javax.swing.JPanel();
        PuertaAdentro_Derecha = new javax.swing.JPanel();
        Panel_Botones = new javax.swing.JPanel();
        Boton_P2 = new javax.swing.JButton();
        Boton_S1 = new javax.swing.JButton();
        Boton_P1 = new javax.swing.JButton();
        Boton_P3 = new javax.swing.JButton();
        Boton_Abrir = new javax.swing.JButton();
        Boton_SOS = new javax.swing.JButton();
        Boton_Cerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ContadorPisos = new javax.swing.JLabel();
        Letrero = new javax.swing.JButton();
        EscanerTarjeta = new javax.swing.JButton();
        Boton_VerAscensorPorFuera = new javax.swing.JButton();

        setBackground(new java.awt.Color(166, 166, 166));
        setLayout(null);

        AscensorPanel.setBackground(new java.awt.Color(255, 255, 255));
        AscensorPanel.setLayout(null);

        PuertaAdentro_Izquierda.setBackground(new java.awt.Color(217, 217, 217));

        javax.swing.GroupLayout PuertaAdentro_IzquierdaLayout = new javax.swing.GroupLayout(PuertaAdentro_Izquierda);
        PuertaAdentro_Izquierda.setLayout(PuertaAdentro_IzquierdaLayout);
        PuertaAdentro_IzquierdaLayout.setHorizontalGroup(
            PuertaAdentro_IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );
        PuertaAdentro_IzquierdaLayout.setVerticalGroup(
            PuertaAdentro_IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        AscensorPanel.add(PuertaAdentro_Izquierda);
        PuertaAdentro_Izquierda.setBounds(0, 0, 272, 650);

        PuertaAdentro_Derecha.setBackground(new java.awt.Color(217, 217, 217));

        javax.swing.GroupLayout PuertaAdentro_DerechaLayout = new javax.swing.GroupLayout(PuertaAdentro_Derecha);
        PuertaAdentro_Derecha.setLayout(PuertaAdentro_DerechaLayout);
        PuertaAdentro_DerechaLayout.setHorizontalGroup(
            PuertaAdentro_DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );
        PuertaAdentro_DerechaLayout.setVerticalGroup(
            PuertaAdentro_DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        AscensorPanel.add(PuertaAdentro_Derecha);
        PuertaAdentro_Derecha.setBounds(278, 0, 272, 650);

        add(AscensorPanel);
        AscensorPanel.setBounds(380, 100, 550, 650);

        Panel_Botones.setBackground(new java.awt.Color(115, 115, 115));
        Panel_Botones.setLayout(null);

        Boton_P2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonP2Apagado.png"))); // NOI18N
        Boton_P2.setBorderPainted(false);
        Boton_P2.setContentAreaFilled(false);
        Boton_P2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_P2.setFocusPainted(false);
        Boton_P2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_P2ActionPerformed(evt);
            }
        });
        Panel_Botones.add(Boton_P2);
        Boton_P2.setBounds(10, 100, 70, 59);

        Boton_S1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonS1Apagado.png"))); // NOI18N
        Boton_S1.setBorderPainted(false);
        Boton_S1.setContentAreaFilled(false);
        Boton_S1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_S1.setFocusPainted(false);
        Boton_S1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_S1ActionPerformed(evt);
            }
        });
        Panel_Botones.add(Boton_S1);
        Boton_S1.setBounds(10, 240, 70, 59);

        Boton_P1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonP1Apagado.png"))); // NOI18N
        Boton_P1.setBorderPainted(false);
        Boton_P1.setContentAreaFilled(false);
        Boton_P1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_P1.setFocusPainted(false);
        Boton_P1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_P1ActionPerformed(evt);
            }
        });
        Panel_Botones.add(Boton_P1);
        Boton_P1.setBounds(10, 170, 70, 59);

        Boton_P3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonP3Apagado.png"))); // NOI18N
        Boton_P3.setBorderPainted(false);
        Boton_P3.setContentAreaFilled(false);
        Boton_P3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_P3.setFocusPainted(false);
        Boton_P3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_P3MouseClicked(evt);
            }
        });
        Boton_P3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_P3ActionPerformed(evt);
            }
        });
        Panel_Botones.add(Boton_P3);
        Boton_P3.setBounds(10, 30, 70, 59);

        add(Panel_Botones);
        Panel_Botones.setBounds(980, 240, 90, 330);

        Boton_Abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAbrirApagado.png"))); // NOI18N
        Boton_Abrir.setBorderPainted(false);
        Boton_Abrir.setContentAreaFilled(false);
        Boton_Abrir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Abrir.setFocusPainted(false);
        Boton_Abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AbrirActionPerformed(evt);
            }
        });
        add(Boton_Abrir);
        Boton_Abrir.setBounds(1100, 410, 70, 58);

        Boton_SOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonSOSGrande.png"))); // NOI18N
        Boton_SOS.setBorderPainted(false);
        Boton_SOS.setContentAreaFilled(false);
        Boton_SOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_SOS.setFocusPainted(false);
        Boton_SOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Boton_SOSMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Boton_SOSMouseReleased(evt);
            }
        });
        Boton_SOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SOSActionPerformed(evt);
            }
        });
        add(Boton_SOS);
        Boton_SOS.setBounds(1100, 270, 70, 60);

        Boton_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonCerrarApagado.png"))); // NOI18N
        Boton_Cerrar.setBorderPainted(false);
        Boton_Cerrar.setContentAreaFilled(false);
        Boton_Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Cerrar.setFocusPainted(false);
        Boton_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CerrarActionPerformed(evt);
            }
        });
        add(Boton_Cerrar);
        Boton_Cerrar.setBounds(1100, 340, 70, 58);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        ContadorPisos.setBackground(new java.awt.Color(255, 0, 0));
        ContadorPisos.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        ContadorPisos.setForeground(new java.awt.Color(255, 0, 0));
        ContadorPisos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ContadorPisos.setText("S1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContadorPisos, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ContadorPisos, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        add(jPanel2);
        jPanel2.setBounds(980, 110, 90, 90);

        Letrero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cartel6Personas.png"))); // NOI18N
        Letrero.setBorderPainted(false);
        Letrero.setContentAreaFilled(false);
        Letrero.setFocusPainted(false);
        add(Letrero);
        Letrero.setBounds(50, 50, 220, 140);

        EscanerTarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/DetectorTarjeta.png"))); // NOI18N
        EscanerTarjeta.setBorderPainted(false);
        EscanerTarjeta.setContentAreaFilled(false);
        EscanerTarjeta.setFocusPainted(false);
        add(EscanerTarjeta);
        EscanerTarjeta.setBounds(1080, 470, 120, 90);

        Boton_VerAscensorPorFuera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ascensorPorFuera-50.png"))); // NOI18N
        Boton_VerAscensorPorFuera.setBorderPainted(false);
        Boton_VerAscensorPorFuera.setContentAreaFilled(false);
        Boton_VerAscensorPorFuera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_VerAscensorPorFuera.setFocusPainted(false);
        Boton_VerAscensorPorFuera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Boton_VerAscensorPorFueraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Boton_VerAscensorPorFueraMouseExited(evt);
            }
        });
        Boton_VerAscensorPorFuera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_VerAscensorPorFueraActionPerformed(evt);
            }
        });
        add(Boton_VerAscensorPorFuera);
        Boton_VerAscensorPorFuera.setBounds(310, 90, 60, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_P2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_P2ActionPerformed
        String piso="2";
        ContadorPisos.setText(piso);
        Funcionamientos.ElevadorEstado.setPisoActual(piso);
        ElevadorPorFueraVentana.actualizarContadorPisos();  // Llama al método en ElevadorPorFuera
        Boton_P2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonP2Prendido.png")));
    }//GEN-LAST:event_Boton_P2ActionPerformed

    private void Boton_P1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_P1ActionPerformed
        String piso="1";
        ContadorPisos.setText(piso);
        Funcionamientos.ElevadorEstado.setPisoActual(piso);
        ElevadorPorFueraVentana.actualizarContadorPisos();  // Llama al método en ElevadorPorFuera
        Boton_P1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonP1Prendido.png")));
    }//GEN-LAST:event_Boton_P1ActionPerformed

    private void Boton_S1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_S1ActionPerformed
        String piso="S1";
        ContadorPisos.setText(piso);
        Funcionamientos.ElevadorEstado.setPisoActual(piso);
        ElevadorPorFueraVentana.actualizarContadorPisos();  // Llama al método en ElevadorPorFuera
        Boton_S1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonS1Prendido.png")));
    }//GEN-LAST:event_Boton_S1ActionPerformed

    private void Boton_AbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AbrirActionPerformed
        Boton_Abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonAbrirPrendido.png")));
        abrirElevador();
    }//GEN-LAST:event_Boton_AbrirActionPerformed

    private void Boton_P3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_P3ActionPerformed
        String piso="3";
        ContadorPisos.setText(piso);
        Funcionamientos.ElevadorEstado.setPisoActual(piso);
        ElevadorPorFueraVentana.actualizarContadorPisos();  // Llama al método en ElevadorPorFuera
        Boton_P3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonP3Prendido.png")));
    }//GEN-LAST:event_Boton_P3ActionPerformed

    private void Boton_SOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SOSActionPerformed
        
    }//GEN-LAST:event_Boton_SOSActionPerformed

    private void Boton_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CerrarActionPerformed
        Boton_Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonCerrarPrendido.png")));
        cerrarElevador();
        
    }//GEN-LAST:event_Boton_CerrarActionPerformed

    private void Boton_P3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_P3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_P3MouseClicked

    private void Boton_SOSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_SOSMousePressed
        Boton_SOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonSOSPequeño.png")));
    }//GEN-LAST:event_Boton_SOSMousePressed

    private void Boton_SOSMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_SOSMouseReleased
        Boton_SOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonSOSGrande.png")));
    }//GEN-LAST:event_Boton_SOSMouseReleased

    private void Boton_VerAscensorPorFueraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_VerAscensorPorFueraMouseEntered
        Boton_VerAscensorPorFuera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ascensorPorFuera-45.png")));
    }//GEN-LAST:event_Boton_VerAscensorPorFueraMouseEntered

    private void Boton_VerAscensorPorFueraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_VerAscensorPorFueraMouseExited
        Boton_VerAscensorPorFuera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ascensorPorFuera-50.png")));
    }//GEN-LAST:event_Boton_VerAscensorPorFueraMouseExited

    private void Boton_VerAscensorPorFueraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_VerAscensorPorFueraActionPerformed
        ElevadorPorDentroVentana.setVisible(false);
        ElevadorPorFueraVentana.setVisible(true);
        MenuInicioVentana.setVisible(false);
    }//GEN-LAST:event_Boton_VerAscensorPorFueraActionPerformed
    
    private void abrirElevador(){
        Animacion.Animacion.mover_derecha(275, 525, 15, 5, PuertaAdentro_Derecha);
        Animacion.Animacion.mover_izquierda(0, -245, 15, 5, PuertaAdentro_Izquierda);
    }
    
    private void cerrarElevador(){
        Animacion.Animacion.mover_izquierda(525, 280, 13, 5, PuertaAdentro_Derecha);
        Animacion.Animacion.mover_derecha(-180, 0, 15, 5, PuertaAdentro_Izquierda);
    }
    public void actualizarContadorPisos(String piso) {
    ContadorPisos.setText(piso);
}
    public String obtenerPisoActual() {
        return ContadorPisos.getText();
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AscensorPanel;
    private javax.swing.JButton Boton_Abrir;
    private javax.swing.JButton Boton_Cerrar;
    private javax.swing.JButton Boton_P1;
    private javax.swing.JButton Boton_P2;
    private javax.swing.JButton Boton_P3;
    private javax.swing.JButton Boton_S1;
    private javax.swing.JButton Boton_SOS;
    private javax.swing.JButton Boton_VerAscensorPorFuera;
    private javax.swing.JLabel ContadorPisos;
    private javax.swing.JButton EscanerTarjeta;
    private javax.swing.JButton Letrero;
    private javax.swing.JPanel Panel_Botones;
    private javax.swing.JPanel PuertaAdentro_Derecha;
    private javax.swing.JPanel PuertaAdentro_Izquierda;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
