/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.poo.ui;

import gui.poo.models.Producto;
import gui.poo.models.Venta;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aiya
 */
public class UIVenta extends javax.swing.JFrame {

    public List<Producto> productos = new ArrayList<Producto>();
    DefaultTableModel model;
    /**
     * Creates new form NewJFrame
     */
    public UIVenta() {
        initComponents(); 
        model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Descripci�n");
        model.addColumn("Docenas");
        model.addColumn("Precio");
        model.addColumn("Precio Total");
        this.jTable1.setModel(model);
        
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
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TextFieldDocenas = new javax.swing.JTextField();
        LabelSubTotal = new javax.swing.JLabel();
        LabelDescuento = new javax.swing.JLabel();
        LabelTotal = new javax.swing.JLabel();
        LabelObsequio = new javax.swing.JLabel();
        ConsultarButton = new javax.swing.JButton();
        ComboBoxProductos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ButtonAddProduct = new javax.swing.JButton();
        ButtonConsultarProductos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cuantas Docenas");

        LabelSubTotal.setText("Null");

        LabelDescuento.setText("Null");

        LabelTotal.setText("Null");

        LabelObsequio.setText("Null");

        ConsultarButton.setText("Consultar");
        ConsultarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Productos");

        ButtonAddProduct.setText("Adicionar Producto");
        ButtonAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddProductActionPerformed(evt);
            }
        });

        ButtonConsultarProductos.setText("Buscar Productos");
        ButtonConsultarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConsultarProductosActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Description", "Docenas", "Precio", "Precio Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addComponent(ButtonAddProduct)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(LabelSubTotal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(LabelTotal)))
                                .addGap(128, 128, 128)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelObsequio)
                                    .addComponent(LabelDescuento))
                                .addGap(91, 91, 91))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboBoxProductos, 0, 200, Short.MAX_VALUE)
                                    .addComponent(TextFieldDocenas))
                                .addContainerGap(186, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConsultarButton))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonConsultarProductos)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonConsultarProductos)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TextFieldDocenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(ButtonAddProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultarButton)
                    .addComponent(LabelSubTotal)
                    .addComponent(LabelObsequio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTotal)
                    .addComponent(LabelDescuento))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarButtonActionPerformed
        // TODO add your handling code here:
        Producto producto = new Producto();
        producto.setId(1);
        producto.setPrice(1000);
        System.out.println(producto.toString());
        Venta venta = new Venta();
        venta.setId(1);
        venta.setProducto(producto);
        //Asignar las docenas del TextField
        venta.setCantidadDocenas(Integer.valueOf(TextFieldDocenas.getText()));
        
        //Calcular el valor del subtotal
        venta.setValorSubTotal(producto.getPrice()*venta.getCantidadDocenas()*12);
        LabelSubTotal.setText(String.valueOf(venta.getValorSubTotal()));
        System.out.println(venta.toString());
    }//GEN-LAST:event_ConsultarButtonActionPerformed

    private void ButtonAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddProductActionPerformed
        if(this.TextFieldDocenas.getText().equals("") || this.ComboBoxProductos.getSelectedItem().toString().equals("Agregue productos") || this.ComboBoxProductos.getSelectedItem().toString().equals("Seleccione una opci�n"))
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto y agregar las docenas");
        else{    
            String [] infoVenta = new String[5];
            Producto producto = new Producto();
            for(Producto p : productos)
                if(p.getDescription().equals(this.ComboBoxProductos.getSelectedItem().toString())){
                    infoVenta[0]= String.valueOf(p.getId());
                    infoVenta[1]= p.getDescription();
                    infoVenta[2]= this.TextFieldDocenas.getText();
                    infoVenta[3]= String.valueOf(p.getPrice());
                    infoVenta[4]= String.valueOf(12*p.getPrice()*Integer.parseInt(this.TextFieldDocenas.getText()));
                }
            model.addRow(infoVenta);
            this.TextFieldDocenas.setText("");
            this.ComboBoxProductos.removeAllItems();
            cargarItemsComboBox();
        }
    }//GEN-LAST:event_ButtonAddProductActionPerformed

    private void ButtonConsultarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConsultarProductosActionPerformed
        if(productos.isEmpty())
            this.ComboBoxProductos.addItem("Agregue productos");
        else
           cargarItemsComboBox(); 
    }//GEN-LAST:event_ButtonConsultarProductosActionPerformed
    
    private void cargarItemsComboBox(){
        this.ComboBoxProductos.addItem("Seleccione una opci�n");
            for(Producto p : productos)
               this.ComboBoxProductos.addItem(p.getDescription()); 
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
            java.util.logging.Logger.getLogger(UIVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAddProduct;
    private javax.swing.JButton ButtonConsultarProductos;
    private javax.swing.JComboBox<String> ComboBoxProductos;
    private javax.swing.JButton ConsultarButton;
    private javax.swing.JLabel LabelDescuento;
    private javax.swing.JLabel LabelObsequio;
    private javax.swing.JLabel LabelSubTotal;
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JTextField TextFieldDocenas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
