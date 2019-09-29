/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Enterprise.FoodSuppliersEnterprise;
import java.util.ArrayList;
import Business.Organizations.Organization.Type;
import Business.Organizations.MilitaryCampOrganization;
import Business.Organizations.MedicalSupplierOrganization;
/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
     public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type,String name, String longitude, String latitude){
        Organization organization = null;
        if (type.getValue().equals(Type.Soldiers.getValue())){
            organization = new MilitaryCampOrganization();
            organization.setName(name);
            organization.setLatitute(latitude);
            organization.setLongitute(longitude);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.MedicalSuppliers.getValue())){
            organization = new MedicalSupplierOrganization();
            organization.setName(name);
            organization.setLatitute(latitude);
            organization.setLongitute(longitude);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Doctors.getValue())){
            organization = new MedicalCampOrganization();
            organization.setName(name);
            organization.setLatitute(latitude);
            organization.setLongitute(longitude);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FoodSuppliers.getValue())){
            organization = new FoodSupplierOrganization();
            organization.setName(name);
            organization.setLatitute(latitude);
            organization.setLongitute(longitude);
            organizationList.add(organization);
        }
        return organization;
    }
    
    public void removeOrganization(Organization o){
    organizationList.remove(o);
    }
}
