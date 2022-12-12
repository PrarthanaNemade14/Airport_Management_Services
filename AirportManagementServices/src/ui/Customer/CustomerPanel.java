/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Customer;

import business.DB40Util.DB4OUtil;
import business.EcoSystem;
import business.customer.Customer;
import business.util.Utils;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import ui.HomePage;

/**
 *
 * @author mamthashetty
 */
public class CustomerPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerPanel
     */
    private EcoSystem ecoSystem;
    private Customer customer;
    private JFrame mainJFrame;
    public CustomerPanel(EcoSystem ecoSystem, Customer customer, JFrame mainJFrame) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.customer = customer;
        this.mainJFrame = mainJFrame;
        jLabel1.setText("Welcome "+ customer.getName());
    }
    
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/Images/airplane-wing.jpeg");
        //g.drawImage(img.getImage(), 0, 0, 700, 800, null);
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

        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btn_bookingHistory = new javax.swing.JButton();
        btn_bookTickets = new javax.swing.JButton();
        btn_bookTickets1 = new javax.swing.JButton();
        btn_bookTickets2 = new javax.swing.JButton();
        btn_bookTickets3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setBackground(new java.awt.Color(204, 102, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Dashboard");
        jLabel1.setMaximumSize(new java.awt.Dimension(102, 100));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn_bookingHistory.setBackground(new java.awt.Color(204, 255, 255));
        btn_bookingHistory.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_bookingHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-order-history-96.png"))); // NOI18N
        btn_bookingHistory.setText("Booking History");
        btn_bookingHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookingHistoryActionPerformed(evt);
            }
        });

        btn_bookTickets.setBackground(new java.awt.Color(204, 255, 255));
        btn_bookTickets.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_bookTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-new-ticket-96.png"))); // NOI18N
        btn_bookTickets.setText("Book Tickets");
        btn_bookTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookTicketsActionPerformed(evt);
            }
        });

        btn_bookTickets1.setBackground(new java.awt.Color(204, 255, 255));
        btn_bookTickets1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_bookTickets1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/order.png"))); // NOI18N
        btn_bookTickets1.setText("Place Food Order");
        btn_bookTickets1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookTickets1ActionPerformed(evt);
            }
        });

        btn_bookTickets2.setBackground(new java.awt.Color(204, 255, 255));
        btn_bookTickets2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_bookTickets2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/history.png"))); // NOI18N
        btn_bookTickets2.setText("View Food Order");
        btn_bookTickets2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookTickets2ActionPerformed(evt);
            }
        });

        btn_bookTickets3.setBackground(new java.awt.Color(204, 255, 255));
        btn_bookTickets3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_bookTickets3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/star.png"))); // NOI18N
        btn_bookTickets3.setText("Rate Food Order");
        btn_bookTickets3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookTickets3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
                .addGap(286, 286, 286))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btn_bookingHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_bookTickets1)
                    .addComponent(btn_bookTickets2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_bookTickets3)
                .addGap(723, 723, 723))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(btn_bookTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1546, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_bookTickets, btn_bookTickets1, btn_bookTickets2, btn_bookTickets3, btn_bookingHistory});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145)
                .addComponent(btn_bookTickets1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1333, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_bookingHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bookTickets2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btn_bookTickets3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(223, 223, 223)
                    .addComponent(btn_bookTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1661, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bookTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookTicketsActionPerformed
        BookTicketPanel bookTicketPanel = new BookTicketPanel(ecoSystem, customer, mainJFrame);
        Utils.newPage(bookTicketPanel);
    }//GEN-LAST:event_btn_bookTicketsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DB4OUtil dB4OUtil = DB4OUtil.getInstance();
        dB4OUtil.storeSystem(ecoSystem);
        HomePage newMainJFrame = new HomePage();
        newMainJFrame.setVisible(true);
        mainJFrame.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_bookingHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookingHistoryActionPerformed
        OrderHistory orderHistory = new OrderHistory(ecoSystem, customer, mainJFrame);
        Utils.newPage(orderHistory);
    }//GEN-LAST:event_btn_bookingHistoryActionPerformed

    private void btn_bookTickets1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookTickets1ActionPerformed
        CustomerPlaceOrderPanel customerPlaceOrderPanel = new CustomerPlaceOrderPanel(mainJFrame, customer, ecoSystem);
        Utils.newPage(customerPlaceOrderPanel);
    }//GEN-LAST:event_btn_bookTickets1ActionPerformed

    private void btn_bookTickets2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookTickets2ActionPerformed
        CustomerViewOrder customerViewOrder = new CustomerViewOrder(mainJFrame, customer, ecoSystem);
        Utils.newPage(customerViewOrder);
    }//GEN-LAST:event_btn_bookTickets2ActionPerformed

    private void btn_bookTickets3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookTickets3ActionPerformed
        CustomerRatePanel customerRatePanel = new CustomerRatePanel(mainJFrame, customer, ecoSystem);
        Utils.newPage(customerRatePanel);
    }//GEN-LAST:event_btn_bookTickets3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bookTickets;
    private javax.swing.JButton btn_bookTickets1;
    private javax.swing.JButton btn_bookTickets2;
    private javax.swing.JButton btn_bookTickets3;
    private javax.swing.JButton btn_bookingHistory;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
