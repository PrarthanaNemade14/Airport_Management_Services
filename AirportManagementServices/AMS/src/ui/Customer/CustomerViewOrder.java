/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Customer;

import business.EcoSystem;
import business.customer.Customer;
import business.restaurant.Dish;
import business.restaurantOrder.RestaurantOrder;
import business.restaurantOrder.RestaurantOrderItem;
import java.awt.Graphics;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mamthashetty
 */
public class CustomerViewOrder extends javax.swing.JPanel {

    /**
     * Creates new form CustomerViewOrder
     */
    EcoSystem ecoSystem;
    Customer customer;
    JFrame mainJFrame;
    public CustomerViewOrder(JFrame mainJFrame, Customer customer,EcoSystem ecoSystem) {
        initComponents();
        this.mainJFrame = mainJFrame;
        this.ecoSystem = ecoSystem;
        this.customer = customer;
        lblCustomerName.setText(customer.getName());
        populateOrderTable();
    }
    
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/Images/food_final.jpg");
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewOrder = new javax.swing.JTable();
        lblCustomerName = new javax.swing.JLabel();
        btnOrderDetail = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderDetail = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 255, 204));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("<- Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblViewOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Hotel", "Total", " Status", "Comment", "Hotel Rating"
            }
        ));
        jScrollPane1.setViewportView(tblViewOrder);

        lblCustomerName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCustomerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCustomerName.setText("Customer Name");

        btnOrderDetail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOrderDetail.setText("View Order Detail");
        btnOrderDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderDetailActionPerformed(evt);
            }
        });

        tblOrderDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Room number", "Price", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(tblOrderDetail);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnOrderDetail)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(235, 235, 235)
                                .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1335, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnOrderDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(519, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderDetailActionPerformed
        int selectedRow = tblViewOrder.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view order detail", "Error", ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewOrder.getModel();
        RestaurantOrder order = (RestaurantOrder) model.getValueAt(selectedRow, 0);
        populateOrderDetailTable(order);
    }//GEN-LAST:event_btnOrderDetailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CustomerPanel customerAreaJPanel = new CustomerPanel(ecoSystem, customer, mainJFrame);
        mainJFrame.setContentPane(customerAreaJPanel);
        mainJFrame.revalidate();
        mainJFrame.repaint();
        return;
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderDetail;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JTable tblOrderDetail;
    private javax.swing.JTable tblViewOrder;
    // End of variables declaration//GEN-END:variables

    private void populateOrderTable()
    {
        DefaultTableModel model = (DefaultTableModel) tblViewOrder.getModel();
        model.setRowCount(0);
        List<RestaurantOrder> orders = customer.getRestaurantOrders();

        for(RestaurantOrder order : orders)
        {
            Object[] row = new Object[6];
            row[0] = order;
            row[1] = order.getRestaurant();
            row[2] = order.getOrderTotal();
            row[3] = order.getDeliveryStatus();
            row[4] = order.getComment();
            row[5] = order.getRestaurantRating() == 0 ? "Not rated" : order.getRestaurantRating();
            model.addRow(row);
        }
    }
    
    private void populateOrderDetailTable(RestaurantOrder order)
    {
        DefaultTableModel model = (DefaultTableModel) tblOrderDetail.getModel();
        model.setRowCount(0);
        List<RestaurantOrderItem> orderItems = order.getOrderItems();

        for(RestaurantOrderItem orderItem : orderItems)
        {
            Object[] row = new Object[3];
            Dish dish = orderItem.getDish();
            row[0] = dish.getName();
            row[1] = dish.getPrice();
            row[2] = orderItem.getQuantity();
            model.addRow(row);
        }
    }
}