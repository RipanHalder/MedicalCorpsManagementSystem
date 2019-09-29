/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.MedicalCampOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountSoldier.UserAccountSoldier;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorWorkAreaJPanel(userProcessContainer,(UserAccountSoldier) account, (MedicalCampOrganization)organization, enterprise, business);
    }
    
}
