/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

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
import Business.RequestQueue.NewRequestToMedicalSupplier;
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
import java.util.ArrayList;
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
public class RequestToMedicalSupplierJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccountSoldier userAccount;
    private EcoSystem system;
    private Enterprise enterprise;
    private static int pdfCount = 0;
    private Send send=new Send();

    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestToMedicalSupplierJPanel(JPanel userProcessContainer, UserAccountSoldier account, Enterprise enterprise, EcoSystem business) {
        try{
            initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = business;

        for (Network network : system.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getEnterpriseType().toString().equals(Enterprise.EnterpriseType.MedicalSuppliers.getValue())) {
                    this.enterprise = e;
                    break;
                }
            }

            this.userAccount = account;
            valueLabel.setText(enterprise.getName());
            populateCategoryComboBox();
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
                ImageIcon img=new ImageIcon("doctor_role.jpg");
                Image i=img.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height,this);
            }

        };
        jPanel2 = new javax.swing.JPanel();
        requestComboBox = new javax.swing.JComboBox<>();
        enterpriseLabel = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        requestTestJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        saveAsPDFButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(requestComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 290, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(153, 153, 153));
        enterpriseLabel.setText("REQUEST A MEDICAL SUPPLIER");
        jPanel2.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 330, 30));

        backJButton.setBackground(new java.awt.Color(51, 153, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setForeground(java.awt.Color.white);
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, -1, -1));

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valueLabel.setText("<value>");
        jPanel2.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 130, -1));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Request Category");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        requestTestJButton.setBackground(new java.awt.Color(51, 153, 255));
        requestTestJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        requestTestJButton.setForeground(java.awt.Color.white);
        requestTestJButton.setText("Send Request");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Description");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 90, -1));

        saveAsPDFButton.setBackground(new java.awt.Color(51, 153, 255));
        saveAsPDFButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        saveAsPDFButton.setForeground(java.awt.Color.white);
        saveAsPDFButton.setText("Save As PDF");
        saveAsPDFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsPDFButtonActionPerformed(evt);
            }
        });
        jPanel2.add(saveAsPDFButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 700, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 700, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 760, 380));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        try{
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel ccqjp = (DoctorWorkAreaJPanel) component;
        ccqjp.populateMedicalSupplyRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        try{
        String message = descriptionTextArea.getText();
        String requestCat = requestComboBox.getSelectedItem().toString();
        NewRequestToMedicalSupplier request = new NewRequestToMedicalSupplier();
        request.setMessage(message);
        request.setRequestCategory(requestCat);
        request.setSender(userAccount);
        request.setStatus("Sent");

        ArrayList<Organization> orgList = new ArrayList<Organization>();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof MedicalSupplierOrganization){
                orgList.add(organization);
            }
        }
        for (Organization org : orgList) {
        if (org!=null){
            org.getRequestQueueDoctorMedicalSupplier().getWorkRequestDoctorMedicalSupplier().add(request);
            
        }
        }
        userAccount.getRequestQueueDoctorMedicalSupplier().getWorkRequestDoctorMedicalSupplier().add(request);
        String recepient="";
        for(UserAccount ua:enterprise.getMedicalSupplierUADirectory().getUserAccountList()){
            if(ua.getEmail() !=null)
            recepient=recepient+ua.getEmail()+";";
        }
        send.mail(recepient, requestCat, message);
        JOptionPane.showMessageDialog(null,"Request succesfully sent to Medical suppliers");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void populateCategoryComboBox(){
        requestComboBox.removeAllItems();
        requestComboBox.addItem(Soldiers.RequestCategory.MedicalSupplies.getValue());
    }
    private void saveAsPDFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsPDFButtonActionPerformed
        Document newDocument = new Document();
        String myFilepath = userAccount.getUsername()+"_RequestToMedicalSupplier_" +pdfCount+ ".pdf";
        try {
            PdfWriter.getInstance(newDocument, new FileOutputStream(userAccount.getUsername()+"_RequestToMedicalSuppliers_" +pdfCount+ ".pdf"));
        } catch (DocumentException | FileNotFoundException ex) {
            Logger.getLogger(RequestToDoctorJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            newDocument.open();
            newDocument.add(new Paragraph("Hi,"));
            newDocument.add(new Paragraph(userAccount.getUsername().toUpperCase()));
            newDocument.add(new Paragraph(" "));
            newDocument.add(new Paragraph("Your Request has been send to Medical Suppliers."));
            newDocument.add(new Paragraph(" "));
            newDocument.add(new Paragraph("Request Category - "+ requestComboBox.getSelectedItem()));
            newDocument.add(new Paragraph("Request Description - "+ descriptionTextArea.getText()));
            newDocument.close();
            JOptionPane.showMessageDialog(null," Report Generated where the project is placed!");
            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File(myFilepath);
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {

                }
            }

        } catch (DocumentException ex) {
            Logger.getLogger(RequestToDoctorJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        pdfCount += 1;
    }//GEN-LAST:event_saveAsPDFButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> requestComboBox;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JButton saveAsPDFButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
