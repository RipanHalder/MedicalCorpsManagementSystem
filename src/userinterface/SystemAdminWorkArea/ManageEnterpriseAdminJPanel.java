/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Soldiers.Soldiers;
import Business.Enterprise.Enterprise;
import Business.FoodSupplierEmployee.FoodSupplierEmployee;
import Business.MedicalSupplierEmployee.MedicalSupplierEmployee;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.Role.AdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountFoodSupplier.UserAccountFoodSupplier;
import Business.UserAccount.UserAccountMedicalSupplier.UserAccountMedicalSupplier;
import Business.UserAccount.UserAccountSoldier.UserAccountSoldier;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;

/**
 *
 * @author ripan
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private EcoSystem system;
    private static int count = 0;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system, int counter) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        count = counter;
        
        enterpriseJComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                populateRoleComboBox();
                count++;
            }
        });
        populateTable();
        populateNetworkComboBox();
        populateRoleComboBox();
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();
        
        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccountSoldier userAccount : enterprise.getSoldierUADirectory().getUserAccountList()) {
                    FetchData(enterprise, network, userAccount, model);
                }
                for (UserAccountMedicalSupplier userAccount : enterprise.getMedicalSupplierUADirectory().getUserAccountList()) {
                    FetchData(enterprise, network, userAccount, model);
                }
                for (UserAccountFoodSupplier userAccount : enterprise.getFoodSupplierUADirectory().getUserAccountList()) {
                    FetchData(enterprise, network, userAccount, model);
                }
            }
        }
    }
    
    public void FetchData(Enterprise enterprise, Network network, UserAccount userAccount, DefaultTableModel model) {
        Object[] row = new Object[3];
        row[0] = enterprise.getName();
        row[1] = network.getName();
        row[2] = userAccount.getUsername();
        model.addRow(row);
    }
    
    private void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()) {
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network) {
        enterpriseJComboBox.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            enterpriseJComboBox.addItem(enterprise);
        }
        
    }
    
    public void populateRoleComboBox() {
        roleComboBox.removeAllItems();
        
        if (count > 0) {
            for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
                Enterprise e = (Enterprise) enterpriseJComboBox.getSelectedItem();
                if (e.getEnterpriseType().toString().equals(type.ArmedForces.getValue())) {
                    roleComboBox.addItem(Role.RoleType.CampCommandant.getValue());
                    roleComboBox.addItem(Role.RoleType.Nurse.getValue());
                    roleComboBox.addItem(Role.RoleType.Doctor.getValue());
                    break;
                } else if (e.getEnterpriseType().toString().equals(type.FoodSuppliers.getValue())) {
                    roleComboBox.addItem(Role.RoleType.FoodSupplier.getValue());
                    break;
                } else if (e.getEnterpriseType().toString().equals(type.MedicalSuppliers.getValue())) {
                    roleComboBox.addItem(Role.RoleType.MedicalSupplier.getValue());
                    break;
                }
            }
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
                ImageIcon img=new ImageIcon("sysadminworkarea.jpg");
                Image i=img.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height,this);
            }
        }
        ;
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        emailJTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        nameJTextField1 = new javax.swing.JTextField();
        emailLabel1 = new javax.swing.JLabel();
        phoneJTextField = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 410, 240));

        jLabel1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Network:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 140, 50));

        networkJComboBox.setBackground(new java.awt.Color(153, 204, 255));
        networkJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        networkJComboBox.setForeground(java.awt.Color.white);
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 320, 50));

        jLabel2.setBackground(new java.awt.Color(153, 204, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 180, 50));

        usernameJTextField.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        usernameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameJTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 320, 50));

        jLabel3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Enterprise:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 160, 50));

        enterpriseJComboBox.setBackground(new java.awt.Color(153, 204, 255));
        enterpriseJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        enterpriseJComboBox.setForeground(java.awt.Color.white);
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(enterpriseJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 320, 50));

        submitJButton.setBackground(new java.awt.Color(153, 204, 255));
        submitJButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        submitJButton.setForeground(java.awt.Color.white);
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 740, 250, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 150, 50));

        emailJTextField.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jPanel1.add(emailJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 320, 50));

        emailLabel.setBackground(new java.awt.Color(153, 204, 255));
        emailLabel.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        emailLabel.setForeground(java.awt.Color.white);
        emailLabel.setText("Email");
        jPanel1.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 150, 50));

        passwordJPasswordField.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jPanel1.add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 320, 50));

        backJButton.setBackground(new java.awt.Color(153, 204, 255));
        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        backJButton.setForeground(java.awt.Color.white);
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 740, 250, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Role");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 100, 50));

        roleComboBox.setBackground(new java.awt.Color(153, 204, 255));
        roleComboBox.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        roleComboBox.setForeground(java.awt.Color.white);
        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(roleComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 320, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 650, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, 650, 10));

        jLabel7.setBackground(new java.awt.Color(153, 204, 255));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 150, 50));

        nameJTextField1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jPanel1.add(nameJTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 320, 50));

        emailLabel1.setBackground(new java.awt.Color(153, 204, 255));
        emailLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        emailLabel1.setForeground(java.awt.Color.white);
        emailLabel1.setText("Phone");
        jPanel1.add(emailLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, 150, 50));

        phoneJTextField.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        phoneJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneJTextFieldKeyTyped(evt);
            }
        });
        jPanel1.add(phoneJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 660, 320, 50));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        
        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }
        

    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        
        Boolean exist = false;
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = emailJTextField.getText();
        String roleType = roleComboBox.getSelectedItem().toString();
        String email = emailJTextField.getText();
        String phone = phoneJTextField.getText();
        if (!passwordpatterncorrect(email)){
        JOptionPane.showMessageDialog(null, "email in incorrect format");
        }
        else{
        if (name.replaceAll(" ", "").length() == 0 || username.replaceAll(" ", "").length() == 0 || password.replaceAll(" ", "").length() == 0) {
            JOptionPane.showMessageDialog(null, "fields cannot be blank");
        } else {
            for (Network n : system.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    for (UserAccount u : e.getSoldierUADirectory().getUserAccountList()) {
                        if (u.getUsername().equalsIgnoreCase(username)) {
                            exist = true;
                        }
                    }
                    for (UserAccount u : e.getMedicalSupplierUADirectory().getUserAccountList()) {
                        if (u.getUsername().equalsIgnoreCase(username)) {
                            exist = true;
                        }
                    }
                    for (UserAccount u : e.getFoodSupplierUADirectory().getUserAccountList()) {
                        if (u.getUsername().equalsIgnoreCase(username)) {
                            exist = true;
                        }
                    }
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        for (UserAccount ua : o.getSoldierUADirectory().getUserAccountList()) {
                            if (ua.getUsername().equalsIgnoreCase(username)) {
                                exist = true;
                            }
                        }
                        for (UserAccount ua : o.getFoodSupplierUADirectory().getUserAccountList()) {
                            if (ua.getUsername().equalsIgnoreCase(username)) {
                                exist = true;
                            }
                        }
                        for (UserAccount ua : o.getMedicalSupplierUADirectory().getUserAccountList()) {
                            if (ua.getUsername().equalsIgnoreCase(username)) {
                                exist = true;
                            }
                        }
                    }
                }
            }
            if (exist) {
                JOptionPane.showMessageDialog(null, username + " already exist as username");
            } else {
                if (roleType.equals(Role.RoleType.CampCommandant.getValue())) {
                    // something    
                    Soldiers soldier = enterprise.getSoldierDirectory().CreateSoldier(name, roleType);
                    UserAccount account = enterprise.getSoldierUADirectory().createUserAccount(username, password, soldier, new AdminRole(), email, phone);
                } else if (roleType.equals(Role.RoleType.Doctor.getValue())) {
                    // something    
                    Soldiers soldier = enterprise.getSoldierDirectory().CreateSoldier(name, roleType);
                    UserAccount account = enterprise.getSoldierUADirectory().createUserAccount(username, password, soldier, new AdminRole(), email, phone);
                } else if (roleType.equals(Role.RoleType.Nurse.getValue())) {
                    // something    
                    Soldiers soldier = enterprise.getSoldierDirectory().CreateSoldier(name, roleType);
                    UserAccount account = enterprise.getSoldierUADirectory().createUserAccount(username, password, soldier, new AdminRole(), email, phone);
                    
                } else if (roleType.equals(Role.RoleType.MedicalSupplier.getValue())) {
                    MedicalSupplierEmployee msEmployee = enterprise.getMedicalSupplierAccountDirectory().createMedicalSupplierEmployee(name, roleType);
                    UserAccount account = enterprise.getMedicalSupplierUADirectory().createUserAccount(username, password, msEmployee, new AdminRole(), email, phone);
                } else if (roleType.equals(Role.RoleType.FoodSupplier.getValue())) {
                    FoodSupplierEmployee fsEmployee = enterprise.getFoodSupplierEmployeeDirectory().createFoodSupplierEmployee(name, roleType);
                    UserAccount account = enterprise.getFoodSupplierUADirectory().createUserAccount(username, password, fsEmployee, new AdminRole(), email, phone);
                } else if (roleType.equals(Role.RoleType.Admin.getValue())) {
                    // something    
                    Soldiers soldier = enterprise.getSoldierDirectory().CreateSoldier(name, roleType);
                    UserAccount account = enterprise.getSoldierUADirectory().createUserAccount(username, password, soldier, new AdminRole(), email, phone);
                }
                populateTable();
                JOptionPane.showMessageDialog(null, username + " - Added This User Successfully!");
                usernameJTextField.setText("");
                passwordJPasswordField.setText("");
                nameJTextField1.setText("");
                emailJTextField.setText("");
                phoneJTextField.setText("");
            }
        }}        
    }//GEN-LAST:event_submitJButtonActionPerformed
     private boolean passwordpatterncorrect(String name)
    {
        Pattern pUser= Pattern.compile( "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mUser= pUser.matcher(name);
        if(mUser.find()){ return true; }
        else { return false;}
    }   
    
    
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void roleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleComboBoxActionPerformed

    private void usernameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameJTextFieldActionPerformed

    private void phoneJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneJTextFieldKeyTyped
        onlyNumbers(evt);
    }//GEN-LAST:event_phoneJTextFieldKeyTyped

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
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField emailJTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailLabel1;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nameJTextField1;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JTextField phoneJTextField;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
