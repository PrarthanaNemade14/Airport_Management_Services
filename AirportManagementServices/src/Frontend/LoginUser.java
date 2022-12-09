/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import Backend.EcoSystem;
import Backend.airline.Airline;
import Backend.airport.Airport;
import Backend.Customer.Customer;
import Backend.restaurant.Restaurant;
import Backend.userAccount.UserAccount;
import Backend.util.Role;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import Frontend.Airline.AirlinePanel;
import Frontend.Customer.CustomerPanel;
import Frontend.Admin.AdminPanel;
import Frontend.airport.AirportPanel;
import Frontend.restaurant.RestaurantPanel;

/**
 *
 * @author mamthashetty
 */
public class LoginUser extends javax.swing.JPanel {

    /**
     * Creates new form LoginUser
     */
    JFrame mainJFrame;
    EcoSystem ecoSystem;
    public LoginUser(JFrame mainJFrame, EcoSystem ecoSystem) {
        initComponents();
        this.mainJFrame = mainJFrame;
        this.ecoSystem = ecoSystem;
        
        //mainJFrame. setExtendedState(JFrame. MAXIMIZED_BOTH);
    }
    
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/Images/plane-landing-runway-sunset.png");
//        System.out.println("ui.Airline.AddFlight.paintComponent()"+this.getWidth()+" "+this.getHeight());
        g.drawImage(img.getImage(), 0, 0, this.getWidth()/2, this.getHeight(), null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        txtUsername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordIcon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        jMenu1.setText("jMenu1");

        setBackground(new java.awt.Color(255, 153, 153));
        setForeground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(800, 800));
        setLayout(null);

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        add(txtUsername);
        txtUsername.setBounds(970, 350, 220, 50);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(940, 520, 200, 40);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Not registered yet?");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3);
        jLabel3.setBounds(980, 580, 150, 20);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 3, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Airline Reservation System");
        add(jLabel4);
        jLabel4.setBounds(740, 30, 680, 130);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login (1).png"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(970, 150, 140, 130);

        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/padlock (1).png"))); // NOI18N
        passwordIcon.setText("jLabel7");
        add(passwordIcon);
        passwordIcon.setBounds(860, 420, 70, 80);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-username-96.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        add(jLabel7);
        jLabel7.setBounds(850, 340, 90, 70);

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        add(txtPassword);
        txtPassword.setBounds(970, 430, 220, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        RegisterUser registerUser = new RegisterUser(mainJFrame, ecoSystem);
        mainJFrame.setContentPane(registerUser);
        mainJFrame.revalidate();
        mainJFrame.repaint();
        return;
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String userName = txtUsername.getText();
        String password = txtPassword.getText();
        
        if(userName == null || "".equals(userName.trim())   )
        {
            showMessageDialog(this, "Please enter a valid Username", "Error", ERROR_MESSAGE);
            return;
        }
        else if(password == null || "".equals(password.trim()))
        {
            showMessageDialog(this, "Please enter a valid password", "Error", ERROR_MESSAGE);
            return;
        }
        
        UserAccount userAccount = ecoSystem.getUserAccountDirectory().authenticateUser(userName, password);
        if(userAccount == null)
        {
            showMessageDialog(this, "Invalid Username or Password", "Error", ERROR_MESSAGE);
            return;
        }
        
        String userRole = ecoSystem.getRole().getUserRole(userName);
        
        if(Role.adminRole.equals(userRole)) {
            AdminPanel adminPanel = new AdminPanel(mainJFrame, ecoSystem);
            mainJFrame.setContentPane(adminPanel);
            mainJFrame.revalidate();
            mainJFrame.repaint();
        }
        else if(Role.customerRole.equals(userRole)) {
            Customer customer = ecoSystem.getCustomerDirectory().getCustomerFromUsername(userName);
            CustomerPanel customerPanel = new CustomerPanel(ecoSystem, customer, mainJFrame);
            mainJFrame.setContentPane(customerPanel);
            mainJFrame.revalidate();
            mainJFrame.repaint();
        }
        
        else if(Role.airlineRole.equals(userRole)) {
            Airline airline = ecoSystem.getAirlineDirectory().getAirlineFromUsername(userName);
            AirlinePanel airlinePanel = new AirlinePanel(ecoSystem, airline, mainJFrame);
            mainJFrame.setContentPane(airlinePanel);
            mainJFrame.revalidate();
            mainJFrame.repaint();
        }
        
        else if(Role.airportRole.equals(userRole)) {
            Airport airport = ecoSystem.getAirportDirectory().getAirportFromUsername(userName);
            AirportPanel airportPanel = new AirportPanel(ecoSystem, airport, mainJFrame);
            mainJFrame.setContentPane(airportPanel);
            mainJFrame.revalidate();
            mainJFrame.repaint();
        }
        else if(Role.restaurantRole.equals(userRole)) {
            Restaurant restaurant = ecoSystem.getRestaurantDirectory().getRestaurantFromUsername(userName);
            RestaurantPanel restaurantPanel = new RestaurantPanel(mainJFrame, restaurant, ecoSystem);
            mainJFrame.setContentPane(restaurantPanel);
            mainJFrame.revalidate();
            mainJFrame.repaint();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel passwordIcon;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
