/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MedicalSupplierRole;

import Business.Organizations.MedicalSupplierOrganization;
import Business.UserAccount.UserAccountMedicalSupplier.UserAccountMedicalSupplier;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Ripan Halder
 */
public class AddNewMedicalItemPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccountMedicalSupplier account;
    private MedicalSupplierOrganization organization;

    public AddNewMedicalItemPanel(JPanel userProcessContainer, UserAccountMedicalSupplier account, MedicalSupplierOrganization organization) {
        try {
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.account = account;
            this.organization = organization;
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

        jPanel1 = new javax.swing.JPanel()
        {
            public void paintComponent(Graphics g)
            {
                ImageIcon img=new ImageIcon("medicalsupply.jpg");
                Image i=img.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height,this);
            }

        }
        ;
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        quantityTextField = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        //jPanel2.setBackground(new java.awt.Color(0, 0,0, 80));
        jPanel2.setBackground(new java.awt.Color(255, 255, 255,150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("ADD NEW MEDICAL SUPPLY");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("NAME:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("QUANTITY:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 140, -1));

        nameTextField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        nameTextField.setBorder(null);
        jPanel2.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 215, -1));

        quantityTextField.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        quantityTextField.setBorder(null);
        quantityTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityTextFieldKeyTyped(evt);
            }
        });
        jPanel2.add(quantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 215, -1));

        createButton.setBackground(new java.awt.Color(51, 153, 255));
        createButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        createButton.setForeground(java.awt.Color.white);
        createButton.setText("CREATE");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        jPanel2.add(createButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 160, 30));

        cancelButton.setBackground(new java.awt.Color(51, 153, 255));
        cancelButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        cancelButton.setForeground(java.awt.Color.white);
        cancelButton.setText("BACK");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel2.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 400, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 600, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 620, 380));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        try {
            Iterator it = organization.getMedicalSuppliesInventory().getMedicalInventory().entrySet().iterator();
            if (!organization.getMedicalSuppliesInventory().getMedicalInventory().isEmpty()) {
                while (it.hasNext()) {
                    Map.Entry pair = (Map.Entry) it.next();
                    if (pair.getKey().equals(nameTextField.getText())) {
                        JOptionPane.showMessageDialog(null, "Medical Item already exists in your Inventory!");
                        nameTextField.setText("");
                        quantityTextField.setText("");
                    } else {
                        organization.getMedicalSuppliesInventory().addToMedicalInventory(nameTextField.getText(), Integer.parseInt(quantityTextField.getText()));
                        JOptionPane.showMessageDialog(null, "Medical Item Added to your Inventory!");

                        nameTextField.setText("");
                        quantityTextField.setText("");
                    }
                    it.remove(); // avoids a ConcurrentModificationException
                }
            } else {
                organization.getMedicalSuppliesInventory().addToMedicalInventory(nameTextField.getText(), Integer.parseInt(quantityTextField.getText()));
                JOptionPane.showMessageDialog(null, "Medical Item Added to your Inventory!");
            }
            nameTextField.setText("");
            quantityTextField.setText("");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        try {
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            ManageMedicalSuppliesJPanel dwjp = (ManageMedicalSuppliesJPanel) component;
            dwjp.populateTable();
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void quantityTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTextFieldKeyTyped
        onlyNumbers(evt);
    }//GEN-LAST:event_quantityTextFieldKeyTyped
    private void onlyNumbers(java.awt.event.KeyEvent evt) {
        try {
            char keyTyped = evt.getKeyChar();
            if (!(Character.isDigit(keyTyped)) || (keyTyped == KeyEvent.VK_BACK_SPACE) || (keyTyped == KeyEvent.VK_DELETE)) {
                evt.consume();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "<html>Error: Exception Occurred: <br></html>" + ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField quantityTextField;
    // End of variables declaration//GEN-END:variables
}
