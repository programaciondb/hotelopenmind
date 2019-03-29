/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.ControlInforme;
import modelo.Habitacion;

/**
 *
 * @author duoc
 */
public class PedirProducto extends javax.swing.JFrame {
    Habitacion[] h;
    int indiceHab;
    /**
     * Creates new form PedirProducto
     */
    public PedirProducto(String nombreHabitacion) {
        initComponents();
        LBNombreHab.setText(nombreHabitacion);
        //h=Habitacion.getHab();
        //indiceHab = Habitacion.getIDporNombre(nombreHabitacion);
        ControlInforme.llenarTablaProductosHabitacion(TBLStock);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLStock = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CBCantidad = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        LBAgregado = new javax.swing.JLabel();
        BTNPagar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        LBTotal = new javax.swing.JLabel();
        BTNEliminar = new javax.swing.JButton();
        LBNombreHab = new javax.swing.JLabel();
        BTNVolver = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(464, 491));
        setMinimumSize(new java.awt.Dimension(464, 491));
        setSize(new java.awt.Dimension(464, 491));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TBLStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TBLStock);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 28, 268, 189));

        jLabel1.setText("Elija el producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setText("Carrito de pedido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 227, -1, -1));

        CBCantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---cantidad---" }));
        getContentPane().add(CBCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 50, -1, -1));

        jButton1.setText("Agregar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 95, 158, -1));

        LBAgregado.setText("-");
        getContentPane().add(LBAgregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 142, -1, -1));

        BTNPagar.setText("Pagar");
        getContentPane().add(BTNPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio", "cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 249, 268, 149));

        jLabel3.setText("Total a pagar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 352, -1, -1));

        LBTotal.setText("-");
        getContentPane().add(LBTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 382, -1, -1));

        BTNEliminar.setText("Eliminar");
        getContentPane().add(BTNEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 265, 158, -1));

        LBNombreHab.setText("-");
        getContentPane().add(LBNombreHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        BTNVolver.setText("Volver");
        BTNVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNVolverActionPerformed(evt);
            }
        });
        getContentPane().add(BTNVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pedirproducto_bg.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVolverActionPerformed
        // TODO add your handling code here:
        new Habitaciones().setVisible(true);
        dispose();
    }//GEN-LAST:event_BTNVolverActionPerformed

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
            java.util.logging.Logger.getLogger(PedirProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedirProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedirProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedirProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new PedirProducto().setVisible(true);
        }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton BTNPagar;
    private javax.swing.JButton BTNVolver;
    private javax.swing.JComboBox<String> CBCantidad;
    private javax.swing.JLabel LBAgregado;
    private javax.swing.JLabel LBNombreHab;
    private javax.swing.JLabel LBTotal;
    private javax.swing.JTable TBLStock;
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
