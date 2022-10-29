/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.Community;
import model.PersonList;
import model.Person;

/**
 *
 * @author srivenkatasatyaakhilmalladi
 */
public class AddPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPersonJPanel
     */
    PersonList Personlist;
    
    public AddPersonJPanel(PersonList Personlist) {
        initComponents();
        this.Personlist=Personlist;
    }
    private void initComponents() {

        ButtonGroup CGenderButtonGroup = new javax.swing.ButtonGroup();
        ButtonGroup CRoleButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        CPersonNameLabel = new javax.swing.JLabel();
        CPersonRoleLabel = new javax.swing.JLabel();
        CPersonAgeLabel = new javax.swing.JLabel();
        CFemaleRadioButton = new javax.swing.JRadioButton();
        CPersonGenderLabel = new javax.swing.JLabel();
        CPersonCommunityLabel = new javax.swing.JLabel();
        CPersonAddressLabel = new javax.swing.JLabel();
        CMaleRadioButton = new javax.swing.JRadioButton();
        CDoctorRoleButton = new javax.swing.JRadioButton();
        CPatientRoleButton = new javax.swing.JRadioButton();
        COtherRadioButton = new javax.swing.JRadioButton();
        CPersonContactLabel = new javax.swing.JLabel();
        CPersonContactTextField = new javax.swing.JTextField();
        CPersonAddressTextField = new javax.swing.JTextField();
        CPersonNameTextField = new javax.swing.JTextField();
        CPersonAgeTextField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        AddPersonButton = new javax.swing.JButton();

        CPersonNameLabel.setText("Name");

        CPersonRoleLabel.setText("Select Role");

        CPersonAgeLabel.setText("Age");

        CGenderButtonGroup.add(CFemaleRadioButton);
        CFemaleRadioButton.setText("Female");

        CPersonGenderLabel.setText("Gender");

        CPersonCommunityLabel.setText("Community");

        CPersonAddressLabel.setText("Address");

        CGenderButtonGroup.add(CMaleRadioButton);
        CMaleRadioButton.setText("Male");

        CRoleButtonGroup.add(CDoctorRoleButton);
        CDoctorRoleButton.setText("Doctor");

        CRoleButtonGroup.add(CPatientRoleButton);
        CPatientRoleButton.setText("Patient");

        CGenderButtonGroup.add(COtherRadioButton);
        COtherRadioButton.setText("Other");

        CPersonContactLabel.setText("Contact No");

        CPersonContactTextField.setForeground(new java.awt.Color(204, 204, 204));
        CPersonContactTextField.setText("Enter Contact Number");
        CPersonContactTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CPersonContactTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CPersonContactTextFieldFocusLost(evt);
            }
        });

        CPersonAddressTextField.setForeground(new java.awt.Color(204, 204, 204));
        CPersonAddressTextField.setText("Enter Address");
        CPersonAddressTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CPersonAddressTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CPersonAddressTextFieldFocusLost(evt);
            }
        });

        CPersonNameTextField.setForeground(new java.awt.Color(204, 204, 204));
        CPersonNameTextField.setText("Enter Name");
        CPersonNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CPersonNameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CPersonNameTextFieldFocusLost(evt);
            }
        });

        CPersonAgeTextField.setForeground(new java.awt.Color(204, 204, 204));
        CPersonAgeTextField.setText("Enter Age");
        CPersonAgeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CPersonAgeTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CPersonAgeTextFieldFocusLost(evt);
            }
        });

        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        AddPersonButton.setText("Add");
        AddPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPersonButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CPersonContactLabel)
                        .addGap(18, 18, 18)
                        .addComponent(CPersonContactTextField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CPersonNameLabel)
                            .addComponent(CPersonAgeLabel))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CPersonNameTextField)
                            .addComponent(CPersonAgeTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CPersonCommunityLabel)
                            .addComponent(CPersonAddressLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CPersonAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CPersonRoleLabel)
                            .addComponent(CPersonGenderLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CMaleRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CFemaleRadioButton)
                                .addGap(14, 14, 14)
                                .addComponent(COtherRadioButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CDoctorRoleButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CPatientRoleButton)))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddPersonButton)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPersonNameLabel)
                    .addComponent(CPersonNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPersonAgeLabel)
                    .addComponent(CPersonAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPersonGenderLabel)
                    .addComponent(CMaleRadioButton)
                    .addComponent(CFemaleRadioButton)
                    .addComponent(COtherRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPersonRoleLabel)
                    .addComponent(CDoctorRoleButton)
                    .addComponent(CPatientRoleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPersonAddressLabel)
                    .addComponent(CPersonAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPersonCommunityLabel)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPersonContactLabel)
                    .addComponent(CPersonContactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddPersonButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
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
        CPersonNameLabel = new javax.swing.JLabel();
        CPersonRoleLabel = new javax.swing.JLabel();
        CPersonAgeLabel = new javax.swing.JLabel();
        CFemaleRadioButton = new javax.swing.JRadioButton();
        CPersonGenderLabel = new javax.swing.JLabel();
        CPersonCommunityLabel = new javax.swing.JLabel();
        CPersonAddressLabel = new javax.swing.JLabel();
        CMaleRadioButton = new javax.swing.JRadioButton();
        CDoctorRoleButton = new javax.swing.JRadioButton();
        CPatientRoleButton = new javax.swing.JRadioButton();
        COtherRadioButton = new javax.swing.JRadioButton();
        CPersonContactLabel = new javax.swing.JLabel();
        CPersonContactTextField = new javax.swing.JTextField();
        CPersonAddressTextField = new javax.swing.JTextField();
        CPersonNameTextField = new javax.swing.JTextField();
        CPersonAgeTextField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        AddPersonButton = new javax.swing.JButton();

        CPersonNameLabel.setText("Name");

        CPersonRoleLabel.setText("Select Role");

        CPersonAgeLabel.setText("Age");

        CFemaleRadioButton.setText("Female");

        CPersonGenderLabel.setText("Gender");

        CPersonCommunityLabel.setText("Community");

        CPersonAddressLabel.setText("Address");

        CMaleRadioButton.setText("Male");

        CDoctorRoleButton.setText("Doctor");

        CPatientRoleButton.setText("Patient");

        COtherRadioButton.setText("Other");

        CPersonContactLabel.setText("Contact No");

        CPersonContactTextField.setForeground(new java.awt.Color(204, 204, 204));
        CPersonContactTextField.setText("Enter Contact Number");
        CPersonContactTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CPersonContactTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CPersonContactTextFieldFocusLost(evt);
            }
        });

        CPersonAddressTextField.setForeground(new java.awt.Color(204, 204, 204));
        CPersonAddressTextField.setText("Enter Address");
        CPersonAddressTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CPersonAddressTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CPersonAddressTextFieldFocusLost(evt);
            }
        });

        CPersonNameTextField.setForeground(new java.awt.Color(204, 204, 204));
        CPersonNameTextField.setText("Enter Name");
        CPersonNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CPersonNameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CPersonNameTextFieldFocusLost(evt);
            }
        });

        CPersonAgeTextField.setForeground(new java.awt.Color(204, 204, 204));
        CPersonAgeTextField.setText("Enter Age");
        CPersonAgeTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CPersonAgeTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CPersonAgeTextFieldFocusLost(evt);
            }
        });

        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        AddPersonButton.setText("Add");
        AddPersonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPersonButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CPersonContactLabel)
                        .addGap(18, 18, 18)
                        .addComponent(CPersonContactTextField))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CPersonNameLabel)
                            .addComponent(CPersonAgeLabel))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CPersonNameTextField)
                            .addComponent(CPersonAgeTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CPersonCommunityLabel)
                            .addComponent(CPersonAddressLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CPersonAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CPersonRoleLabel)
                            .addComponent(CPersonGenderLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CMaleRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CFemaleRadioButton)
                                .addGap(14, 14, 14)
                                .addComponent(COtherRadioButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CDoctorRoleButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CPatientRoleButton)))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddPersonButton)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPersonNameLabel)
                    .addComponent(CPersonNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPersonAgeLabel)
                    .addComponent(CPersonAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPersonGenderLabel)
                    .addComponent(CMaleRadioButton)
                    .addComponent(CFemaleRadioButton)
                    .addComponent(COtherRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPersonRoleLabel)
                    .addComponent(CDoctorRoleButton)
                    .addComponent(CPatientRoleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPersonAddressLabel)
                    .addComponent(CPersonAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPersonCommunityLabel)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPersonContactLabel)
                    .addComponent(CPersonContactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(AddPersonButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CPersonContactTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CPersonContactTextFieldFocusGained
        // TODO add your handling code here:
        if(CPersonContactTextField.getText().equals("Enter Contact Number"))
        {
            CPersonContactTextField.setText("");
            CPersonContactTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CPersonContactTextFieldFocusGained

    private void CPersonContactTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CPersonContactTextFieldFocusLost
        // TODO add your handling code here:
        if(CPersonContactTextField.getText().equals(""))
        {
            CPersonContactTextField.setText("Enter Contact Number");
            CPersonContactTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CPersonContactTextFieldFocusLost

    private void CPersonAddressTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CPersonAddressTextFieldFocusGained
        // TODO add your handling code here:
        if(CPersonAddressTextField.getText().equals("Enter Address"))
        {
            CPersonAddressTextField.setText("");
            CPersonAddressTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CPersonAddressTextFieldFocusGained

    private void CPersonAddressTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CPersonAddressTextFieldFocusLost
        // TODO add your handling code here:
        if(CPersonAddressTextField.getText().equals(""))
        {
            CPersonAddressTextField.setText("Enter Address");
            CPersonAddressTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CPersonAddressTextFieldFocusLost

    private void CPersonNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CPersonNameTextFieldFocusGained
        // TODO add your handling code here:
        if(CPersonNameTextField.getText().equals("Enter Name"))
        {
            CPersonNameTextField.setText("");
            CPersonNameTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CPersonNameTextFieldFocusGained

    private void CPersonNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CPersonNameTextFieldFocusLost
        // TODO add your handling code here:
        if(CPersonNameTextField.getText().equals(""))
        {
            CPersonNameTextField.setText("Enter Name");
            CPersonNameTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CPersonNameTextFieldFocusLost

    private void CPersonAgeTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CPersonAgeTextFieldFocusGained
        // TODO add your handling code here:
        if(CPersonAgeTextField.getText().equals("Enter Age"))
        {
            CPersonAgeTextField.setText("");
            CPersonAgeTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CPersonAgeTextFieldFocusGained

    private void CPersonAgeTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CPersonAgeTextFieldFocusLost
        // TODO add your handling code here:
        if(CPersonAgeTextField.getText().equals(""))
        {
            CPersonAgeTextField.setText("Enter Age");
            CPersonAgeTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_CPersonAgeTextFieldFocusLost

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
        List<String> ls = new ArrayList<>();
        jComboBox1.setModel(new DefaultComboBoxModel<>(ls.toArray(String[]::new)));
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        // ArrayList<Community> comhist = new ArrayList<Community>();
        //ArrayList<Community> comhist;
        // jComboBox1.setModel(new DefaultComboBoxModel<String>(comhist.toArray(new String[0])));
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void AddPersonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPersonButtonActionPerformed
        // TODO add your handling code here:
        String name = CPersonNameTextField.getText();
        int age = Integer.parseInt(CPersonAgeTextField.getText());
        String address = CPersonAddressTextField.getText();
        long contact = Long.parseLong(CPersonContactTextField.getText());
        String gender = " ";

        // If condition to check if jRadioButton2 is selected.
        if (CMaleRadioButton.isSelected()) {

            gender = "Male";
        }

        else if (CFemaleRadioButton.isSelected()) {

            gender = "Female";
        }
        else if (COtherRadioButton.isSelected()) {

            gender = "Other";
        }
        String role = " ";
        if (CDoctorRoleButton.isSelected()) {

            role = "Doctor";
        }

        else if (CPatientRoleButton.isSelected()) {

            role = "Patient";
        }
        Person p = Personlist.addNewPerson();
        p.setName(name);
        p.setAge(age);
        p.setContact(contact);
        p.setAddress(address);
        p.setGender(gender);
        //p.setCommunity(community);
        p.setRole(role);

        JOptionPane.showMessageDialog(this,"ADDED SUCCESSFULLY");

        CPersonNameTextField.setText("");
        CPersonAgeTextField.setText("");
        CPersonAddressTextField.setText("");
        CPersonContactTextField.setText("");
        CGenderButtonGroup.clearSelection();
        CRoleButtonGroup.clearSelection();
    }//GEN-LAST:event_AddPersonButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPersonButton;
    private javax.swing.JRadioButton CDoctorRoleButton;
    private javax.swing.JRadioButton CFemaleRadioButton;
    private javax.swing.JRadioButton CMaleRadioButton;
    private javax.swing.JRadioButton COtherRadioButton;
    private javax.swing.JRadioButton CPatientRoleButton;
    private javax.swing.JLabel CPersonAddressLabel;
    private javax.swing.JTextField CPersonAddressTextField;
    private javax.swing.JLabel CPersonAgeLabel;
    private javax.swing.JTextField CPersonAgeTextField;
    private javax.swing.JLabel CPersonCommunityLabel;
    private javax.swing.JLabel CPersonContactLabel;
    private javax.swing.JTextField CPersonContactTextField;
    private javax.swing.JLabel CPersonGenderLabel;
    private javax.swing.JLabel CPersonNameLabel;
    private javax.swing.JTextField CPersonNameTextField;
    private javax.swing.JLabel CPersonRoleLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
