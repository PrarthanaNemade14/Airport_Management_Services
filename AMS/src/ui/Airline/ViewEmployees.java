/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Airline;

import business.EcoSystem;
import business.airline.Airline;
import business.employee.AirlineEmployee;
import business.util.Constant;
import business.util.Utils;
import java.awt.Graphics;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shreyasoni
 */
public class ViewEmployees extends javax.swing.JPanel {

    /**
     * Creates new form ViewEmployees
     */
    EcoSystem ecoSystem;
    Airline airline;
    JFrame mainJFrame;
    public ViewEmployees(JFrame mainJFrame, Airline airline,EcoSystem ecoSystem) {
        initComponents();
        this.mainJFrame = mainJFrame;
        this.ecoSystem = ecoSystem;
        this.airline = airline;
        jPanel1.setOpaque(false);
        
        populatePilotTable("");
        populateCabinCrewTable("");
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPilot = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPiotSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCabinCrew = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtCabinSearch = new javax.swing.JTextField();
        btnPilotEdit = new javax.swing.JButton();
        btnCabinCrewEdit = new javax.swing.JButton();
        btnDeletePilot = new javax.swing.JButton();
        btnDeleteCabinCrew = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel1.setText("Employees");

        tblPilot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "Name", "Age", "Email", "Experince"
            }
        ));
        jScrollPane1.setViewportView(tblPilot);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus.png"))); // NOI18N
        jButton1.setText("Employee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 204));
        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel2.setText("Search By Name:");

        txtPiotSearch.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtPiotSearchInputMethodTextChanged(evt);
            }
        });
        txtPiotSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPiotSearchActionPerformed(evt);
            }
        });
        txtPiotSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPiotSearchKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel3.setText("Pilots");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel4.setText("Cabin Crew");

        tblCabinCrew.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "Name", "Age", "Email", "Experience"
            }
        ));
        jScrollPane3.setViewportView(tblCabinCrew);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel5.setText("Search By Name:");

        txtCabinSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCabinSearchActionPerformed(evt);
            }
        });
        txtCabinSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCabinSearchKeyReleased(evt);
            }
        });

        btnPilotEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnPilotEdit.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnPilotEdit.setText("Edit");
        btnPilotEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilotEditActionPerformed(evt);
            }
        });

        btnCabinCrewEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnCabinCrewEdit.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnCabinCrewEdit.setText("Edit");
        btnCabinCrewEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCabinCrewEditActionPerformed(evt);
            }
        });

        btnDeletePilot.setBackground(new java.awt.Color(255, 255, 255));
        btnDeletePilot.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDeletePilot.setText("Delete");
        btnDeletePilot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePilotActionPerformed(evt);
            }
        });

        btnDeleteCabinCrew.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteCabinCrew.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDeleteCabinCrew.setText("Delete");
        btnDeleteCabinCrew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCabinCrewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtPiotSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(190, 190, 190)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(27, 27, 27)
                                .addComponent(txtCabinSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnPilotEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(btnDeletePilot, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCabinCrewEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(25, 25, 25)
                                        .addComponent(btnDeleteCabinCrew, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtPiotSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPilotEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletePilot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtCabinSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCabinCrewEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteCabinCrew, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(940, 940, 940))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AddAirlineEmployeePanel addAirineEmployeePanel = new AddAirlineEmployeePanel(mainJFrame, airline, ecoSystem);
        Utils.newPage(addAirineEmployeePanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPilotEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilotEditActionPerformed
        int selectedRow = tblPilot.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit employee detail", "Error", ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPilot.getModel();
        AirlineEmployee airlineEmployee = (AirlineEmployee) model.getValueAt(selectedRow, 0);
        EditAirlineEmployeePanel editAirlineEmployeePanel = new EditAirlineEmployeePanel(mainJFrame, airline, ecoSystem, airlineEmployee);
        Utils.newPage(editAirlineEmployeePanel);
    }//GEN-LAST:event_btnPilotEditActionPerformed

    private void btnCabinCrewEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCabinCrewEditActionPerformed
        int selectedRow = tblCabinCrew.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit employee detail", "Error", ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCabinCrew.getModel();
        AirlineEmployee airlineEmployee = (AirlineEmployee) model.getValueAt(selectedRow, 0);
        EditAirlineEmployeePanel editAirlineEmployeePanel = new EditAirlineEmployeePanel(mainJFrame, airline, ecoSystem, airlineEmployee);
        Utils.newPage(editAirlineEmployeePanel);
    }//GEN-LAST:event_btnCabinCrewEditActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AirlinePanel airlinePanel = new AirlinePanel(ecoSystem, airline, mainJFrame);
        Utils.previosPage(airlinePanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPiotSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPiotSearchActionPerformed
    }//GEN-LAST:event_txtPiotSearchActionPerformed

    private void txtCabinSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCabinSearchActionPerformed
    }//GEN-LAST:event_txtCabinSearchActionPerformed

    private void txtPiotSearchInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtPiotSearchInputMethodTextChanged
    }//GEN-LAST:event_txtPiotSearchInputMethodTextChanged

    private void txtPiotSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPiotSearchKeyReleased
        String pilotName = txtPiotSearch.getText();
        populatePilotTable(pilotName);
    }//GEN-LAST:event_txtPiotSearchKeyReleased

    private void txtCabinSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCabinSearchKeyReleased
        String cabinCrew = txtCabinSearch.getText();
        populateCabinCrewTable(cabinCrew);
    }//GEN-LAST:event_txtCabinSearchKeyReleased

    private void btnDeletePilotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePilotActionPerformed
        int selectedRow = tblPilot.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit employee detail", "Error", ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPilot.getModel();
        AirlineEmployee airlineEmployee = (AirlineEmployee) model.getValueAt(selectedRow, 0);
        if(airlineEmployee.getAirplanes().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Employee is already assign to flight, Please remove employee from flight first", "Error", ERROR_MESSAGE);
            return;
        }
        airline.getEmployees().remove(airlineEmployee);
        populatePilotTable(txtPiotSearch.getText());
    }//GEN-LAST:event_btnDeletePilotActionPerformed

    private void btnDeleteCabinCrewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCabinCrewActionPerformed
        int selectedRow = tblCabinCrew.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit employee detail", "Error", ERROR_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCabinCrew.getModel();
        AirlineEmployee airlineEmployee = (AirlineEmployee) model.getValueAt(selectedRow, 0);
        if(airlineEmployee.getAirplanes().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Employee is already assign to flight, Please remove employee from flight first", "Error", ERROR_MESSAGE);
            return;
        }
        airline.getEmployees().remove(airlineEmployee);
        populateCabinCrewTable(txtCabinSearch.getText());
    }//GEN-LAST:event_btnDeleteCabinCrewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCabinCrewEdit;
    private javax.swing.JButton btnDeleteCabinCrew;
    private javax.swing.JButton btnDeletePilot;
    private javax.swing.JButton btnPilotEdit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tblCabinCrew;
    private javax.swing.JTable tblPilot;
    private javax.swing.JTextField txtCabinSearch;
    private javax.swing.JTextField txtPiotSearch;
    // End of variables declaration//GEN-END:variables

    private void populatePilotTable(String filterValue) {
        DefaultTableModel model = (DefaultTableModel) tblPilot.getModel();
        model.setRowCount(0);
        List<AirlineEmployee> airlineEmployees = ecoSystem.getAirlineEmployeeDirectory().getAirlineEmployees();

        for(AirlineEmployee airlineEmployee : airlineEmployees)
        {
            if(!airline.equals(airlineEmployee.getAirline()))
                continue;
            if(!Constant.pilot.equals(airlineEmployee.getPosition()))
                continue;
            if(filterValue != null && ! "".equals(filterValue.trim()) && !airlineEmployee.getName().toLowerCase().startsWith(filterValue.toLowerCase()))
                continue;
            Object[] row = new Object[5];
            row[0] = airlineEmployee;
            row[1] = airlineEmployee.getName();
            row[2] = airlineEmployee.getAge();
            row[3] = airlineEmployee.getEmail();
            row[4] = airlineEmployee.getAirplanes().size();
            model.addRow(row);
        }
    }

    private void populateCabinCrewTable(String filterValue) {
        DefaultTableModel model = (DefaultTableModel) tblCabinCrew.getModel();
        model.setRowCount(0);
        List<AirlineEmployee> airlineEmployees = ecoSystem.getAirlineEmployeeDirectory().getAirlineEmployees();

        for(AirlineEmployee airlineEmployee : airlineEmployees)
        {
            if(!airline.equals(airlineEmployee.getAirline()))
                continue;
            if(!Constant.cabinCrew.equals(airlineEmployee.getPosition()))
                continue;
            if(filterValue != null && ! "".equals(filterValue.trim()) && !airlineEmployee.getName().toLowerCase().startsWith(filterValue.toLowerCase()))
                continue;
            Object[] row = new Object[5];
            row[0] = airlineEmployee;
            row[1] = airlineEmployee.getName();
            row[2] = airlineEmployee.getAge();
            row[3] = airlineEmployee.getEmail();
            row[4] = airlineEmployee.getAirplanes().size();
            model.addRow(row);
        }
    }
}