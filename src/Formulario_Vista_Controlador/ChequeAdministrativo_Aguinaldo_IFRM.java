package Formulario_Vista_Controlador;

import Clases_Modelo.ChequeAdministrativo_Aguinaldo_Clase_Derivada;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco Tarazon
 */
public class ChequeAdministrativo_Aguinaldo_IFRM extends javax.swing.JInternalFrame {

    //Objeto para formatear la impresión de resultados
    public static DecimalFormat Decf = new DecimalFormat("#,###.00");
    
    ChequeAdministrativo_Aguinaldo_Clase_Derivada Obj_Aguinaldo;
    
    /**
     * Creates new form ChequeAdministrativo_Aguinaldo_IFRM
     */
    public ChequeAdministrativo_Aguinaldo_IFRM() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Banner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Escritorio = new javax.swing.JPanel();
        Anos_Trabajados = new javax.swing.JLabel();
        Sueldo_Diario = new javax.swing.JLabel();
        Horas_Extras = new javax.swing.JLabel();
        SD = new javax.swing.JTextField();
        DT = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Sueldo_Diario1 = new javax.swing.JLabel();
        Sueldo_Diario2 = new javax.swing.JLabel();
        Depto = new javax.swing.JTextField();
        Puesto = new javax.swing.JTextField();
        Sueldo_Diario3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Impresion = new javax.swing.JTextArea();
        Calcular = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cheque Administrativo de Aguinaldo");

