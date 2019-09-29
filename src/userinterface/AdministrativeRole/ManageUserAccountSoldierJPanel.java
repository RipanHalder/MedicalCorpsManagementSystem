/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Soldiers.Soldiers;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.Role.BaseSoldierRole;
import Business.Role.CampCommandantRole;
import Business.Role.DoctorRole;
import Business.Role.FoodSupplierRole;
import Business.Role.MedicalSupplierRole;
import Business.Role.NurseRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountSoldier.UserAccountSoldier;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class ManageUserAccountSoldierJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountSoldierJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private EcoSystem business;

    public ManageUserAccountSoldierJPanel(JPanel container, Enterprise enterprise, EcoSystem business) {
        try{
            initComponents();
        
        this.enterprise = enterprise;
        this.container = container;
        this.business = business;
        popOrganizationComboBox();
        // employeeJComboBox.removeAllItems();
        popData();
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }

    private boolean passwordpatterncorrect(String name)
    {
        Pattern pUser= Pattern.compile( "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mUser= pUser.matcher(name);
        if(mUser.find()){ return true; }
        else { return false;}
    }
    public void popOrganizationComboBox() {
        try{
            organizationJComboBox.removeAllItems();

        enterprise.getOrganizationDirectory().getOrganizationList().forEach((organization) -> {
            organizationJComboBox.addItem(organization);
        });
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }

    public void populateEmployeeComboBox(Organization organization) {
        try{
            employeeJComboBox.removeAllItems();

        organization.getSoldierDirectory().getSoldierList().forEach((soldier) -> {
            employeeJComboBox.addItem(soldier);
        });
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }

    private void populateRoleComboBox() {
        try{
            Soldiers s = (Soldiers) employeeJComboBox.getSelectedItem();
        
        if (s != null) {
            roleJComboBox.removeAllItems();
            roleJComboBox.addItem(s.getRoleType());
        }
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }

    public void popData() {
        try{
        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        enterprise.getOrganizationDirectory().getOrganizationList().forEach((organization) -> {
            organization.getSoldierUADirectory().getUserAccountList().stream().map((ua) -> {
                Object row[] = new Object[3];
                row[0] = ua;
                row[1] = ua.getEmail();
                row[2]=ua.getPhoneNumber();
                return row;
            }).forEachOrdered((row) -> {
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            });
        });
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null, "Array Out of Bound Exception Occurred!");
        }
        catch(Exception ex){
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

        jPanel1 = new javax.swing.JPanel(){public void paintComponent(Graphics g)
            {
                ImageIcon img=new ImageIcon("bluesky.jpg");
                Image i=img.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height,this);
            }};
            jScrollPane1 = new javax.swing.JScrollPane();
            userJTable = new javax.swing.JTable();
            employeeJComboBox = new javax.swing.JComboBox();
            organizationJComboBox = new javax.swing.JComboBox();
            jLabel5 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            roleJComboBox = new javax.swing.JComboBox();
            nameJTextField = new javax.swing.JTextField();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            backjButton1 = new javax.swing.JButton();
            jSeparator1 = new javax.swing.JSeparator();
            jSeparator2 = new javax.swing.JSeparator();
            jLabel6 = new javax.swing.JLabel();
            emailJTextField = new javax.swing.JTextField();
            phoneJTextField = new javax.swing.JTextField();
            jLabel7 = new javax.swing.JLabel();
            passwordJPasswordField = new javax.swing.JPasswordField();
            createjButton = new javax.swing.JButton();

            setLayout(new java.awt.BorderLayout());

            jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            userJTable.setBackground(new java.awt.Color(51, 153, 255));
            userJTable.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            userJTable.setForeground(java.awt.Color.white);
            userJTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "User Name", "Email", "PhoneNo"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.Object.class, java.lang.Object.class
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }
            });
            userJTable.setRowHeight(36);
            jScrollPane1.setViewportView(userJTable);
            if (userJTable.getColumnModel().getColumnCount() > 0) {
                userJTable.getColumnModel().getColumn(0).setResizable(false);
            }

            jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 750, 300));

            employeeJComboBox.setBackground(new java.awt.Color(51, 153, 255));
            employeeJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            employeeJComboBox.setForeground(java.awt.Color.white);
            employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            employeeJComboBox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    employeeJComboBoxActionPerformed(evt);
                }
            });
            jPanel1.add(employeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 270, -1));

            organizationJComboBox.setBackground(new java.awt.Color(51, 153, 255));
            organizationJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            organizationJComboBox.setForeground(java.awt.Color.white);
            organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    organizationJComboBoxActionPerformed(evt);
                }
            });
            jPanel1.add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 270, -1));

            jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            jLabel5.setForeground(java.awt.Color.white);
            jLabel5.setText("ORGANIZATION:");
            jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 290, -1));

            jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            jLabel3.setForeground(java.awt.Color.white);
            jLabel3.setText("EMPLOYEE:");
            jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 230, -1));

            jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            jLabel4.setForeground(java.awt.Color.white);
            jLabel4.setText("ROLE:");
            jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 110, 40));

            roleJComboBox.setBackground(new java.awt.Color(51, 153, 255));
            roleJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            roleJComboBox.setForeground(java.awt.Color.white);
            roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
            jPanel1.add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 270, -1));

            nameJTextField.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            jPanel1.add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 270, -1));

            jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            jLabel1.setForeground(java.awt.Color.white);
            jLabel1.setText("USER NAME:");
            jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, -1));

            jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            jLabel2.setForeground(java.awt.Color.white);
            jLabel2.setText("PASSWORD:");
            jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, -1));

            backjButton1.setBackground(new java.awt.Color(51, 153, 255));
            backjButton1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            backjButton1.setForeground(java.awt.Color.white);
            backjButton1.setText("<< BACK");
            backjButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    backjButton1ActionPerformed(evt);
                }
            });
            jPanel1.add(backjButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, 220, -1));
            jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 550, 10));
            jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 550, 10));

            jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            jLabel6.setForeground(java.awt.Color.white);
            jLabel6.setText("EMAIL:");
            jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 220, -1));

            emailJTextField.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            jPanel1.add(emailJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 270, -1));

            phoneJTextField.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            phoneJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    phoneJTextFieldKeyTyped(evt);
                }
            });
            jPanel1.add(phoneJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 270, -1));

            jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            jLabel7.setForeground(java.awt.Color.white);
            jLabel7.setText("PHONE:");
            jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 210, -1));
            jPanel1.add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 270, 50));

            createjButton.setBackground(new java.awt.Color(51, 153, 255));
            createjButton.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
            createjButton.setForeground(new java.awt.Color(255, 255, 255));
            createjButton.setText("Create");
            createjButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    createjButtonActionPerformed(evt);
                }
            });
            jPanel1.add(createjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 690, 200, 50));

            add(jPanel1, java.awt.BorderLayout.PAGE_START);
        }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        try{
            container.remove(this);
        
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        try{Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            populateEmployeeComboBox(organization);
            populateRoleComboBox();
        }
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void employeeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeJComboBoxActionPerformed
        try{
        Soldiers s = (Soldiers) employeeJComboBox.getSelectedItem();
        if (s != null) {
            roleJComboBox.removeAllItems();
            roleJComboBox.addItem(s.getRoleType());
        }
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_employeeJComboBoxActionPerformed

    private void phoneJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneJTextFieldKeyTyped
        onlyNumbers(evt);
    }//GEN-LAST:event_phoneJTextFieldKeyTyped

    private void createjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createjButtonActionPerformed
        try{
            String userName = nameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        Soldiers soldier = (Soldiers) employeeJComboBox.getSelectedItem();
        String roleType = roleJComboBox.getSelectedItem().toString();
        String email = emailJTextField.getText();
        String phone = phoneJTextField.getText();
        if(!passwordpatterncorrect(email)){
            JOptionPane.showMessageDialog(null,"Email id not in correct format");
            }
            else{
        Role role;
        Boolean exist = false;
        if (email.replaceAll(" ", "").length() == 0 || userName.replaceAll(" ", "").length() == 0 || password.replaceAll(" ", "").length() == 0) {
            JOptionPane.showMessageDialog(null, "fields cannot be blank");
        } else {
            for (Network n : business.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserAccount u : e.getSoldierUADirectory().getUserAccountList()) {
                        if (u.getUsername().equalsIgnoreCase(userName)) {
                            exist = true;
                        }
                    }
                    for (UserAccount u : e.getMedicalSupplierUADirectory().getUserAccountList()) {
                        if (u.getUsername().equalsIgnoreCase(userName)) {
                            exist = true;
                        }
                    }
                    for (UserAccount u : e.getFoodSupplierUADirectory().getUserAccountList()) {
                        if (u.getUsername().equalsIgnoreCase(userName)) {
                            exist = true;
                        }
                    }
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        for (UserAccount ua : o.getSoldierUADirectory().getUserAccountList()) {
                            if (ua.getUsername().equalsIgnoreCase(userName)) {
                                exist = true;
                            }
                        }
                        for (UserAccount ua : o.getFoodSupplierUADirectory().getUserAccountList()) {
                            if (ua.getUsername().equalsIgnoreCase(userName)) {
                                exist = true;
                            }
                        }
                        for (UserAccount ua : o.getMedicalSupplierUADirectory().getUserAccountList()) {
                            if (ua.getUsername().equalsIgnoreCase(userName)) {
                                exist = true;
                            }
                        }
                    }
                }
            }
            if (exist) {
                JOptionPane.showMessageDialog(null, userName + " already exist as username");
            } else {
                if (roleType.equals(Role.RoleType.CampCommandant.getValue())) {
                    role = new CampCommandantRole();
                    organization.getSoldierUADirectory().createUserAccount(userName, password, soldier, role, email, phone);
                } else if (roleType.equals(Role.RoleType.Doctor.getValue())) {
                    role = new DoctorRole();
                    organization.getSoldierUADirectory().createUserAccount(userName, password, soldier, role, email, phone);
                } else if (roleType.equals(Role.RoleType.Nurse.getValue())) {
                    role = new NurseRole();
                    organization.getSoldierUADirectory().createUserAccount(userName, password, soldier, role, email, phone);
                } else if (roleType.equals(Role.RoleType.BaseSoldier.getValue())) {
                    role = new BaseSoldierRole();
                    organization.getSoldierUADirectory().createUserAccount(userName, password, soldier, role, email, phone);
                }
            }
        }

        popData();
        nameJTextField.setText("");
        passwordJPasswordField.setText("");
        emailJTextField.setText("");
        phoneJTextField.setText("");
        }}
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null, "Array Out of Bound Exception Occurred!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_createjButtonActionPerformed

    private void onlyNumbers(java.awt.event.KeyEvent evt)
    {
        try{
            char keyTyped = evt.getKeyChar();
            if(!(Character.isDigit(keyTyped)) || (keyTyped == KeyEvent.VK_BACK_SPACE) || (keyTyped == KeyEvent.VK_DELETE)){
                evt.consume();
            }
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "<html>Error: Exception Occurred: <br></html>"+ex.getMessage());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton createjButton;
    private javax.swing.JTextField emailJTextField;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JTextField phoneJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}
