/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.FoodSupplierEmployee.FoodSupplierEmployee;
import Business.Soldiers.Soldiers;
import Business.Organizations.Organization;
import Business.Organizations.OrganizationDirectory;
import Business.Role.Role;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class ManageFoodSuppliersJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageFoodSuppliersJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDir) {
        try {
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.organizationDir = organizationDir;

            populateOrganizationComboBox();
            populateOrganizationEmpComboBox();
            populatefoodSupplierRoleComboBox();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Array Out of Bound Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }

    public void populateOrganizationComboBox() {
        try {
            organizationJComboBox.removeAllItems();

            organizationDir.getOrganizationList().forEach((organization) -> {
                organizationJComboBox.addItem(organization);
            });
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Array Out of Bound Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }

    public void populateOrganizationEmpComboBox() {
        try {
            organizationEmpJComboBox.removeAllItems();

            organizationDir.getOrganizationList().forEach((organization) -> {
                organizationEmpJComboBox.addItem(organization);
            });
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Array Out of Bound Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }

    public void populatefoodSupplierRoleComboBox() {
        try {
            foodSupplierRoleComboBox.removeAllItems();
            foodSupplierRoleComboBox.addItem(Role.RoleType.FoodSupplier.getValue());
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Array Out of Bound Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }

    private void populateTable(Organization organization) {
        try {
            DefaultTableModel model = (DefaultTableModel) employeeJTable.getModel();

            model.setRowCount(0);

            organization.getFoodSupplierEmployeeDirectory().getFoodSupplierEmployeeList().stream().map((foodSupplier) -> {
                Object[] row = new Object[2];
                row[0] = foodSupplier;
                //row[1] = foodSupplier;
                return row;
            }).forEachOrdered((row) -> {
                model.addRow(row);
            });
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Array Out of Bound Exception Occurred!");
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
                ImageIcon img=new ImageIcon("bluesky.jpg");
                Image i=img.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height,this);
            }
        };
        backJButton = new javax.swing.JButton();
        createEmployeeButton = new javax.swing.JButton();
        foodSupplierRoleComboBox = new javax.swing.JComboBox<String>();
        nameJTextField = new javax.swing.JTextField();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        deleteJButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setBackground(new java.awt.Color(51, 153, 255));
        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        backJButton.setForeground(java.awt.Color.white);
        backJButton.setText("<< BACK");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 230, -1));

        createEmployeeButton.setBackground(new java.awt.Color(51, 153, 255));
        createEmployeeButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        createEmployeeButton.setForeground(java.awt.Color.white);
        createEmployeeButton.setText("CREATE");
        createEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEmployeeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(createEmployeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 250, -1));

        foodSupplierRoleComboBox.setBackground(new java.awt.Color(51, 153, 255));
        foodSupplierRoleComboBox.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        foodSupplierRoleComboBox.setForeground(java.awt.Color.white);
        foodSupplierRoleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(foodSupplierRoleComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 300, -1));

        nameJTextField.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jPanel1.add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 300, -1));

        organizationEmpJComboBox.setBackground(new java.awt.Color(51, 153, 255));
        organizationEmpJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        organizationEmpJComboBox.setForeground(java.awt.Color.white);
        organizationEmpJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 300, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Organization:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 200, -1));

        jLabel2.setBackground(new java.awt.Color(51, 153, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 100, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Role:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 120, -1));

        employeeJTable.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        employeeJTable.setForeground(new java.awt.Color(51, 153, 255));
        employeeJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        employeeJTable.setRowHeight(36);
        jScrollPane1.setViewportView(employeeJTable);
        if (employeeJTable.getColumnModel().getColumnCount() > 0) {
            employeeJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 330, 180));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Organization:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 200, -1));

        organizationJComboBox.setBackground(new java.awt.Color(51, 153, 255));
        organizationJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        organizationJComboBox.setForeground(java.awt.Color.white);
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 300, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 530, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 530, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("EMPLOYEE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 360, 10));

        deleteJButton.setBackground(new java.awt.Color(51, 153, 255));
        deleteJButton.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        deleteJButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteJButton.setText("Delete");
        deleteJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 240, 50));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void createEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEmployeeButtonActionPerformed
        try {
            Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
            String name = nameJTextField.getText();
            String roleType = foodSupplierRoleComboBox.getSelectedItem().toString();
            if (nameJTextField.getText().replaceAll(" ", "").length() == 0) {
                JOptionPane.showMessageDialog(null, "Name cannot be blank");
            } else {
                organization.getFoodSupplierEmployeeDirectory().createFoodSupplierEmployee(name, roleType);
            }
            populateTable(organization);
            nameJTextField.setText("");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Array Out of Bound Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_createEmployeeButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        try {
            userProcessContainer.remove(this);
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

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        try {
            Organization organization = (Organization) organizationJComboBox.getSelectedItem();
            if (organization != null) {
                populateTable(organization);
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Array Out of Bound Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void deleteJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJButtonActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = employeeJTable.getSelectedRow();
            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Please select a row.");
            } else {
                int selectionButton = JOptionPane.YES_NO_OPTION;
                int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??", "Warning", selectionButton);
                if (selectionResult == JOptionPane.YES_OPTION) {
                    FoodSupplierEmployee s = (FoodSupplierEmployee) employeeJTable.getValueAt(selectedRow, 1);
                    Organization org = (Organization) organizationJComboBox.getSelectedItem();
                    for (FoodSupplierEmployee s1 : org.getFoodSupplierEmployeeDirectory().getFoodSupplierEmployeeList()) {
                        if (s1 == s) {
                            org.getFoodSupplierEmployeeDirectory().removeFoodSupplier(s);
                            JOptionPane.showMessageDialog(null, s1.getName() + " removed from the organization!");
                            break;
                        }
                    }
                    nameJTextField.setText("");
                    populateTable(org);
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_deleteJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createEmployeeButton;
    private javax.swing.JButton deleteJButton;
    private javax.swing.JTable employeeJTable;
    private javax.swing.JComboBox<String> foodSupplierRoleComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    // End of variables declaration//GEN-END:variables
}
