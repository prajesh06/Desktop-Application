/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.User;

import Business.Connection.Connection;
import Business.Network;
import Business.User.User;
import UserInterface.EmailPage;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author barua
 */
public class ViewRequest extends javax.swing.JPanel {

    /**
     * Creates new form UserHomePage
     */
    private JPanel userProcessContainer;
    private Network network;
    private User user;

    public ViewRequest(JPanel userProcessContainer, Network network, User user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.user = user;
        getConnections();
    }

    public void getConnections() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) userdetails_jTable.getModel();
        DefaultTableModel secondDefaultTableModel = (DefaultTableModel) requestRiaseByYou.getModel();
        TableColumnModel tableColumnModel = userdetails_jTable.getColumnModel();
        for (Connection connection : network.getConnectionDirectory().getConnectionDirectory()) {
            if (connection.getSenderUser().getEmailId().equals(user.getEmailId())) {
                Object row[] = new Object[defaultTableModel.getColumnCount()];
                row[0] = connection.getRecieverUser();
                row[1] = connection.getSenderUser();
                row[2] = connection.getRecieverUser().getBloodGroup();
                row[3] = connection.getRecieverUser().getAddress().getZipCode();
                row[4] = connection.getStatus();
                row[5] = connection.getHospital().getHospitalName();
                row[6] = connection.getHospital();
                row[7] = connection;
                row[8] = connection.getAppointmentDate();
                if(connection.getAssignee() == null)
                {
                    row[9] = "Not Assigned Yet";
                }
                else
                {
                    row[9] = connection.getAssignee().getEmployee().getEmployeeName();
                }
                secondDefaultTableModel.addRow(row);
            }
            if (connection.getRecieverUser().getEmailId().equals(user.getEmailId())) {
                Object row[] = new Object[defaultTableModel.getColumnCount()];
                row[0] = connection.getRecieverUser();
                row[1] = connection.getSenderUser();
                row[2] = connection.getSenderUser().getBloodGroup();
                row[3] = connection.getSenderUser().getAddress().getZipCode();
                row[4] = connection.getStatus();
                row[5] = connection.getHospital().getHospitalName();
                row[6] = connection.getHospital();
                row[7] = connection;
                row[8] = connection.getAppointmentDate();
                if(connection.getAssignee() == null)
                {
                    row[9] = "Not Assigned Yet";
                }
                else
                {
                    row[9] = connection.getAssignee().getEmployee().getEmployeeName();
                }
                defaultTableModel.addRow(row);
            }

        }
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
        userdetails_jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        scheduleAppointmentJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestRiaseByYou = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userdetails_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor Name", "Receiver Name", "Blood group", "Zip Code", "Conection Status", "Hsopital Name", "Hospital Emaill", "Hospital Status", "Appointment Date", "Assigned To"
            }
        ));
        jScrollPane1.setViewportView(userdetails_jTable);
        if (userdetails_jTable.getColumnModel().getColumnCount() > 0) {
            userdetails_jTable.getColumnModel().getColumn(0).setResizable(false);
            userdetails_jTable.getColumnModel().getColumn(2).setResizable(false);
            userdetails_jTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 64, 1187, 183));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Need Blood Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 19, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16/Knob-Fast-Rewind-icon.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1119, 11, -1, -1));

        scheduleAppointmentJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16/Knob-Valid-Green-icon.png"))); // NOI18N
        scheduleAppointmentJButton.setText("Schedule Appointment");
        scheduleAppointmentJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleAppointmentJButtonActionPerformed(evt);
            }
        });
        add(scheduleAppointmentJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 274, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Request Raise by You");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 310, -1, -1));

        requestRiaseByYou.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donor Name", "Receiver Name", "Blood group", "Zip Code", "Conection Status", "Hsopital Name", "Hospital Emaill", "Hospital Status", "Appointment Date", "Assigned To"
            }
        ));
        jScrollPane2.setViewportView(requestRiaseByYou);
        if (requestRiaseByYou.getColumnModel().getColumnCount() > 0) {
            requestRiaseByYou.getColumnModel().getColumn(0).setResizable(false);
            requestRiaseByYou.getColumnModel().getColumn(2).setResizable(false);
            requestRiaseByYou.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 356, 1187, 183));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/watermark_1.PNG"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed


    private void scheduleAppointmentJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleAppointmentJButtonActionPerformed
        // TODO add your handling code here:
        int row = userdetails_jTable.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
        Connection connection = (Connection) userdetails_jTable.getValueAt(row, 7);        
        if (connection.getHospitalStatus().equals("Schedule Appointment") && connection.getStatus().equals("Connected")){
            ScheduleAppointment scheduleAppointment = new ScheduleAppointment(userProcessContainer, network, user, connection);
            userProcessContainer.add("ScheduleAppointment", scheduleAppointment);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            
        }else
        {
            JOptionPane.showMessageDialog(null, "You cannot book the appointment as request hasn't been approved by hospital.");
        }
    }//GEN-LAST:event_scheduleAppointmentJButtonActionPerformed
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable requestRiaseByYou;
    private javax.swing.JButton scheduleAppointmentJButton;
    private javax.swing.JTable userdetails_jTable;
    // End of variables declaration//GEN-END:variables
}
