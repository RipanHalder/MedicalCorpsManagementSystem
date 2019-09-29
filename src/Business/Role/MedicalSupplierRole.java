/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.MilitaryCampOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccountMedicalSupplier.UserAccountMedicalSupplier;
import Business.UserAccount.UserAccount;
import Business.Organizations.MedicalSupplierOrganization;
import javax.swing.JPanel;
import userinterface.MedicalSupplierRole.MedicalSupplierWorkAreaJPanel;
import userinterface.NurseRole.NurseWorkAreaJPanel;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class MedicalSupplierRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new MedicalSupplierWorkAreaJPanel(userProcessContainer,(UserAccountMedicalSupplier) account, (MedicalSupplierOrganization)organization, business);
    }
    
}
