/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.ControlInforme;

/**
 *
 * @author ljrojas
 */
public class InformeCliente extends javax.swing.JFrame {

    /**
     * Creates new form InformeCliente
     */
    public InformeCliente() {
        initComponents();
        ControlInforme.llenarRutsInformeCliente(jcbRuts);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbTitulo = new javax.swing.JLabel();
        jlbRut = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        jlbSexo = new javax.swing.JLabel();
        jlbFecha = new javax.swing.JLabel();
        jlbNacionalidad = new javax.swing.JLabel();
        jcbRuts = new javax.swing.JComboBox<>();
        jlblNombreClliente = new javax.swing.JLabel();
        jlbSexoCliente = new javax.swing.JLabel();
        jlbFechaCliente = new javax.swing.JLabel();
        jlbNacionalidadCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtRegistroVisitas = new javax.swing.JTable();
        jlbTituloTabla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbTitulo.setText("Informe Cliente");

        jlbRut.setText("Rut");

        jlbNombre.setText("Nombre:");

        jlbSexo.setText("Sexo:");

        jlbFecha.setText("Fecha Nacimiento:");

        jlbNacionalidad.setText("Nacionalidad");

        jcbRuts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlblNombreClliente.setText("jLabel7");

        jlbSexoCliente.setText("jLabel8");

        jlbFechaCliente.setText("jLabel9");

        jlbNacionalidadCliente.setText("jLabel10");

        jtRegistroVisitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha y hora ingreso", "Visita como", "Nombre Habitacion", "Consumo Total"
            }
        ));
        jScrollPane1.setViewportView(jtRegistroVisitas);

        jlbTituloTabla.setText("Registro Visitas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(jlbTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlbRut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbRuts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlbNombre)
                                .addGap(18, 18, 18)
                                .addComponent(jlblNombreClliente, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlbSexo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbSexoCliente))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlbFecha)
                                .addGap(18, 18, 18)
                                .addComponent(jlbFechaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlbNacionalidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbNacionalidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jlbTituloTabla)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbRut)
                    .addComponent(jcbRuts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNombre)
                    .addComponent(jlblNombreClliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbSexo)
                    .addComponent(jlbSexoCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbFecha)
                    .addComponent(jlbFechaCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNacionalidad)
                    .addComponent(jlbNacionalidadCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jlbTituloTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void CBRutActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:

        int rut = jcbRuts.getSelectedIndex();
        ControlInforme.llenarInformacionPaxInformeCliente(rut, jlbNombre, jlbSexo, jlbFechaCliente, jlbNacionalidad, jtRegistroVisitas);


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
            java.util.logging.Logger.getLogger(InformeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformeCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbRuts;
    private javax.swing.JLabel jlbFecha;
    private javax.swing.JLabel jlbFechaCliente;
    private javax.swing.JLabel jlbNacionalidad;
    private javax.swing.JLabel jlbNacionalidadCliente;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbRut;
    private javax.swing.JLabel jlbSexo;
    private javax.swing.JLabel jlbSexoCliente;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JLabel jlbTituloTabla;
    private javax.swing.JLabel jlblNombreClliente;
    private javax.swing.JTable jtRegistroVisitas;
    // End of variables declaration//GEN-END:variables
}