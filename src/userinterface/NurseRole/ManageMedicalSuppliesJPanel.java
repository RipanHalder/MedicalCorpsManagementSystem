/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NurseRole;

import userinterface.CampCommandantRole.*;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Notifications.Send;
import Business.Organizations.FoodSupplierOrganization;
import Business.Organizations.MedicalSupplierOrganization;
import Business.Organizations.MilitaryCampOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccountSoldier.UserAccountSoldier;
import Business.RequestQueue.NewRequestToCampCommandant;
import Business.RequestQueue.NewRequestToFoodSupplier;
import Business.Soldiers.Soldiers;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class ManageMedicalSuppliesJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccountSoldier userAccount;
    private EcoSystem system;
    private Enterprise enterprise;
    private static int pdfCount = 0;
    private Send send = new Send();
    private MilitaryCampOrganization organization;
    private static int count = 0;

    /**
     * Creates new form RequestLabTestJPanel
     */
    public ManageMedicalSuppliesJPanel(JPanel userProcessContainer, UserAccountSoldier account, Enterprise enterprise, EcoSystem business, MilitaryCampOrganization organization) {
        try {
            initComponents();

            this.userProcessContainer = userProcessContainer;
            this.system = business;
            this.organization = organization;

            for (Network network : system.getNetworkList()) {
                //Step 2.a: check against each enterprise
                for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (e.getEnterpriseType().toString().equals(Enterprise.EnterpriseType.FoodSuppliers.getValue())) {
                        this.enterprise = e;
                        break;
                    }
                }

                this.userAccount = account;
                valueLabel.setText(enterprise.getName());
                count = 0;
                populateMedicinesComboBox();
                populateNewMedicinesComboBox();
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
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

        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g)
            {
                ImageIcon img=new ImageIcon("nurse.jpg");
                Image i=img.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height,this);
            }

        }
        ;
        jPanel2 = new javax.swing.JPanel();
        searchJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        newMedicinesComboBox = new javax.swing.JComboBox<>();
        createNewMedicineButton = new javax.swing.JButton();
        updateQAButton = new javax.swing.JButton();
        saveQAButton = new javax.swing.JButton();
        deleteItemButton = new javax.swing.JButton();
        medicinesComboBox = new javax.swing.JComboBox<>();
        quantityAvailableTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        newMedicineButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(
            255, 255, 255,150));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    searchJButton.setText("Search Medicine In Medicine Suppliers");
    searchJButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            searchJButtonActionPerformed(evt);
        }
    });
    jPanel2.add(searchJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, -1));

    jLabel4.setText("Name");
    jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 70, 20));

    newMedicinesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    jPanel2.add(newMedicinesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 150, -1));

    createNewMedicineButton.setText("Create");
    createNewMedicineButton.setEnabled(false);
    createNewMedicineButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            createNewMedicineButtonActionPerformed(evt);
        }
    });
    jPanel2.add(createNewMedicineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

    updateQAButton.setText("Update");
    updateQAButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            updateQAButtonActionPerformed(evt);
        }
    });
    jPanel2.add(updateQAButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

    saveQAButton.setText("Save");
    saveQAButton.setEnabled(false);
    saveQAButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            saveQAButtonActionPerformed(evt);
        }
    });
    jPanel2.add(saveQAButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

    deleteItemButton.setText("Delete This Mediciine");
    deleteItemButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            deleteItemButtonActionPerformed(evt);
        }
    });
    jPanel2.add(deleteItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

    medicinesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    medicinesComboBox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            medicinesComboBoxActionPerformed(evt);
        }
    });
    jPanel2.add(medicinesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 290, -1));

    quantityAvailableTextField.setEnabled(false);
    jPanel2.add(quantityAvailableTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 250, -1));

    jLabel1.setText("Quantity Available");
    jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, 20));

    jLabel2.setText("Medicine Name");
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

    backJButton.setText("<<Back");
    backJButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            backJButtonActionPerformed(evt);
        }
    });
    jPanel2.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

    enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    enterpriseLabel.setText("Request a Food Supplier");
    jPanel2.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 330, 30));

    valueLabel.setText("<value>");
    jPanel2.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 130, -1));

    newMedicineButton.setText("New Medicine");
    newMedicineButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            newMedicineButtonActionPerformed(evt);
        }
    });
    jPanel2.add(newMedicineButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
    jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 660, 30));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 700, 560));

    add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void populateMedicinesComboBox() {
        try {
            medicinesComboBox.removeAllItems();
            count++;
            Iterator it = organization.getMedicalSuppliesInMilitaryCamp().getMedicalInventory().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                medicinesComboBox.addItem(pair.getKey().toString());
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }

    public void populateNewMedicinesComboBox() {
        newMedicinesComboBox.setEnabled(false);
        newMedicinesComboBox.removeAllItems();
        for (Network network : system.getNetworkList()) {
            for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof MedicalSupplierOrganization) {
                        MedicalSupplierOrganization fsOrg = (MedicalSupplierOrganization) org;
                        Iterator it = fsOrg.getMedicalSuppliesInventory().getMedicalInventory().entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry pair = (Map.Entry) it.next();
                            newMedicinesComboBox.addItem(pair.getKey().toString());
                        }
                    }
                }
            }
        }
    }

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        try {
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            RequestToCampCommandantJPanel ccqjp = (RequestToCampCommandantJPanel) component;
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_backJButtonActionPerformed

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        try {
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("RequestAFoodSupplierJPanel", new RequestAFoodSupplierJPanel(userProcessContainer, userAccount, enterprise, system, organization, medicinesComboBox.getSelectedItem().toString()));
            layout.next(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_searchJButtonActionPerformed

    private void medicinesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicinesComboBoxActionPerformed
        try {
            Iterator it = organization.getMedicalSuppliesInMilitaryCamp().getMedicalInventory().entrySet().iterator();
            while (it.hasNext() && count > 0) {
                Map.Entry pair = (Map.Entry) it.next();
                if (pair.getKey().equals(medicinesComboBox.getSelectedItem().toString())) {
                    quantityAvailableTextField.setText(pair.getValue().toString());
                    break;
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_medicinesComboBoxActionPerformed

    private void updateQAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateQAButtonActionPerformed
        try {
            quantityAvailableTextField.setEnabled(true);
            saveQAButton.setEnabled(true);
            updateQAButton.setEnabled(false);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_updateQAButtonActionPerformed

    private void saveQAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveQAButtonActionPerformed
        try {
            quantityAvailableTextField.setEnabled(false);
            saveQAButton.setEnabled(false);
            updateQAButton.setEnabled(true);
            Iterator it = organization.getMedicalSuppliesInMilitaryCamp().getMedicalInventory().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                if (pair.getKey().equals(medicinesComboBox.getSelectedItem().toString())) {
                    pair.setValue(Integer.parseInt(quantityAvailableTextField.getText()));
                    break;
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_saveQAButtonActionPerformed

    private void newMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMedicineButtonActionPerformed
        try {
            createNewMedicineButton.setEnabled(true);
            newMedicinesComboBox.setEnabled(true);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_newMedicineButtonActionPerformed

    private void createNewMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewMedicineButtonActionPerformed
        try {
            createNewMedicineButton.setEnabled(false);
            newMedicinesComboBox.setEnabled(false);
            Boolean flag = false;
            Iterator it = organization.getMedicalSuppliesInMilitaryCamp().getMedicalInventory().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                if (pair.getKey().toString().equals(newMedicinesComboBox.getSelectedItem())) {
                    JOptionPane.showMessageDialog(null, "Item Already Exists!");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                organization.getMedicalSuppliesInMilitaryCamp().addToMedicalInventory(newMedicinesComboBox.getSelectedItem().toString(), 0);
                JOptionPane.showMessageDialog(null, "Item Added Successfully!");
            }
            count = 0;
            populateMedicinesComboBox();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_createNewMedicineButtonActionPerformed

    private void deleteItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemButtonActionPerformed
        try {
            Iterator it = organization.getMedicalSuppliesInMilitaryCamp().getMedicalInventory().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                if (pair.getKey().equals(medicinesComboBox.getSelectedItem().toString())) {
                    it.remove();
                    break;
                }
            }
            count = 0;
            populateMedicinesComboBox();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_deleteItemButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createNewMedicineButton;
    private javax.swing.JButton deleteItemButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> medicinesComboBox;
    private javax.swing.JButton newMedicineButton;
    private javax.swing.JComboBox<String> newMedicinesComboBox;
    private javax.swing.JTextField quantityAvailableTextField;
    private javax.swing.JButton saveQAButton;
    private javax.swing.JButton searchJButton;
    private javax.swing.JButton updateQAButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