        Banner.setBackground(new java.awt.Color(25, 57, 183));
        Banner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Cocogoose", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AGUINALDO");
        Banner.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 910, 50));

        Escritorio.setBackground(new java.awt.Color(214, 228, 255));
        Escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Anos_Trabajados.setFont(new java.awt.Font("Cocogoose", 1, 18)); // NOI18N
        Anos_Trabajados.setForeground(new java.awt.Color(25, 57, 183));
        Anos_Trabajados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Anos_Trabajados.setText("DIAS TRABAJADOS.:");
        Anos_Trabajados.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Escritorio.add(Anos_Trabajados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 280, 40));

        Sueldo_Diario.setFont(new java.awt.Font("Cocogoose", 1, 18)); // NOI18N
        Sueldo_Diario.setForeground(new java.awt.Color(25, 57, 183));
        Sueldo_Diario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Sueldo_Diario.setText("SUELDO DIARIO.:");
        Sueldo_Diario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Escritorio.add(Sueldo_Diario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 220, 40));

        Horas_Extras.setFont(new java.awt.Font("Cocogoose", 1, 18)); // NOI18N
        Horas_Extras.setForeground(new java.awt.Color(25, 57, 183));
        Horas_Extras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Horas_Extras.setText("AGUINALDO:");
        Horas_Extras.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Escritorio.add(Horas_Extras, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 260, 40));

        SD.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        SD.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        SD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SDKeyTyped(evt);
            }
        });
        Escritorio.add(SD, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 260, 30));

        DT.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        DT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        DT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DTKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DTKeyTyped(evt);
            }
        });
        Escritorio.add(DT, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 260, 30));

        Nombre.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        Nombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });
        Escritorio.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 260, 30));

        Sueldo_Diario1.setFont(new java.awt.Font("Cocogoose", 1, 18)); // NOI18N
        Sueldo_Diario1.setForeground(new java.awt.Color(25, 57, 183));
        Sueldo_Diario1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Sueldo_Diario1.setText("NOMBRE.:");
        Sueldo_Diario1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Escritorio.add(Sueldo_Diario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 220, 40));

        Sueldo_Diario2.setFont(new java.awt.Font("Cocogoose", 1, 18)); // NOI18N
        Sueldo_Diario2.setForeground(new java.awt.Color(25, 57, 183));
        Sueldo_Diario2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Sueldo_Diario2.setText("DEPARTAMENTO.:");
        Sueldo_Diario2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Escritorio.add(Sueldo_Diario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 220, 40));

        Depto.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        Depto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Depto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DeptoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DeptoKeyTyped(evt);
            }
        });
        Escritorio.add(Depto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 260, 30));

        Puesto.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        Puesto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Puesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PuestoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PuestoKeyTyped(evt);
            }
        });
        Escritorio.add(Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 260, 30));

        Sueldo_Diario3.setFont(new java.awt.Font("Cocogoose", 1, 18)); // NOI18N
        Sueldo_Diario3.setForeground(new java.awt.Color(25, 57, 183));
        Sueldo_Diario3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Sueldo_Diario3.setText("PUESTO.:");
        Sueldo_Diario3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Escritorio.add(Sueldo_Diario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 220, 40));

        Impresion.setBackground(new java.awt.Color(255, 255, 255));
        Impresion.setColumns(20);
        Impresion.setForeground(new java.awt.Color(0, 0, 0));
        Impresion.setRows(5);
        Impresion.setFocusable(false);
        jScrollPane1.setViewportView(Impresion);

        Escritorio.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 260, 300, 180));

        Calcular.setBackground(new java.awt.Color(25, 57, 183));
        Calcular.setFont(new java.awt.Font("Cocogoose Pro", 0, 18)); // NOI18N
        Calcular.setForeground(new java.awt.Color(255, 255, 255));
        Calcular.setText("Calcular");
        Calcular.setBorder(null);
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        Calcular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CalcularKeyPressed(evt);
            }
        });
        Escritorio.add(Calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 520, 130, 50));

        Limpiar.setBackground(new java.awt.Color(25, 57, 183));
        Limpiar.setFont(new java.awt.Font("Cocogoose Pro", 0, 18)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(255, 255, 255));
        Limpiar.setText("Limpiar");
        Limpiar.setBorder(null);
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        Limpiar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LimpiarKeyPressed(evt);
            }
        });
        Escritorio.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 520, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Banner, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SDKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            DT.requestFocus();
        }
    }//GEN-LAST:event_SDKeyPressed

    private void SDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SDKeyTyped
        if (evt.getKeyChar() == '.') {
            return;
        }
        if (evt.getKeyChar() > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_SDKeyTyped

    private void DTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DTKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Ejecutar_Algoritmo();
        }
    }//GEN-LAST:event_DTKeyPressed

    private void DTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DTKeyTyped
        if (evt.getKeyChar() == '.') {
            evt.consume();
        }
        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_DTKeyTyped

    private void NombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Depto.requestFocus();
        }
    }//GEN-LAST:event_NombreKeyPressed

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            evt.consume();
        }
    }//GEN-LAST:event_NombreKeyTyped

    private void DeptoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DeptoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Puesto.requestFocus();
        }
    }//GEN-LAST:event_DeptoKeyPressed

    private void DeptoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DeptoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            evt.consume();
        }
    }//GEN-LAST:event_DeptoKeyTyped

    private void PuestoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PuestoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            SD.requestFocus();
        }
    }//GEN-LAST:event_PuestoKeyPressed

    private void PuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PuestoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isDigit(validar)) {
            evt.consume();
        }
    }//GEN-LAST:event_PuestoKeyTyped

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        Ejecutar_Algoritmo();
    }//GEN-LAST:event_CalcularActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Borrar_Formulario();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void LimpiarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LimpiarKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Borrar_Formulario();
        }
    }//GEN-LAST:event_LimpiarKeyPressed

    private void CalcularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CalcularKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Ejecutar_Algoritmo();
        }
    }//GEN-LAST:event_CalcularKeyPressed

    //==============================================================================
    
    private void Ejecutar_Algoritmo() {
        //Declarando Variables de Lectura
        String nombreEmp, deptoEmp, puestoEmp;
        double sueldoDiarioEmp;
        int DiasTrabajados;

        //Entrada
        nombreEmp = Nombre.getText();
        deptoEmp = Depto.getText();
        puestoEmp = Puesto.getText();
        sueldoDiarioEmp = Double.parseDouble(SD.getText());
        
        if(nombreEmp.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Error en nombre del empleado, no lo deje vacío");
            return;
        }
        
        if(deptoEmp.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Error en el departamento, no lo deje vacío");
            return;
        }
        
        if(puestoEmp.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Error en el puesto,, no lo deje vacío");
            return;
        }
        
        if(puestoEmp.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Error en el puesto,, no lo deje vacío");
            return;
        }
        
        try {
            if (sueldoDiarioEmp == 0) {
                DT.setText(null);
                SD.setText(null);
                Impresion.setText(null);
                SD.requestFocus();
                JOptionPane.showMessageDialog(rootPane, "Error en el sueldo diario: Introduce un valor mayor a 0");
                return;
            }
        } catch (NumberFormatException e) {
            DT.setText(null);
            SD.setText(null);
            Impresion.setText(null);
            SD.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error en el sueldo diario: Introduce valores numericos");
            return;
        }

        try {
            DiasTrabajados = Integer.parseInt(DT.getText());
            if (DiasTrabajados == 0) {
                DT.setText(null);
                Impresion.setText(null);
                DT.requestFocus();
                JOptionPane.showMessageDialog(rootPane, "Error en los dias trabajados: Introduce un valor mayor a 0");
                return;
            }
        } catch (NumberFormatException e) {
                DT.setText(null);
                Impresion.setText(null);
                DT.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error en los dias trabajados: Introduce valores numericos");
            return;
        }

        //Construyendo el objeto, manipulando el contructor
        Obj_Aguinaldo = new ChequeAdministrativo_Aguinaldo_Clase_Derivada(nombreEmp, deptoEmp, puestoEmp, sueldoDiarioEmp, DiasTrabajados);

        //Proceso
        Obj_Aguinaldo.setDiasTrabajados(DiasTrabajados);
        Obj_Aguinaldo.setSueldoDiario();

        //Salida
        Impresion.setText(null);
        Impresion.append("===========> Aguinaldo <=================\n");
        Impresion.append("Nombre: " + nombreEmp + "\n");
        Impresion.append("Departamento: " + deptoEmp + "\n");
        Impresion.append("Puesto: " + puestoEmp + "\n");
        Impresion.append("Aguinaldo: $"+String.valueOf(Decf.format(Obj_Aguinaldo.getSueldoDro())+"\n"));
        Impresion.append("--------------------------------------------------------------------\n\n");
    }
    
    private void Borrar_Formulario() {
        Nombre.setText(null);
        Depto.setText(null);
        Puesto.setText(null);
        SD.setText(null);
        DT.setText(null);
        Impresion.setText(null);
        Nombre.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anos_Trabajados;
    private javax.swing.JPanel Banner;
    private javax.swing.JButton Calcular;
    private javax.swing.JTextField DT;
    private javax.swing.JTextField Depto;
    private javax.swing.JPanel Escritorio;
    private javax.swing.JLabel Horas_Extras;
    private javax.swing.JTextArea Impresion;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Puesto;
    private javax.swing.JTextField SD;
    private javax.swing.JLabel Sueldo_Diario;
    private javax.swing.JLabel Sueldo_Diario1;
    private javax.swing.JLabel Sueldo_Diario2;
    private javax.swing.JLabel Sueldo_Diario3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}