/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend.Airline;

import business.EcoSystem;
import business.airline.Airline;
import business.airline.Airplane;
import business.airport.Airport;
import business.employee.AirlineEmployee;
import business.util.Constant;
import business.util.Utils;
import java.awt.Graphics;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author mamthashetty
 */
public class AddFlight extends javax.swing.JPanel {

    /**
     * Creates new form AddFlight
     */
    EcoSystem ecoSystem;
    Airline airline;
    JFrame mainJFrame;
    public AddFlight(EcoSystem ecoSystem, Airline airline, JFrame mainJFrame) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.airline = airline;
        this.mainJFrame = mainJFrame;
        jPanel1.setOpaque(false);
        populatePilotTable();
        populateCabinCrewTable();
        
        List<Airport> airports = ecoSystem.getAirportDirectory().getAirports();
        for(Airport airport : airports)
        {
            comboBoxDeprature.addItem(airport.getAirportName());
            comboBoxArrival.addItem(airport.getAirportName());
        }
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

        jPanel1 = new javax.swing.JPanel();
        txtFlightNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNoOfCabinCrew = new javax.swing.JTextField();
        txtDepartureTime = new javax.swing.JTextField();
        txtModelNo = new javax.swing.JTextField();
        btnAddFlight = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTotalHours = new javax.swing.JTextField();
        txtNoOfPilot = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPilot = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCabinCrew = new javax.swing.JTable();
        comboBoxArrival = new javax.swing.JComboBox<>();
        comboBoxDeprature = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();

        jPanel1.setForeground(new java.awt.Color(255, 153, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));

        txtFlightNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Model No:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Destination:");

