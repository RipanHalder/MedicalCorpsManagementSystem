/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.FoodSupplierOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountFoodSupplier.UserAccountFoodSupplier;
import Business.UserAccount.UserAccountSoldier.UserAccountSoldier;
import javax.swing.JPanel;
import userinterface.FoodSupplierRole.FoodSupplierWorkAreaJPanel;
import userinterface.MedicalSupplierRole.MedicalSupplierWorkAreaJPanel;
import userinterface.NurseRole.NurseWorkAreaJPanel;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class FoodSupplierRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FoodSupplierWorkAreaJPanel(userProcessContainer,(UserAccountFoodSupplier) account, (FoodSupplierOrganization)organization, business);
    }

    
}
