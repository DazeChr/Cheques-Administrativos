package Formulario_Vista_Controlador;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Menu_ChequesAdmin_FRM extends javax.swing.JFrame {
    
    
    ChequeAdministrativo_SDMensual_IFRM CA_SDM_IFRM = null;
    ChequeAdministrativo_Aguinaldo_IFRM CA_AG_IFRM = null;
    ChequeAdministrativo_PrimaVacacional_IFRM CA_PV_IFRM = null;
    ChequeAdministrativo_HorasExtras_IFRM CA_HE_IFRM = null;
    ChequeAdministrativo_Liquidacion_IFRM CA_LI_IFRM = null;
    //==============================================================
    Visualizar_Modelado_IFRM Visualizar_Modelado_IFRM = null;
    //==============================================================
    SDM_Ayuda_IFRM SDM_Ayuda_IFRM = null;
    AG_Ayuda_IFRM AG_Ayuda_IFRM = null;
    PV_Ayuda_IFRM PV_Ayuda_IFRM = null;
    HE_Ayuda_IFRM HE_Ayuda_IFRM = null;
    Liquidacion_Ayuda_IFRM L_Ayuda_IFRM = null;
    //==============================================================
    AboutDevs_IFRM AboutDevs_IFRM = null;

    
    public Menu_ChequesAdmin_FRM() {
        initComponents();
        
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/F2.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        SueldoMensual = new javax.swing.JMenuItem();
        Aguinaldo = new javax.swing.JMenuItem();
        PrimaVacacional = new javax.swing.JMenuItem();
        HorasExtras = new javax.swing.JMenuItem();
        Liquidacion = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Visualizar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        SD_Ayuda = new javax.swing.JMenuItem();
        Ag_Ayuda = new javax.swing.JMenuItem();
        PV_Ayuda = new javax.swing.JMenuItem();
        HE_Ayuda = new javax.swing.JMenuItem();
        Liquidacion_Ayuda = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Creadores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cheques Administrativos");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 919, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cheques");

        SueldoMensual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        SueldoMensual.setText("Sueldo Mensual");
        SueldoMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SueldoMensualActionPerformed(evt);
            }
        });
        jMenu2.add(SueldoMensual);

        Aguinaldo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Aguinaldo.setText("Aguinaldo");
        Aguinaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AguinaldoActionPerformed(evt);
            }
        });
        jMenu2.add(Aguinaldo);

        PrimaVacacional.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        PrimaVacacional.setText("Prima Vacacional");
        PrimaVacacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimaVacacionalActionPerformed(evt);
            }
        });
        jMenu2.add(PrimaVacacional);

        HorasExtras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        HorasExtras.setText("Horas Extras");
        HorasExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorasExtrasActionPerformed(evt);
            }
        });
        jMenu2.add(HorasExtras);

        Liquidacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Liquidacion.setText("Liquidación");
        Liquidacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LiquidacionActionPerformed(evt);
            }
        });
        jMenu2.add(Liquidacion);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Modelado");

        Visualizar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Visualizar.setText("Visualizar");
        Visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarActionPerformed(evt);
            }
        });
        jMenu3.add(Visualizar);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ayuda");

        SD_Ayuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        SD_Ayuda.setText("Sueldo Mensual");
        SD_Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SD_AyudaActionPerformed(evt);
            }
        });
        jMenu4.add(SD_Ayuda);

        Ag_Ayuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Ag_Ayuda.setText("Aguinaldo");
        Ag_Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ag_AyudaActionPerformed(evt);
            }
        });
        jMenu4.add(Ag_Ayuda);

        PV_Ayuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        PV_Ayuda.setText("Prima Vacacional");
        PV_Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PV_AyudaActionPerformed(evt);
            }
        });
        jMenu4.add(PV_Ayuda);

        HE_Ayuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        HE_Ayuda.setText("Horas Extras");
        HE_Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HE_AyudaActionPerformed(evt);
            }
        });
        jMenu4.add(HE_Ayuda);

        Liquidacion_Ayuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Liquidacion_Ayuda.setText("Liquidación");
        Liquidacion_Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Liquidacion_AyudaActionPerformed(evt);
            }
        });
        jMenu4.add(Liquidacion_Ayuda);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Desarrolladores");

        Creadores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_QUOTE, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Creadores.setText("Creadores");
        Creadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreadoresActionPerformed(evt);
            }
        });
        jMenu5.add(Creadores);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void SueldoMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SueldoMensualActionPerformed
        CA_SDM_IFRM = new ChequeAdministrativo_SDMensual_IFRM();
        Iniciar_Ventana(CA_SDM_IFRM);
    }//GEN-LAST:event_SueldoMensualActionPerformed

    private void AguinaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AguinaldoActionPerformed
        CA_AG_IFRM = new ChequeAdministrativo_Aguinaldo_IFRM();
        Iniciar_Ventana(CA_AG_IFRM);
    }//GEN-LAST:event_AguinaldoActionPerformed

    private void PrimaVacacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimaVacacionalActionPerformed
        CA_PV_IFRM = new ChequeAdministrativo_PrimaVacacional_IFRM();
        Iniciar_Ventana(CA_PV_IFRM);
    }//GEN-LAST:event_PrimaVacacionalActionPerformed

    private void HorasExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorasExtrasActionPerformed
        CA_HE_IFRM = new ChequeAdministrativo_HorasExtras_IFRM();
        Iniciar_Ventana(CA_HE_IFRM);
    }//GEN-LAST:event_HorasExtrasActionPerformed

    private void LiquidacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LiquidacionActionPerformed
        CA_LI_IFRM = new ChequeAdministrativo_Liquidacion_IFRM();
        Iniciar_Ventana(CA_LI_IFRM);
    }//GEN-LAST:event_LiquidacionActionPerformed

    private void VisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarActionPerformed
        Visualizar_Modelado_IFRM = new Visualizar_Modelado_IFRM();
        Iniciar_Ventana(Visualizar_Modelado_IFRM);
    }//GEN-LAST:event_VisualizarActionPerformed

    private void SD_AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SD_AyudaActionPerformed
        SDM_Ayuda_IFRM = new SDM_Ayuda_IFRM();
        Iniciar_Ventana(SDM_Ayuda_IFRM);
    }//GEN-LAST:event_SD_AyudaActionPerformed

    private void Ag_AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ag_AyudaActionPerformed
        AG_Ayuda_IFRM = new AG_Ayuda_IFRM();
        Iniciar_Ventana(AG_Ayuda_IFRM);
    }//GEN-LAST:event_Ag_AyudaActionPerformed

    private void PV_AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PV_AyudaActionPerformed
        PV_Ayuda_IFRM = new PV_Ayuda_IFRM();
        Iniciar_Ventana(PV_Ayuda_IFRM);
    }//GEN-LAST:event_PV_AyudaActionPerformed

    private void HE_AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HE_AyudaActionPerformed
        HE_Ayuda_IFRM = new HE_Ayuda_IFRM();
        Iniciar_Ventana(HE_Ayuda_IFRM);
    }//GEN-LAST:event_HE_AyudaActionPerformed

    private void Liquidacion_AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Liquidacion_AyudaActionPerformed
        L_Ayuda_IFRM = new Liquidacion_Ayuda_IFRM();
        Iniciar_Ventana(L_Ayuda_IFRM);
    }//GEN-LAST:event_Liquidacion_AyudaActionPerformed

    private void CreadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreadoresActionPerformed
        AboutDevs_IFRM = new AboutDevs_IFRM();
        Iniciar_Ventana(AboutDevs_IFRM);
    }//GEN-LAST:event_CreadoresActionPerformed

    //===============================================================================
    private void Iniciar_Ventana(Component Objeto_FRM) {
        jDesktopPane1.add(Objeto_FRM);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = Objeto_FRM.getSize();
        Objeto_FRM.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        Objeto_FRM.setVisible(true);
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
            java.util.logging.Logger.getLogger(Menu_ChequesAdmin_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_ChequesAdmin_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_ChequesAdmin_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_ChequesAdmin_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_ChequesAdmin_FRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ag_Ayuda;
    private javax.swing.JMenuItem Aguinaldo;
    private javax.swing.JMenuItem Creadores;
    private javax.swing.JMenuItem HE_Ayuda;
    private javax.swing.JMenuItem HorasExtras;
    private javax.swing.JMenuItem Liquidacion;
    private javax.swing.JMenuItem Liquidacion_Ayuda;
    private javax.swing.JMenuItem PV_Ayuda;
    private javax.swing.JMenuItem PrimaVacacional;
    private javax.swing.JMenuItem SD_Ayuda;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem SueldoMensual;
    private javax.swing.JMenuItem Visualizar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}