/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.User;

import Business.Address.Address;
import Business.Network;
import Business.User.User;
import UserInterface.LoginPage;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author barua
 */
public class RegisterUser extends javax.swing.JPanel {

    /**
     * Creates new form RegisterUser
     */
    private JPanel userProcessContainer;
    private Network network;

    public RegisterUser(JPanel userProcessContainer, Network network) {
        initComponents();
        //createAccountButton.setEnabled(false);
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        genderComboBox.removeAllItems();
        genderComboBox.addItem("Male");
        genderComboBox.addItem("Female");
        genderComboBox.addItem("Other");
        bloodGroupComboBox.removeAllItems();
        bloodGroupComboBox.addItem("O+ve");
        bloodGroupComboBox.addItem("O-ve");
        bloodGroupComboBox.addItem("A+ve");
        bloodGroupComboBox.addItem("A-ve");
        bloodGroupComboBox.addItem("B+ve");
        bloodGroupComboBox.addItem("B-ve");
        bloodGroupComboBox.addItem("AB+ve");
        bloodGroupComboBox.addItem("AB-ve");
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
        fullNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateOfBirthTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        socialSecurityNumberTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailIdTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        confirmEmailIdTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        contactNumberTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox();
        bloodGroupComboBox = new javax.swing.JComboBox();
        streetAddressTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        zipCodeTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        stateTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        createAccountButton = new javax.swing.JButton();
        errorForConfirmEmailIdLabel = new javax.swing.JLabel();
        backToHomeButton = new javax.swing.JButton();
        errorForDateLabel = new javax.swing.JLabel();
        errorForEmailIdLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        reenterPasswordTextField = new javax.swing.JPasswordField();
        errorForContactNumber = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Full Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 90, 109, -1));

        fullNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameTextFieldActionPerformed(evt);
            }
        });
        add(fullNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 87, 175, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Create A New Account ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 26, -1, -1));

        jLabel3.setText("Date of Birth");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 128, 109, -1));

        dateOfBirthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateOfBirthTextFieldActionPerformed(evt);
            }
        });
        dateOfBirthTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dateOfBirthTextFieldKeyReleased(evt);
            }
        });
        add(dateOfBirthTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 125, 175, -1));

        jLabel4.setText("Gender");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 166, 50, -1));

        jLabel5.setText("Blood Group");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 204, 72, -1));

        jLabel6.setText("Social Security Number");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 245, -1, -1));
        add(socialSecurityNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 239, 175, -1));

        jLabel7.setText("Email Address");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 283, 98, -1));

        emailIdTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailIdTextFieldKeyReleased(evt);
            }
        });
        add(emailIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 277, 175, -1));

        jLabel8.setText("Confirm Email Address");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 321, 109, -1));

        confirmEmailIdTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confirmEmailIdTextFieldKeyReleased(evt);
            }
        });
        add(confirmEmailIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 315, 175, -1));

        jLabel9.setText("Contact Number");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 359, -1, -1));

        contactNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNumberTextFieldActionPerformed(evt);
            }
        });
        contactNumberTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contactNumberTextFieldKeyReleased(evt);
            }
        });
        add(contactNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 353, 175, -1));

        jLabel10.setText("Address ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 391, 50, -1));

        cityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextFieldActionPerformed(evt);
            }
        });
        add(cityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 423, 137, -1));

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 163, 175, -1));

        bloodGroupComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(bloodGroupComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 201, 175, -1));

        streetAddressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetAddressTextFieldActionPerformed(evt);
            }
        });
        add(streetAddressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 423, 175, -1));

        jLabel11.setText("Street Address");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 426, 109, -1));

        jLabel12.setText("City");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 426, 50, -1));

        jLabel13.setText("Zip Code");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 426, 50, -1));

        zipCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipCodeTextFieldActionPerformed(evt);
            }
        });
        add(zipCodeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 423, 86, -1));

        jLabel14.setText("State");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 426, 50, -1));

        stateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateTextFieldActionPerformed(evt);
            }
        });
        add(stateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 423, 137, -1));

        jLabel15.setText("Password");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 464, 78, -1));

        jLabel16.setText("Re Enter Password");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 502, 100, -1));

        createAccountButton.setBackground(new java.awt.Color(242, 242, 242));
        createAccountButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16/Knob-Valid-Blue-icon.png"))); // NOI18N
        createAccountButton.setText("Create Account");
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });
        add(createAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 537, -1, -1));

        errorForConfirmEmailIdLabel.setForeground(new java.awt.Color(255, 0, 51));
        add(errorForConfirmEmailIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 315, 549, 20));
        backToHomeButton.setBackground(new java.awt.Color(242, 242, 242));
        backToHomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16/Knob-Fast-Rewind-icon.png"))); // NOI18N
        backToHomeButton.setText("Back To Home");
        backToHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToHomeButtonActionPerformed(evt);
            }
        });
        add(backToHomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 11, -1, -1));

        errorForDateLabel.setForeground(new java.awt.Color(255, 0, 51));
        errorForDateLabel.setText("MM/DD/YYYY");
        add(errorForDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 125, 592, 20));

        errorForEmailIdLabel.setForeground(new java.awt.Color(255, 0, 51));
        add(errorForEmailIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 277, 549, 20));
        add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 461, 175, -1));
        add(reenterPasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 499, 175, -1));
        errorForContactNumber.setForeground(new java.awt.Color(255, 0, 51));
        add(errorForContactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 353, 533, 20));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/watermark_1.PNG"))); // NOI18N
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void fullNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameTextFieldActionPerformed

    private void cityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextFieldActionPerformed

    private void streetAddressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetAddressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetAddressTextFieldActionPerformed

    private void zipCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipCodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipCodeTextFieldActionPerformed

    private void stateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateTextFieldActionPerformed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        // TODO add your handling code here:
        try {
            if (fullNameTextField.getText().equals("") || dateOfBirthTextField.getText().equals("") || dateOfBirthTextField.getText().equals("")
                    || socialSecurityNumberTextField.getText().equals("") || emailIdTextField.equals("") || contactNumberTextField.equals("") || streetAddressTextField.equals("")
                    || cityTextField.equals("") || zipCodeTextField.equals("") || stateTextField.equals("")) {
                JOptionPane.showMessageDialog(null, "Enter all fields");
            } else {
                if (reenterPasswordTextField.getText().equals(passwordTextField.getText())) {
                    try {
                        if (errorForDateLabel.getText().equals("") && errorForEmailIdLabel.getText().equals("") && errorForConfirmEmailIdLabel.getText().equals("Correct") && errorForContactNumber.getText().equals("")) {
                            User user = network.getUserDirectory().addUser(emailIdTextField.getText());
                            if (user == null) {
                                errorForConfirmEmailIdLabel.setText("Email ID Already Exist");
                            } else {
                                user.setDateOfBirth(new Date(dateOfBirthTextField.getText()));
                                user.setFullName(fullNameTextField.getText());
                                user.setGender((String) genderComboBox.getSelectedItem());
                                user.setBloodGroup((String) bloodGroupComboBox.getSelectedItem());
                                user.setSocialSecurityNumber(socialSecurityNumberTextField.getText());
                                user.setEmailId(emailIdTextField.getText());
                                user.setContactNumber(contactNumberTextField.getText());
                                Address address = new Address();
                                address.setStreetAddress(streetAddressTextField.getText());
                                address.setCity(cityTextField.getText());
                                address.setZipCode(zipCodeTextField.getText());
                                address.setState(stateTextField.getText());
                                address.setCountry("United States of America");
                                user.setAddress(address);
                                user.setPassword(passwordTextField.getText());
                                JOptionPane.showMessageDialog(null, "User Account has been created Successfully");
                                fullNameTextField.setText("");
                                dateOfBirthTextField.setText("");
                                socialSecurityNumberTextField.setText("");
                                emailIdTextField.setText("");
                                confirmEmailIdTextField.setText("");
                                errorForConfirmEmailIdLabel.setText("");
                                contactNumberTextField.setText("");
                                streetAddressTextField.setText("");
                                cityTextField.setText("");
                                zipCodeTextField.setText("");
                                stateTextField.setText("");
                                passwordTextField.setText("");
                                reenterPasswordTextField.setText("");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Please enter valid input for date of birth, email id, confirm email and contact Number");
                        }
                    } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, "Please eneter correct date of birth. It should be in MM/DD/YYYY");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Passwords does not match");
                }
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid input");
        }
    }//GEN-LAST:event_createAccountButtonActionPerformed

    private void dateOfBirthTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateOfBirthTextFieldKeyReleased
        // TODO add your handling code here:
        String patternForDate = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
        String date = dateOfBirthTextField.getText();
        Pattern patternFordob = Pattern.compile(patternForDate);
        Matcher matcherForDob = patternFordob.matcher(date);
        if (matcherForDob.matches() == false) {
            errorForDateLabel.setText("Date Should be of Formate MM/DD/YYYY");
        } else {
            errorForDateLabel.setText("");
        }
    }//GEN-LAST:event_dateOfBirthTextFieldKeyReleased

    private void backToHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToHomeButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backToHomeButtonActionPerformed

    private void dateOfBirthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateOfBirthTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_dateOfBirthTextFieldActionPerformed

    private void emailIdTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailIdTextFieldKeyReleased
        // TODO add your handling code here:
        String patternForEmail = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";
        String emailID = emailIdTextField.getText();
        Pattern patternForEmailId = Pattern.compile(patternForEmail);
        Matcher matcherForEmailId = patternForEmailId.matcher(emailID);
        if (matcherForEmailId.matches() == false) {
            errorForEmailIdLabel.setText("Please enter a valid Email ID");
        } else {
            errorForEmailIdLabel.setText("");
        }
    }//GEN-LAST:event_emailIdTextFieldKeyReleased

    private void confirmEmailIdTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmEmailIdTextFieldKeyReleased
        // TODO add your handling code here:
        String emailId = emailIdTextField.getText();
        String confirmEmailId = confirmEmailIdTextField.getText();
        if (emailId.equals(confirmEmailId)) {
            errorForConfirmEmailIdLabel.setForeground(Color.green);
            errorForConfirmEmailIdLabel.setText("Correct");
        } else {
            errorForConfirmEmailIdLabel.setText("Email ID and Confirm Email ID should be same");
        }
    }//GEN-LAST:event_confirmEmailIdTextFieldKeyReleased

    private void contactNumberTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactNumberTextFieldKeyReleased
        // TODO add your handling code here:
        String patternForDate = "\\d{10}";
        String contactNumber = contactNumberTextField.getText();
        Pattern patternFordob = Pattern.compile(patternForDate);
        Matcher matcherForDob = patternFordob.matcher(contactNumber);
        if (matcherForDob.matches() == false) {
            errorForContactNumber.setText("Contact Number should be Numberic and of ten digit");
        } else {
            errorForContactNumber.setText("");
        }
    }//GEN-LAST:event_contactNumberTextFieldKeyReleased

    private void contactNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNumberTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToHomeButton;
    private javax.swing.JComboBox bloodGroupComboBox;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JTextField confirmEmailIdTextField;
    private javax.swing.JTextField contactNumberTextField;
    private javax.swing.JButton createAccountButton;
    private javax.swing.JTextField dateOfBirthTextField;
    private javax.swing.JTextField emailIdTextField;
    private javax.swing.JLabel errorForConfirmEmailIdLabel;
    private javax.swing.JLabel errorForContactNumber;
    private javax.swing.JLabel errorForDateLabel;
    private javax.swing.JLabel errorForEmailIdLabel;
    private javax.swing.JTextField fullNameTextField;
    private javax.swing.JComboBox genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JPasswordField reenterPasswordTextField;
    private javax.swing.JTextField socialSecurityNumberTextField;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JTextField streetAddressTextField;
    private javax.swing.JTextField zipCodeTextField;
    // End of variables declaration//GEN-END:variables
}
