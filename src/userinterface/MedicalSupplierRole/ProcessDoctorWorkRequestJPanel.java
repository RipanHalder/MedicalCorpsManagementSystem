/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MedicalSupplierRole;

import Business.RequestQueue.NewRequestToMedicalSupplier;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.FoodSupplierRole.FoodSupplierWorkAreaJPanel;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class ProcessDoctorWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    NewRequestToMedicalSupplier request;
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessDoctorWorkRequestJPanel(JPanel userProcessContainer, NewRequestToMedicalSupplier request) {
        try{initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g)
            {
                ImageIcon img=new ImageIcon("medicalsupply.jpg");
                Image i=img.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height,this);
            }

        };
        jPanel2 = new javax.swing.JPanel();
        justificationTextField = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        resultComboBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(justificationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 487, 110));

        submitJButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        submitJButton.setForeground(java.awt.Color.white);
        submitJButton.setText("SUBMIT");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, 30));

        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        backJButton.setForeground(java.awt.Color.white);
        backJButton.setText("BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 120, 30));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("RESULT:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Justification:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 130, -1));

        resultComboBox.setBackground(new java.awt.Color(51, 153, 255));
        resultComboBox.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        resultComboBox.setForeground(java.awt.Color.white);
        resultComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approved", "Rejected" }));
        jPanel2.add(resultComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 72, 730, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 760, 400));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        try{
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MedicalSupplierWorkAreaJPanel dwjp = (MedicalSupplierWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        try{
            request.setResult(justificationTextField.getText());
        request.setStatus(resultComboBox.getSelectedItem().toString());
        JOptionPane.showMessageDialog(null, "Request has been "+resultComboBox.getSelectedItem().toString()+" Succesfully");
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MedicalSupplierWorkAreaJPanel dwjp = (MedicalSupplierWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_submitJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField justificationTextField;
    private javax.swing.JComboBox<String> resultComboBox;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
