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
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountSoldier.UserAccountSoldier;
import javax.swing.JPanel;
import userinterface.CampCommandantRole.CampCommandantWorkAreaJPanel;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class BaseSoldierRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CampCommandantWorkAreaJPanel(userProcessContainer,(UserAccountSoldier) account, (MilitaryCampOrganization)organization, enterprise, business);
    }
    
    private Boolean admitted;
    private Boolean admittedToAnotherCamp;
    private String admittedReason;
    
    public BaseSoldierRole(){
        admitted = false;
        admittedToAnotherCamp = false;
    }

    public Boolean getAdmitted() {
        return admitted;
    }

    public void setAdmitted(Boolean admitted) {
        this.admitted = admitted;
    }

    public Boolean getAdmittedToAnotherCamp() {
        return admittedToAnotherCamp;
    }

    public void setAdmittedToAnotherCamp(Boolean admittedToAnotherCamp) {
        this.admittedToAnotherCamp = admittedToAnotherCamp;
    }

    public String getAdmittedReason() {
        return admittedReason;
    }

    public void setAdmittedReason(String admittedReason) {
        this.admittedReason = admittedReason;
    }
}
