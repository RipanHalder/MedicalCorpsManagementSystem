/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NurseRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Notifications.Send;
import Business.Organizations.MilitaryCampOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccountSoldier.UserAccountSoldier;
import Business.RequestQueue.NewRequestToCampCommandant;
import Business.Role.CampCommandantRole;
import Business.Soldiers.Soldiers;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ripan
 */
public class RequestToCampCommandantJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccountSoldier userAccount;
    private static int pdfCount = 0;
    private MilitaryCampOrganization organization;
    private EcoSystem business;

    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestToCampCommandantJPanel(JPanel userProcessContainer, UserAccountSoldier account, Enterprise enterprise, EcoSystem business, MilitaryCampOrganization organization) {
        try {
            initComponents();
            Send send = new Send();
            this.userProcessContainer = userProcessContainer;
            this.enterprise = enterprise;
            this.userAccount = account;
            this.organization = organization;
            this.business = business;
            valueLabel.setText(enterprise.getName());
            populateCategoryComboBox();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        saveAsPDFButton = new javax.swing.JButton();
        bedsAvailableTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numberOfLeaveDaysTextField = new javax.swing.JTextField();
        medicinesCategoryComboBox = new javax.swing.JComboBox<String>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Send Request");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        jLabel1.setText("Description");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 90, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Request your Camp Commander");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 330, 30));

        jLabel2.setText("Request Category");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 180, -1));

        saveAsPDFButton.setText("Save As PDF");
        saveAsPDFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsPDFButtonActionPerformed(evt);
            }
        });
        add(saveAsPDFButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        bedsAvailableTextField.setEnabled(false);
        add(bedsAvailableTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 180, -1));

        jLabel3.setText("Beds Available");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel4.setText("Number of Days for Your Leaves");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 180, -1));

        numberOfLeaveDaysTextField.setEnabled(false);
        add(numberOfLeaveDaysTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 180, -1));

        medicinesCategoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        medicinesCategoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicinesCategoryComboBoxActionPerformed(evt);
            }
        });
        add(medicinesCategoryComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void populateCategoryComboBox() {
        medicinesCategoryComboBox.removeAllItems();
        medicinesCategoryComboBox.addItem(Soldiers.RequestCategory.Beds.getValue());
//        medicinesCategoryComboBox.addItem(Soldiers.RequestCategory.MedicalSupplies.getValue());
        medicinesCategoryComboBox.addItem(Soldiers.RequestCategory.ApplyLeave.getValue());
    }

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        try {
            Send send = new Send();
            String message = descriptionTextArea.getText();
            if (!message.isEmpty()) {
                String requestCat = medicinesCategoryComboBox.getSelectedItem().toString();
                NewRequestToCampCommandant request = new NewRequestToCampCommandant();
                request.setMessage(message);
                request.setRequestCategory(requestCat);
                request.setSender(userAccount);
                request.setStatus("Sent");

                ArrayList<Organization> orgList = new ArrayList<Organization>();
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof MilitaryCampOrganization) {
                        orgList.add(organization);
                    }
                }
                for (Organization org : orgList) {
                    if (org != null) {
                        org.getRequestQueue().getWorkRequestList().add(request);
                    }
                }

                userAccount.getRequestQueue().getWorkRequestList().add(request);
                String recepient = "";
                for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : o.getSoldierUADirectory().getUserAccountList()) {
                        if (ua.getEmail() != null && ua.getRole() instanceof CampCommandantRole) {
                            recepient = recepient + ua.getEmail() + ",";
                        }
                    }
                }if (!recepient.isEmpty()) {
                send.mail(recepient, requestCat, message);
            }
                descriptionTextArea.setText("");
                JOptionPane.showMessageDialog(null, "Request sent succesfully to Camp Commandant");
            } else {
                JOptionPane.showMessageDialog(null, "Description Cannot be Null");
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Array Out of Bound Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        try {
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            NurseWorkAreaJPanel dwjp = (NurseWorkAreaJPanel) component;
            dwjp.populateRequestTable();
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Array Out of Bound Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_backJButtonActionPerformed

    private void saveAsPDFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsPDFButtonActionPerformed
        Document newDocument = new Document();
        String myFilepath = userAccount.getUsername() + "_RequestToCampCommandant_" + pdfCount + ".pdf";
        try {
            PdfWriter.getInstance(newDocument, new FileOutputStream(userAccount.getUsername() + "_RequestToCampCommandant_" + pdfCount + ".pdf"));
        } catch (DocumentException | FileNotFoundException ex) {
            Logger.getLogger(RequestToCampCommandantJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            newDocument.open();
            newDocument.add(new Paragraph("Hi,"));
            newDocument.add(new Paragraph(userAccount.getUsername().toUpperCase()));
            newDocument.add(new Paragraph(" "));
            newDocument.add(new Paragraph("Your Request has been send to your camp commander."));
            newDocument.add(new Paragraph(" "));
            newDocument.add(new Paragraph("Request Category - " + medicinesCategoryComboBox.getSelectedItem()));
            newDocument.add(new Paragraph("Request Description - " + descriptionTextArea.getText()));
            newDocument.close();
            JOptionPane.showMessageDialog(null, "Report Generated where the project is placed!");
            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File(myFilepath);
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {

                }
            }

        } catch (DocumentException ex) {
            Logger.getLogger(RequestToCampCommandantJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        pdfCount += 1;
    }//GEN-LAST:event_saveAsPDFButtonActionPerformed

    private void medicinesCategoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicinesCategoryComboBoxActionPerformed
        if (medicinesCategoryComboBox.getItemCount() > 0) {
            if (medicinesCategoryComboBox.getSelectedItem().equals(Soldiers.RequestCategory.Beds.getValue())) {
                int availableSeats = 0;
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (organization.getBedsMilitaryCamps().getSeatsBool()[i][j] == false) {
                            availableSeats++;
                        }
                    }
                }
                bedsAvailableTextField.setText(String.valueOf(availableSeats));
                numberOfLeaveDaysTextField.setEnabled(false);
                requestTestJButton.setEnabled(true);
                saveAsPDFButton.setEnabled(true);
                descriptionTextArea.setEnabled(true);
            } else if (medicinesCategoryComboBox.getSelectedItem().equals(Soldiers.RequestCategory.ApplyLeave.getValue())) {
                numberOfLeaveDaysTextField.setEnabled(true);
                requestTestJButton.setEnabled(true);
                saveAsPDFButton.setEnabled(true);
                descriptionTextArea.setEnabled(true);
            }
        }
    }//GEN-LAST:event_medicinesCategoryComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bedsAvailableTextField;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> medicinesCategoryComboBox;
    private javax.swing.JTextField numberOfLeaveDaysTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JButton saveAsPDFButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
