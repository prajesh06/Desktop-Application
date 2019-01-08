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
public class UpdateProfile extends javax.swing.JPanel {

    /**
     * Creates new form UpdateProfile
     */
    private JPanel userProcessContainer;
    private Network network;
    private User user;

    public UpdateProfile(JPanel userProcessContainer, Network network, User user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        this.user = user;
        populateComboBox();
        populateDetails();      

    }
    
    public void populateComboBox()
    {
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
    
    public void populateDetails()
    {
        fullNameTextField.setText(user.getFullName());
        SimpleDateFormat mdyFormat = new SimpleDateFormat("MM-dd-yyyy");
        Date myDate = user.getDateOfBirth();
        String formatedDate = mdyFormat.format(myDate);
        dateOfBirthTextField.setText(formatedDate);
        genderComboBox.setSelectedItem(user.getGender());
        bloodGroupComboBox.setSelectedItem(user.getBloodGroup());
        socialSecurityNumberTextField.setText(user.getSocialSecurityNumber());
        emailIdTextField.setText(user.getEmailId());
        confirmEmailIdTextField.setText(user.getEmailId());
        contactNumberTextField.setText(user.getContactNumber());

        Address address = user.getAddress();
        streetAddressTextField.setText(address.getStreetAddress());
        cityTextField.setText(address.getCity());
        zipCodeTextField.setText(address.getZipCode());
        stateTextField.setText(address.getState());
        passwordTextField.setText(user.getPassword());  
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        updateProfileButton = new javax.swing.JButton();
        confirmEmailIdTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        emailIdTextField = new javax.swing.JTextField();
        errorForDateLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        socialSecurityNumberTextField = new javax.swing.JTextField();
        errorForEmailIdLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        contactNumberTextField = new javax.swing.JTextField();
        dateOfBirthTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fullNameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        stateTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        zipCodeTextField = new javax.swing.JTextField();
        cityTextField = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox();
        bloodGroupComboBox = new javax.swing.JComboBox();
        streetAddressTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backToHomeButton = new javax.swing.JButton();
        passwordTextField = new javax.swing.JPasswordField();
        reenterPasswordTextField = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        errorforcontactNumber = new javax.swing.JLabel();
        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Confirm Email Address");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 299, 133, 20));

        updateProfileButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16/Knob-Upload-icon.png"))); // NOI18N
        updateProfileButton.setText("Update Profile");
        updateProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProfileButtonActionPerformed(evt);
            }
        });
        add(updateProfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, -1, -1));

        confirmEmailIdTextField.setEnabled(false);
        add(confirmEmailIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 299, 175, -1));

        jLabel15.setText("Password");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 445, 78, 20));

        jLabel7.setText("Email Address");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 261, 98, 20));

        jLabel16.setText("Re Enter Password");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 477, 130, 20));

        emailIdTextField.setEnabled(false);
        add(emailIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 261, 175, -1));
        add(errorForDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 592, 20));

        jLabel6.setText("Social Security Number");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 133, 20));
        add(socialSecurityNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 223, 175, -1));
        add(errorForEmailIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 261, 549, 20));

        jLabel4.setText("Gender");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 150, 80, 20));

        jLabel5.setText("Blood Group");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 188, 72, 20));

        jLabel9.setText("Contact Number");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 337, -1, 20));
        add(contactNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 337, 175, -1));

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
        add(dateOfBirthTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 109, 260, -1));

        jLabel3.setText("Date of Birth");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 112, 133, 20));

        fullNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullNameTextFieldActionPerformed(evt);
            }
        });
        add(fullNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 71, 175, -1));

        jLabel1.setText("Full Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 74, 133, 20));

        stateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateTextFieldActionPerformed(evt);
            }
        });
        add(stateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(865, 407, 137, -1));

        jLabel11.setText("Street Address");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 410, 133, 20));

        jLabel12.setText("City");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 50, -1));

        jLabel13.setText("Zip Code");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 410, 50, -1));

        zipCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipCodeTextFieldActionPerformed(evt);
            }
        });
        add(zipCodeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 407, 86, -1));

        cityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextFieldActionPerformed(evt);
            }
        });
        add(cityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 407, 137, -1));

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });
        add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 147, 175, -1));

        bloodGroupComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(bloodGroupComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 185, 175, -1));

        streetAddressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetAddressTextFieldActionPerformed(evt);
            }
        });
        add(streetAddressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 407, 175, -1));

        jLabel14.setText("State");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(811, 410, 50, -1));

        jLabel10.setText("Address ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 375, 60, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Update Profile");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        backToHomeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/16/Knob-Fast-Rewind-icon.png"))); // NOI18N
        backToHomeButton.setText("Back To Home");
        backToHomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToHomeButtonActionPerformed(evt);
            }
        });
        add(backToHomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(883, 28, -1, -1));
        add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 445, 175, -1));
        add(reenterPasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 476, 175, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/watermark_1.PNG"))); // NOI18N
        jLabel17.setText("jLabel17");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 630));
        add(errorforcontactNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 334, 520, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void updateProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProfileButtonActionPerformed
        // TODO add your handling code here:

        try {
            if (fullNameTextField.getText().equals("") || dateOfBirthTextField.getText().equals("") || dateOfBirthTextField.getText().equals("")
                    || socialSecurityNumberTextField.getText().equals("") || emailIdTextField.equals("") || contactNumberTextField.equals("") || streetAddressTextField.equals("")
                    || cityTextField.equals("") || zipCodeTextField.equals("") || stateTextField.equals("")) {
                JOptionPane.showMessageDialog(null, "Enter all fields");
            } else {
                if (reenterPasswordTextField.getText().equals(passwordTextField.getText())) {
                    user.setFullName(fullNameTextField.getText());
                    user.setDateOfBirth(new Date(dateOfBirthTextField.getText()));
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
                    JOptionPane.showMessageDialog(null, "User Account has been updated Successfully");
                    UserHomePage userhomepage = new UserHomePage(userProcessContainer, network, user);
                    userProcessContainer.add("UserHomePageJPanel", userhomepage);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                } else {
                    JOptionPane.showMessageDialog(null, "Passwords does not match");

                }
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Please enter valid input");
        }
    }//GEN-LAST:event_updateProfileButtonActionPerformed

    private void dateOfBirthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateOfBirthTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_dateOfBirthTextFieldActionPerformed

    private void dateOfBirthTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateOfBirthTextFieldKeyReleased
        // TODO add your handling code here:
        String patternForDate = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
        String date = dateOfBirthTextField.getText();
        Pattern patternFordob = Pattern.compile(patternForDate);
        Matcher matcherForDob = patternFordob.matcher(date);
        if (matcherForDob.matches() == false) {
            errorForDateLabel.setText("Date Should be of Formate MM-DD-YYYY");
        } else {
            errorForDateLabel.setText("");
        }
    }//GEN-LAST:event_dateOfBirthTextFieldKeyReleased

    private void fullNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullNameTextFieldActionPerformed

    private void stateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateTextFieldActionPerformed

    private void zipCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipCodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipCodeTextFieldActionPerformed

    private void cityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextFieldActionPerformed

    private void streetAddressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetAddressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetAddressTextFieldActionPerformed

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void backToHomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToHomeButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backToHomeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToHomeButton;
    private javax.swing.JComboBox bloodGroupComboBox;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JTextField confirmEmailIdTextField;
    private javax.swing.JTextField contactNumberTextField;
    private javax.swing.JTextField dateOfBirthTextField;
    private javax.swing.JTextField emailIdTextField;
    private javax.swing.JLabel errorForDateLabel;
    private javax.swing.JLabel errorForEmailIdLabel;
    private javax.swing.JLabel errorforcontactNumber;
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
    private javax.swing.JButton updateProfileButton;
    private javax.swing.JTextField zipCodeTextField;
    // End of variables declaration//GEN-END:variables
}
