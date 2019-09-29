package Business.Organizations;

import Business.Inventories.MedicalSuppliesInventory;
import Business.Role.MedicalSupplierRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class MedicalSupplierOrganization extends Organization{
 
    private MedicalSuppliesInventory medicalSuppliesInventory;
     MedicalSupplierOrganization() {
     super(Organization.Type.MedicalSuppliers.getValue());   
     medicalSuppliesInventory = new MedicalSuppliesInventory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MedicalSupplierRole());
        return roles;
    }

    public MedicalSuppliesInventory getMedicalSuppliesInventory() {
        return medicalSuppliesInventory;
    }

    public void setMedicalSuppliesInventory(MedicalSuppliesInventory medicalSuppliesInventory) {
        this.medicalSuppliesInventory = medicalSuppliesInventory;
    }
}
