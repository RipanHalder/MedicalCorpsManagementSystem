package Business.Organizations;

import Business.Inventories.FoodSuppliesInMedicalCampInventory;
import Business.Inventories.MedicalSuppliesInMedicalCampInventory;
import Business.Inventories.MedicalSuppliesInventory;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class MedicalCampOrganization extends Organization {
    
    private BedsMedicalCamps bedsMedicalCamps;
    private FoodSuppliesInMedicalCampInventory foodSuppliesInMedicalCampInventory;
    private MedicalSuppliesInMedicalCampInventory medicalSuppliesInMedicalCampInventory;
    
    MedicalCampOrganization() {
     super(Organization.Type.Doctors.getValue());   
     bedsMedicalCamps = new BedsMedicalCamps();
     foodSuppliesInMedicalCampInventory = new FoodSuppliesInMedicalCampInventory();
     medicalSuppliesInMedicalCampInventory = new MedicalSuppliesInMedicalCampInventory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }   

    public BedsMedicalCamps getBedsMedicalCamps() {
        return bedsMedicalCamps;
    }

    public void setBedsMedicalCamps(BedsMedicalCamps bedsMedicalCamps) {
        this.bedsMedicalCamps = bedsMedicalCamps;
    }
}
