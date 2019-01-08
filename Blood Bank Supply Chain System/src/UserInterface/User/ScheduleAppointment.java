/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.User;

import Business.Connection.Connection;
import Business.Network;
import Business.User.User;
import java.awt.CardLayout;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Prajesh
 */
public class ScheduleAppointment extends javax.swing.JPanel {

    /**
     * Creates new form ScheduleAppointment
     */
    private JPanel userProcessContainer;
    private Network network;
    private User user;
    private Connection connection;
    public ScheduleAppointment(JPanel userProcessContainer, Network network, User user, Connection connection) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.user = user;
        this.connection = connection;
        donorNameJLabel.setText(connection.getSenderUser().getFullName());
        recepientNameJLabel.setText(connection.getRecieverUser().getFullName());
        bloodGroup_jlabel.setText(connection.getRecieverUser().getBloodGroup());
        zipCode_jlabel.setText(connection.getHospital().getAddress().getZipCode());
        hospitalNameJLabel.setText(connection.getHospital().getHospitalName());
        emailIDJLabel.setText(connection.getHospital().getHospitalemailId());
        hospitalAddressJLabel.setText(connection.getHospital().getAddress().getStreetAddress() + connection.getHospital().getAddress().getCity() + connection.getHospital().getAddress().getState() + connection.getHospital().getAddress().getZipCode());
        donorNameJLabel.setEnabled(false);
        recepientNameJLabel.setEnabled(false);
        bloodGroup_jlabel.setEnabled(false);
        zipCode_jlabel.setEnabled(false);
        hospitalNameJLabel.setEnabled(false);
        emailIDJLabel.setEnabled(false);
        hospitalAddressJLabel.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        donorJLabel = new javax.swing.JLabel();
        donorNameJLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bloodGroup_jlabel = new javax.swing.JLabel();
        appointmentJLabel = new javax.swing.JLabel();
        hospitalJLabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        zipCode_jlabel = new javax.swing.JLabel();
        hospitalNameJLabel = new javax.swing.JLabel();
        scheduleAppointmentJlabel = new javax.swing.JLabel();
        recepientJLabel = new javax.swing.JLabel();
        recepientNameJLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emailJLabel = new javax.swing.JLabel();
        emailIDJLabel = new javax.swing.JLabel();
        addressJLabel = new javax.swing.JLabel();
        hospitalAddressJLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        appointmentDateTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        scheduleAppointmentJButton = new javax.swing.JButton();
        errorForDateLabel = new javax.swing.JLabel();
        appointmentTimeTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        donorJLabel.setText("Donor Name :");
        add(donorJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 138, 138, -1));

        donorNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(donorNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 138, 273, 14));

        jLabel12.setText("Blood Group:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 208, 138, -1));

        bloodGroup_jlabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(bloodGroup_jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 208, 273, 14));

        appointmentJLabel.setText("Appointment Date:");
        add(appointmentJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 141, 145, -1));

        hospitalJLabel.setText("Hospital Name:");
        add(hospitalJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 348, 138, -1));

        jLabel16.setText("Zip Code:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 251, 138, -1));

        zipCode_jlabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(zipCode_jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 251, 273, 14));

        hospitalNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(hospitalNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 348, 273, 14));

        scheduleAppointmentJlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        scheduleAppointmentJlabel.setText("Schedule Appointment");
        add(scheduleAppointmentJlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 23, -1, -1));

        recepientJLabel.setText("Recepient Name :");
        add(recepientJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 171, 138, -1));

        recepientNameJLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(recepientNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 171, 273, 14));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Blood Donation Details:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 103, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Hospital Details:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 313, -1, -1));

        emailJLabel.setText("Email Id:");
        add(emailJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 380, 138, -1));

        emailIDJLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(emailIDJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 273, 14));

        addressJLabel.setText("Address:");
        add(addressJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 412, 138, -1));

        hospitalAddressJLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add(hospitalAddressJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 412, 273, 14));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Appointment Details:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 103, -1, -1));

        appointmentDateTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                appointmentDateTextFieldKeyReleased(evt);
            }
        });
        add(appointmentDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 138, 161, -1));

        jLabel4.setText("(MM/DD/YYYY)");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 176, 83, -1));
        scheduleAppointmentJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16/Knob-Valid-Green-icon.png"))); // NOI18N
        scheduleAppointmentJButton.setText("Schedule Appointment");
        scheduleAppointmentJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleAppointmentJButtonActionPerformed(evt);
            }
        });
        add(scheduleAppointmentJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(774, 270, -1, -1));
        add(errorForDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 218, 467, 20));
        add(appointmentTimeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 138, 111, -1));

        jLabel6.setText("Formate : HH:MM and Appointment Timing - 9:00 and 21:00");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(822, 171, 297, 25));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/watermark_1.PNG"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void scheduleAppointmentJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleAppointmentJButtonActionPerformed
        try {
            String appointmentDate = appointmentDateTextField.getText() + " " + appointmentTimeTextField.getText();
            connection.setAppointmentDate(new Date(appointmentDate));
            connection.setHospitalStatus("Pending on lab for confirmation");
            JOptionPane.showMessageDialog(null, "Appointment has been booked successfully");
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.remove(this);
            layout.previous(userProcessContainer);

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Please eneter date and in correct formate");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_scheduleAppointmentJButtonActionPerformed

    private void appointmentDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_appointmentDateTextFieldActionPerformed
    private void appointmentDateTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_appointmentDateTextFieldKeyReleased
        // TODO add your handling code here:
        String patternForDate = "^[0-3]{1}[0-9]{1}/[0-1]{1}[1-2]{1}/[1-9]{1}[0-9]{3}$";
        String date = appointmentDateTextField.getText();
        Pattern patternFordob = Pattern.compile(patternForDate);
        Matcher matcherForDob = patternFordob.matcher(date);
        if (matcherForDob.matches() == false) {
            errorForDateLabel.setText("Date Should be of Formate MM/DD/YYYY");
        } else {
            errorForDateLabel.setText("");
        }
    }//GEN-LAST:event_appointmentDateTextFieldKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressJLabel;
    private javax.swing.JTextField appointmentDateTextField;
    private javax.swing.JLabel appointmentJLabel;
    private javax.swing.JTextField appointmentTimeTextField;
    private javax.swing.JLabel bloodGroup_jlabel;
    private javax.swing.JLabel donorJLabel;
    private javax.swing.JLabel donorNameJLabel;
    private javax.swing.JLabel emailIDJLabel;
    private javax.swing.JLabel emailJLabel;
    private javax.swing.JLabel errorForDateLabel;
    private javax.swing.JLabel hospitalAddressJLabel;
    private javax.swing.JLabel hospitalJLabel;
    private javax.swing.JLabel hospitalNameJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel recepientJLabel;
    private javax.swing.JLabel recepientNameJLabel;
    private javax.swing.JButton scheduleAppointmentJButton;
    private javax.swing.JLabel scheduleAppointmentJlabel;
    private javax.swing.JLabel zipCode_jlabel;
    // End of variables declaration//GEN-END:variables
}
