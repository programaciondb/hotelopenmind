/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author duoc
 */
public class PedirProducto extends javax.swing.JFrame {

    /**
     * Creates new form PedirProducto
     */
    public PedirProducto() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLStock = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        LBAgregado = new javax.swing.JLabel();
        BTNPagar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        LBTotal = new javax.swing.JLabel();
        BTNEliminar = new javax.swing.JButton();
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
        setPreferredSize(new java.awt.Dimension(464, 491));
        setSize(new java.awt.Dimension(464, 491));
        getContentPane().setLayout(null);

        TBLStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TBLStock);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(6, 28, 268, 189);

        jLabel1.setText("Elija el producto");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(6, 6, 102, 16);

        jLabel2.setText("Carrito de pedido");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(6, 227, 109, 16);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---cantidad---", " " }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(292, 50, 158, 27);

        jButton1.setText("Agregar");
        getContentPane().add(jButton1);
        jButton1.setBounds(292, 95, 158, 29);

        LBAgregado.setText("-");
        getContentPane().add(LBAgregado);
        LBAgregado.setBounds(292, 142, 8, 16);

        BTNPagar.setText("Pagar");
        getContentPane().add(BTNPagar);
        BTNPagar.setBounds(320, 420, 78, 29);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Precio"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(6, 249, 268, 149);

        jLabel3.setText("Total a pagar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(292, 352, 82, 16);

        LBTotal.setText("-");
        getContentPane().add(LBTotal);
        LBTotal.setBounds(292, 382, 8, 16);

        BTNEliminar.setText("Eliminar");
        getContentPane().add(BTNEliminar);
        BTNEliminar.setBounds(292, 265, 158, 29);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pedirproducto_bg.png"))); // NOI18N
        background.setSize(new java.awt.Dimension(464, 491));
        getContentPane().add(background);
        background.setBounds(0, 0, 464, 491);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedirProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton BTNPagar;
    private javax.swing.JLabel LBAgregado;
    private javax.swing.JLabel LBTotal;
    private javax.swing.JTable TBLStock;
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
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
