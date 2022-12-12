/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Customer;

import business.EcoSystem;
import business.RoomBooking.HotelOrder;
import business.RoomBooking.HotelOrderItem;
import business.RoomBooking.HotelOrderStatus;
import business.airport.Airport;
import business.customer.Customer;
import business.hotel.Hotel;
import business.hotel.HotelRoom;
import business.hotel.HotelDirectory;
import static business.util.Utils.ecoSystem;
import static business.util.Utils.mainJFrame;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mamthashetty
 */
public class CustomerRoomBooking extends javax.swing.JPanel {

    /**
     * Creates new form CustomerRoomBooking
     */
    EcoSystem ecoSystem;
    Customer customer;
    JFrame mainJFrame;
    public CustomerRoomBooking(JFrame mainJFrame, Customer customer,EcoSystem ecoSystem) {
        initComponents();
        this.mainJFrame = mainJFrame;
        this.ecoSystem = ecoSystem;
        this.customer = customer;
        
        List<Airport> airports = ecoSystem.getAirportDirectory().getAirports();
        for(Airport airport : ecoSystem.getAirportDirectory().getAirports())
        {
            airportComboBox.addItem(airport.getAirportName());
        }

        txtCustomerName.setText(customer.getName());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        airportComboBox = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAddToCart = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddToCart = new javax.swing.JTable();
        btnPlaceOrder = new javax.swing.JButton();
        txtCustomerName = new javax.swing.JLabel();
        btnDeleteCart = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        restaurantComboBox1 = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        btnBack.setText("<- Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Airport:");

        airportComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        airportComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                airportComboBoxItemStateChanged(evt);
            }
        });
        airportComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airportComboBoxActionPerformed(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        menuTbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        menuTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Room ", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(menuTbl);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Menu");

        btnAddToCart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddToCart.setText("Add to Cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cart");

        tblAddToCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hotel", "Room ", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAddToCart);

        btnPlaceOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        txtCustomerName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtCustomerName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCustomerName.setText("Hotel Name:");

        btnDeleteCart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDeleteCart.setText("Delete");
        btnDeleteCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCartActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hotel Name:");

        restaurantComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        restaurantComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                restaurantComboBox1ItemStateChanged(evt);
            }
        });
        restaurantComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurantComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDeleteCart, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSearch))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(airportComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(restaurantComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(777, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airportComboBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restaurantComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteCart, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(321, 321, 321))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1692, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CustomerPanel customerAreaJPanel = new CustomerPanel(ecoSystem, customer, mainJFrame);
        mainJFrame.setContentPane(customerAreaJPanel);
        mainJFrame.revalidate();
        mainJFrame.repaint();
        return;
    }//GEN-LAST:event_btnBackActionPerformed

    private void airportComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_airportComboBoxItemStateChanged
        restaurantComboBox1.removeAllItems();
        String airportName = (String) airportComboBox.getSelectedItem();
        Airport airport = ecoSystem.getAirportDirectory().getAirportFromName(airportName);
        for(Hotel r : airport.getHotels())
        {
            restaurantComboBox1.addItem(r.getName());
        }
    }//GEN-LAST:event_airportComboBoxItemStateChanged

    private void airportComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airportComboBoxActionPerformed
        restaurantComboBox1.removeAllItems();
        String airportName = (String) airportComboBox.getSelectedItem();
        Airport airport = ecoSystem.getAirportDirectory().getAirportFromName(airportName);
        for(Hotel r : airport.getHotels())
        {
            restaurantComboBox1.addItem(r.getName());
        }
    }//GEN-LAST:event_airportComboBoxActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String search = txtSearch.getText();
        String hotelName = (String) restaurantComboBox1.getSelectedItem();
        Hotel hotel = ecoSystem.getHotelDirectory().getHotelFromName(hotelName);
        populateMenuTable(hotel, search);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        int selectedRow = menuTbl.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to add room to cart", "Error", ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) menuTbl.getModel();
        HotelRoom room = (HotelRoom) model.getValueAt(selectedRow, 0);
        Hotel hotel = ecoSystem.getHotelDirectory().getHotelFromName(restaurantComboBox1.getSelectedItem().toString());
        populateAddToCartTable(hotel, room);
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        int rowCount = tblAddToCart.getRowCount();
        if(rowCount < 1)
        {
            JOptionPane.showMessageDialog(this, "Please add a room to place order", "Error", ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblAddToCart.getModel();
        HotelOrder order = ecoSystem.getHotelOrderDirectory().createOrder();
        Hotel hotel = (Hotel) model.getValueAt(0, 0);
        customer.getHotelOrders().add(order);
        hotel.getOrders().add(order);
        order.setCustomer(customer);
        order.setHotel(hotel);
        order.setDeliveryStatus(HotelOrderStatus.orderPlaced);
        int orderTotal = 0;
        for(int i=0; i<rowCount; i++)
        {
            HotelRoom room = (HotelRoom) model.getValueAt(i, 1);
            String quantity = (String)model.getValueAt(i, 3);
            HotelOrderItem orderItem = order.addOrderItem();
            orderItem.setRoom(room);
            orderItem.setQuantity(Integer.valueOf(quantity));
            Integer price = Integer.valueOf((String)model.getValueAt(i, 2));
            orderTotal += price;
        }
        order.setOrderTotal(orderTotal+"");

        String emailText = "Thank you for placing order, please find your order detail below \n";
        emailText += "Airport: "+hotel.getAirport().getAirportName();
        emailText += "Restaurant Name: "+hotel.getName();
        emailText += "Order detail: \n";
        for(HotelOrderItem hotelOrderItem : order.getOrderItems())
        {
            HotelRoom room = hotelOrderItem.getRoom();
            emailText += room.getName() + "  " + room.getPrice() + "  " + hotelOrderItem.getQuantity();
        }
        emailText += "Total: "+order.getOrderTotal();
        //Utils.emailFoodOrder(customer.getEmail(), emailText);
        JOptionPane.showMessageDialog(this, "Success!!! Order placed successfully");
        model.setRowCount(0);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnDeleteCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCartActionPerformed
        int selectedRow = tblAddToCart.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete room from cart", "Error", ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblAddToCart.getModel();
        model.removeRow(selectedRow);
    }//GEN-LAST:event_btnDeleteCartActionPerformed

    private void restaurantComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_restaurantComboBox1ItemStateChanged
        String hotelName = (String) restaurantComboBox1.getSelectedItem();
        if(hotelName == null || "".equals(hotelName.trim()))
        return;
        Hotel hotel = ecoSystem.getHotelDirectory().getHotelFromName(hotelName);
        populateMenuTable(hotel, "");

        //Code to reset cart table
        DefaultTableModel model = (DefaultTableModel) tblAddToCart.getModel();
        if(model.getRowCount() > 0)
        {
            Hotel res = (Hotel) model.getValueAt(1, 0);
            if(res != hotel)
            model.setRowCount(0);
        }
    }//GEN-LAST:event_restaurantComboBox1ItemStateChanged

    private void restaurantComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurantComboBox1ActionPerformed

    }//GEN-LAST:event_restaurantComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> airportComboBox;
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteCart;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable menuTbl;
    private javax.swing.JComboBox<String> restaurantComboBox1;
    private javax.swing.JTable tblAddToCart;
    private javax.swing.JLabel txtCustomerName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateMenuTable(Hotel hotel, String search)
    {
        DefaultTableModel model = (DefaultTableModel) menuTbl.getModel();
        model.setRowCount(0);
        List<HotelRoom> menu = hotel.getMenu();

        for(HotelRoom room : menu)
        {
            Object[] row = new Object[2];
            row[0] = room;
            row[1] = room.getPrice();
            if(!room.getName().contains(search))
                continue;
            model.addRow(row);
        }
    }

    private void populateAddToCartTable(Hotel hotel, HotelRoom room) {
        DefaultTableModel model = (DefaultTableModel) tblAddToCart.getModel();
        int rowPosition = getRoomRowValue(room.getName());
        if(rowPosition < 0)
            model.addRow(new Object[]{hotel, room, room.getPrice(), "1"});
        else
        {
            Integer quantity = Integer.valueOf((String)model.getValueAt(rowPosition, 3));
            Integer price = Integer.valueOf((String)model.getValueAt(rowPosition, 2));
            model.setValueAt(quantity+1+"", rowPosition, 3);
            model.setValueAt(price+Integer.valueOf(room.getPrice())+"", rowPosition, 2);
        }
    }
    
    private int getRoomRowValue(String roomName)
    {
        int rowCount = tblAddToCart.getRowCount();
        DefaultTableModel model = (DefaultTableModel) tblAddToCart.getModel();
        for(int i=0; i<rowCount; i++)
        {
            HotelRoom room = (HotelRoom) model.getValueAt(i, 1);
            if(roomName.equals(room.getName()))
                return i;
        }
        return -1;
    }
}