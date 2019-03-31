/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.ControlInforme;

/**
 *
 * @author duoc
 */
public class Informes extends javax.swing.JFrame {

    /**
     * Creates new form Informes
     */
    public Informes() {
        initComponents();
        ControlInforme.llenarListaInformes(jcbInformes);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcbInformes = new javax.swing.JComboBox<>();
        BTNGenerar = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMaximumSize(new java.awt.Dimension(421, 128));
        setMinimumSize(new java.awt.Dimension(421, 128));
        setResizable(false);
        setSize(new java.awt.Dimension(421, 128));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Generar Informes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jcbInformes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jcbInformes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 179, -1));

        BTNGenerar.setText("Generar");
        BTNGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/informes_bg.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNGenerarActionPerformed
        // TODO add your handling code here:
        
        String eleccion = String.valueOf(jcbInformes.getSelectedItem());
        
        if (eleccion.equalsIgnoreCase("informe cliente")) {
            new InformeCliente().setVisible(true);
        }
        
        if (eleccion.equalsIgnoreCase("informe cliente del amor")) {
            new InformeClienteAmor().setVisible(true);
        }
        
        if (eleccion.equalsIgnoreCase("habitación más visitada")) {
            new InformeHabitacionMasUtilizada().setVisible(true);
        }
        
        if (eleccion.equalsIgnoreCase("habitación menos visitada")) {
            new InformeHabitacionMenosUtilizada().setVisible(true);
        }
        
        if (eleccion.equalsIgnoreCase("producto más vendido")) {
            new InformeProductoMasVendido().setVisible(true);
        }
        
        if (eleccion.equalsIgnoreCase("producto menos vendido")) {
            new InformeProductoMenosVendido().setVisible(true);
        }
        
        if (eleccion.equalsIgnoreCase("habitacion grupos más grandes")) {
            new InformeHabitacionGrupos().setVisible(true);
        }
        
        if (eleccion.equalsIgnoreCase("informe todas las habitaciones")) {
            new InformeTodasHabitaciones().setVisible(true);
        }
    }//GEN-LAST:event_BTNGenerarActionPerformed

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
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNGenerar;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> jcbInformes;
    // End of variables declaration//GEN-END:variables
}
