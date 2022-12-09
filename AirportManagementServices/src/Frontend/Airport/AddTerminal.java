/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend.airport;

import Frontend.Airline.*;
import Backend.EcoSystem;
import Backend.airline.Airline;
import Backend.airline.Airplane;
import Backend.airport.Airport;
import Backend.employee.AirlineEmployee;
import Backend.util.Constant;
import Backend.util.Utils;
import java.awt.Graphics;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;

import static javax.swing.JOptionPane.showMessageDialog;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author nemad
 */
public class AddTerminal extends javax.swing.JPanel {

    /**
     * Creates new form AddFlight
     */
    private EcoSystem ecoSystem;
    private Airport airport;
    private JFrame mainJFrame;
    public AddTerminal(EcoSystem ecoSystem, Airport airport, JFrame mainJFrame) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.airport = airport;
        this.mainJFrame = mainJFrame;
    }
    
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/Images/sky.jpeg");
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

        jLabel11 = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();
        txtTerminal = new javax.swing.JTextField();
        txtNoOfgates = new javax.swing.JTextField();
        btnAddFlight = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(114, 43, 173));
        jLabel11.setText("Add Terminal");

        btnBack2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(0, 102, 204));
        btnBack2.setText("<< Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        txtTerminal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNoOfgates.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnAddFlight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddFlight.setForeground(new java.awt.Color(0, 51, 153));
        btnAddFlight.setText("Add");
        btnAddFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFlightActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Terminal");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("No of Gates");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBack2)
                        .addGap(115, 115, 115)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNoOfgates, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(530, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBack2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTerminal, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoOfgates, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel10))
                .addGap(63, 63, 63)
                .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1244, 1244, 1244))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFlightActionPerformed
        String terminal = (String) txtTerminal.getText();
        String noOfGates = txtNoOfgates.getText();
        
        if(terminal == null || "".equals(terminal.trim()) || !Pattern.matches("^[0-9]+$", terminal.trim())) {
            showMessageDialog(this, "Please enter a valid terminal", "Error", ERROR_MESSAGE);
            return;
        }
        else if(noOfGates == null || "".equals(noOfGates.trim()) || !Pattern.matches("^[0-9]+$", noOfGates.trim())) {
            showMessageDialog(this, "Please enter a valid no of gates", "Error", ERROR_MESSAGE);
            return;
        }

        if(airport.getTerminalGate().get(Integer.valueOf(terminal)) != null)
        {
            showMessageDialog(this, "Terminal already exists", "Error", ERROR_MESSAGE);
            return;
        }
        airport.getTerminalGate().put(Integer.valueOf(terminal), Integer.valueOf(noOfGates));
        showMessageDialog(this, "Terminal added successfully");
        txtTerminal.setText("");
        txtNoOfgates.setText("");
    }//GEN-LAST:event_btnAddFlightActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        AirportPanel airportPanel = new AirportPanel(ecoSystem, airport, mainJFrame);
        Utils.previosPage(airportPanel);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFlight;
    private javax.swing.JButton btnBack2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JTextField txtNoOfgates;
    private javax.swing.JTextField txtTerminal;
    // End of variables declaration//GEN-END:variables

}