        txtNoOfCabinCrew.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDepartureTime.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N
        txtDepartureTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartureTimeActionPerformed(evt);
            }
        });

        txtModelNo.setFont(new java.awt.Font("Agency FB", 0, 14)); // NOI18N

        btnAddFlight.setBackground(new java.awt.Color(255, 255, 255));
        btnAddFlight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddFlight.setForeground(new java.awt.Color(0, 153, 255));
        btnAddFlight.setText("Add");
        btnAddFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFlightActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Departure:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("No of Pilot:");

        txtTotalHours.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotalHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHoursActionPerformed(evt);
            }
        });

        txtNoOfPilot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Departure Time:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("No of Cabin Crew");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Total hours:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Flight No:");

        tblPilot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblPilot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Name", "Experience"
            }
        ));
        tblPilot.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(tblPilot);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Add Pilot's:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Add Cabin Crew: ");

        tblCabinCrew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblCabinCrew.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Name", "Experience"
            }
        ));
        tblCabinCrew.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane2.setViewportView(tblCabinCrew);

        comboBoxDeprature.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboBoxDeprature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDepratureActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Price");

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("(HH:mm)");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("(HH:mm)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFlightNo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtModelNo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrice)
                    .addComponent(comboBoxDeprature, 0, 281, Short.MAX_VALUE))
                .addGap(573, 573, 573))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(190, 190, 190)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(27, 27, 27)
                                    .addComponent(txtDepartureTime))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)))
                                        .addComponent(jLabel9))
                                    .addGap(26, 26, 26)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboBoxArrival, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTotalHours)
                                        .addComponent(txtNoOfPilot)
                                        .addComponent(txtNoOfCabinCrew))))
                            .addGap(89, 89, 89))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap(316, Short.MAX_VALUE)
                            .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(149, 149, 149)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFlightNo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxDeprature))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel10)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(txtModelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(266, 266, 266)))
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(972, 972, 972))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(119, 119, 119)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                                    .addComponent(txtDepartureTime, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboBoxArrival, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTotalHours, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(txtNoOfCabinCrew, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtNoOfPilot, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                    .addGap(45, 45, 45)))
                            .addGap(21, 21, 21)
                            .addComponent(jLabel9)
                            .addGap(75, 75, 75)
                            .addComponent(btnAddFlight, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(870, 870, 870)))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel11.setText("Add Flight");

        btnBack2.setBackground(new java.awt.Color(255, 255, 255));
        btnBack2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack2.setForeground(new java.awt.Color(0, 153, 255));
        btnBack2.setText("<< Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1191, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1511, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDepartureTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartureTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartureTimeActionPerformed

    private void txtTotalHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHoursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHoursActionPerformed

    private void btnAddFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFlightActionPerformed
        String flightNo = (String) txtFlightNo.getText();
        String modelNo = (String) txtModelNo.getText();
        String departureAirport = (String) comboBoxDeprature.getSelectedItem();
        String departureTime = (String) txtDepartureTime.getText();
        String arrivalAirport = (String) comboBoxArrival.getSelectedItem();
        String totalHours = (String) txtTotalHours.getText();
        String noOfPilot = (String) txtNoOfPilot.getText();
        String noOfCabinCrew = (String) txtNoOfCabinCrew.getText();
        String price = (String) txtPrice.getText();
        
        Airport departure = ecoSystem.getAirportDirectory().getAirportFromName(departureAirport);
        Airport arrival = ecoSystem.getAirportDirectory().getAirportFromName(arrivalAirport);
        
        if(flightNo == null || "".equals(flightNo.trim())) {
            showMessageDialog(this, "Please enter a valid Flight No", "Error", ERROR_MESSAGE);
            return;
        }
        else if(modelNo == null || "".equals(modelNo.trim())) {
            showMessageDialog(this, "Please enter a valid model No", "Error", ERROR_MESSAGE);
            return;
        }
        else if(departureTime == null || "".equals(departureTime.trim())) {
            showMessageDialog(this, "Please enter a valid departure time", "Error", ERROR_MESSAGE);
            return;
        }
        else if(totalHours == null || "".equals(totalHours.trim())) {
            showMessageDialog(this, "Please enter a valid total hour journey", "Error", ERROR_MESSAGE);
            return;
        }
        else if(noOfPilot == null || "".equals(noOfPilot.trim()) || !Pattern.matches("^[0-9]+$", noOfPilot.trim()) || Integer.parseInt(noOfPilot.trim()) < 1) {
            showMessageDialog(this, "Please enter a valid no of pilot", "Error", ERROR_MESSAGE);
            return;
        }
        else if(noOfCabinCrew == null || "".equals(noOfCabinCrew.trim()) || !Pattern.matches("^[0-9]+$", noOfCabinCrew.trim()) || Integer.parseInt(noOfCabinCrew.trim()) < 1) {
            showMessageDialog(this, "Please enter a valid no of cabin crew", "Error", ERROR_MESSAGE);
            return;
        }
        else if(price == null || "".equals(price.trim()) || !Pattern.matches("^[0-9]+$", price.trim())) {
            showMessageDialog(this, "Please enter a valid price", "Error", ERROR_MESSAGE);
            return;
        }

        if(departureAirport.equals(arrivalAirport))
        {
            showMessageDialog(this, "Departure and Arrival airport cannot be same", "Error", ERROR_MESSAGE);
            return;
        }
        else if(ecoSystem.getAirplaneDirectory().getAirplaneFromAirplaneNo(flightNo) != null)
        {
            showMessageDialog(this, "Flight with same Flight number exists, please provide unique flight numbers", "Error", ERROR_MESSAGE);
            return;
        }

        int[] pilotSelected = tblPilot.getSelectedRows();
        int[] cabinCrewSelected = tblCabinCrew.getSelectedRows();
        if(pilotSelected.length != Integer.parseInt(noOfPilot))
        {
            showMessageDialog(this, "Please select " + noOfPilot + " no of pilot", "Error", ERROR_MESSAGE);
            return;
        }
        else if(cabinCrewSelected.length != Integer.parseInt(noOfCabinCrew))
        {
            showMessageDialog(this, "Please select " + noOfCabinCrew + " no of cabin crew", "Error", ERROR_MESSAGE);
            return;
        }

        Airplane airplane = ecoSystem.getAirplaneDirectory().addAirplane();
        airplane.setAirline(airline);
        airplane.setAirplaneNo(flightNo);
        airplane.setModelNo(modelNo);
        airplane.setDepartureAirport(departure);
        airplane.setDepartureTime(departureTime);
        airplane.setArrivalAirport(arrival);
        airplane.setTotalHours(totalHours);
        airplane.setNoOfPilot(noOfPilot);
        airplane.setNoOfAirHostess(noOfPilot);
        airplane.setPrice(price);

        DefaultTableModel model = (DefaultTableModel) tblPilot.getModel();

        for (int i = 0; i < pilotSelected.length; i++) {
            airplane.getEmployees().add((AirlineEmployee) model.getValueAt(pilotSelected[i], 0));
            AirlineEmployee airlineEmployee = (AirlineEmployee) model.getValueAt(pilotSelected[i], 0);
            airlineEmployee.getAirplanes().add(airplane);
        }

        model = (DefaultTableModel) tblCabinCrew.getModel();
        for (int i = 0; i < cabinCrewSelected.length; i++) {
            airplane.getEmployees().add((AirlineEmployee) model.getValueAt(cabinCrewSelected[i], 0));
            AirlineEmployee airlineEmployee = (AirlineEmployee) model.getValueAt(cabinCrewSelected[i], 0);
            airlineEmployee.getAirplanes().add(airplane);
        }
        airline.getAirplanes().add(airplane);

        showMessageDialog(this, "Flight request has been sent to airport successfully");
    }//GEN-LAST:event_btnAddFlightActionPerformed

    private void comboBoxDepratureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDepratureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDepratureActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        ViewFlight viewFlight = new ViewFlight(mainJFrame, airline, ecoSystem);
        Utils.previosPage(viewFlight);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFlight;
    private javax.swing.JButton btnBack2;
    private javax.swing.JComboBox<String> comboBoxArrival;
    private javax.swing.JComboBox<String> comboBoxDeprature;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCabinCrew;
    private javax.swing.JTable tblPilot;
    private javax.swing.JTextField txtDepartureTime;
    private javax.swing.JTextField txtFlightNo;
    private javax.swing.JTextField txtModelNo;
    private javax.swing.JTextField txtNoOfCabinCrew;
    private javax.swing.JTextField txtNoOfPilot;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtTotalHours;
    // End of variables declaration//GEN-END:variables

    private void populatePilotTable() {
        DefaultTableModel model = (DefaultTableModel) tblPilot.getModel();
        model.setRowCount(0);
        List<AirlineEmployee> airlineEmployees = ecoSystem.getAirlineEmployeeDirectory().getAirlineEmployees();

        for(AirlineEmployee airlineEmployee : airlineEmployees)
        {
            if(!airline.equals(airlineEmployee.getAirline()))
                continue;
            if(!Constant.pilot.equals(airlineEmployee.getPosition()))
                continue;
            Object[] row = new Object[3];
            row[0] = airlineEmployee;
            row[1] = airlineEmployee.getName();
            row[2] = airlineEmployee.getAirplanes().size();
            model.addRow(row);
        }
    }

    private void populateCabinCrewTable() {
        DefaultTableModel model = (DefaultTableModel) tblCabinCrew.getModel();
        model.setRowCount(0);
        List<AirlineEmployee> airlineEmployees = ecoSystem.getAirlineEmployeeDirectory().getAirlineEmployees();

        for(AirlineEmployee airlineEmployee : airlineEmployees)
        {
            if(!airline.equals(airlineEmployee.getAirline()))
                continue;
            if(!Constant.cabinCrew.equals(airlineEmployee.getPosition()))
                continue;
            Object[] row = new Object[3];
            row[0] = airlineEmployee;
            row[1] = airlineEmployee.getName();
            row[2] = airlineEmployee.getAirplanes().size();
            model.addRow(row);
        }
    }
}
