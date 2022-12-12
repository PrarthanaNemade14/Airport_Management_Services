/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.hotel;

import business.EcoSystem;
//import business.hotel.Room;
import business.hotel.Hotel;
import business.hotel.HotelRoom;
import business.RoomBooking.HotelOrder;
import business.RoomBooking.HotelOrderItem;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nemad
 */
public class HotelViewOrderPanel extends javax.swing.JPanel {

    /**
     * Creates new form HotelViewOrderPanel
     */
    EcoSystem ecoSystem;
    Hotel hotel;
    JFrame mainJFrame;
    public HotelViewOrderPanel(JFrame mainJFrame, Hotel hotel,EcoSystem ecoSystem) {
        initComponents();
        this.mainJFrame = mainJFrame;
        this.ecoSystem = ecoSystem;
        this.hotel = hotel;
        lblHotelName.setText("Hotel Name: "+hotel.getName());
        populateOrderTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewOrder = new javax.swing.JTable();
        btnOrderDetail = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrderDetail = new javax.swing.JTable();
        lblHotelName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));

        tblViewOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Booking Id", "Total", "Booking Status", "Comments", "Restaurant Rating"
            }
        ));
        jScrollPane1.setViewportView(tblViewOrder);

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
                "Room Number", "Price", "No. of Rooms"
            }
        ));
        jScrollPane2.setViewportView(tblOrderDetail);

        lblHotelName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHotelName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHotelName.setText("Hotel Name: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHotelName, javax.swing.GroupLayout.DEFAULT_SIZE, 1542, Short.MAX_VALUE)
                .addGap(28, 28, 28))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(122, 122, 122)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnOrderDetail)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(228, 228, 228)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(123, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(lblHotelName, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1151, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(310, 310, 310)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(35, 35, 35)
                    .addComponent(btnOrderDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(581, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderDetailActionPerformed
        int selectedRow = tblViewOrder.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view order detail", "Error", ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblViewOrder.getModel();
        HotelOrder order = (HotelOrder) model.getValueAt(selectedRow, 0);
        populateOrderDetailTable(order);
    }//GEN-LAST:event_btnOrderDetailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderDetail;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHotelName;
    private javax.swing.JTable tblOrderDetail;
    private javax.swing.JTable tblViewOrder;
    // End of variables declaration//GEN-END:variables

    private void populateOrderTable()
    {
        DefaultTableModel model = (DefaultTableModel) tblViewOrder.getModel();
        model.setRowCount(0);
        List<HotelOrder> orders = hotel.getOrders();

        for(HotelOrder order : orders)
        {
            Object[] row = new Object[8];
            row[0] = order;
            row[1] = order.getOrderTotal();
            row[2] = order.getDeliveryStatus();
            row[3] = order.getComment();
            row[4] = order.getHotelRating() == 0 ? "Not rated" : order.getHotelRating();
            model.addRow(row);
        }
    }

    private void populateOrderDetailTable(HotelOrder order)
    {
        DefaultTableModel model = (DefaultTableModel) tblOrderDetail.getModel();
        model.setRowCount(0);
        List<HotelOrderItem> orderItems = order.getOrderItems();

        for(HotelOrderItem orderItem : orderItems)
        {
            Object[] row = new Object[3];
            HotelRoom room = orderItem.getRoom();
            row[0] = room.getName();
            row[1] = room.getPrice();
            row[2] = orderItem.getQuantity();
            model.addRow(row);
        }
    }
}