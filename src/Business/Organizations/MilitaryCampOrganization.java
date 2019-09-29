package Business.Organizations;

import Business.Inventories.FoodSuppliesInMilitaryCamp;
import Business.Inventories.FoodSuppliesInMilitaryCampInventory;
import Business.Inventories.MedicalSuppliesInMilitaryCamp;
import Business.Inventories.MedicalSuppliesInMilitaryCampInventory;
import Business.Role.CampCommandantRole;
import Business.Role.NurseRole;
import Business.Role.Role;
import java.util.ArrayList;


public class MilitaryCampOrganization extends Organization{

    private BedsMilitaryCamps bedsMilitaryCamps;
    private FoodSuppliesInMilitaryCampInventory foodSuppliesInMilitaryCamp;
    private MedicalSuppliesInMilitaryCampInventory medicalSuppliesInMilitaryCamp;
    
    MilitaryCampOrganization() {
     super(Organization.Type.Soldiers.getValue());  
     bedsMilitaryCamps = new BedsMilitaryCamps();
     foodSuppliesInMilitaryCamp = new FoodSuppliesInMilitaryCampInventory();
     medicalSuppliesInMilitaryCamp = new MedicalSuppliesInMilitaryCampInventory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NurseRole());
        roles.add(new CampCommandantRole());
        return roles;
    }

    public FoodSuppliesInMilitaryCampInventory getFoodSuppliesInMilitaryCamp() {
        return foodSuppliesInMilitaryCamp;
    }

    

    public void setFoodSuppliesInMilitaryCamp(FoodSuppliesInMilitaryCampInventory foodSuppliesInMilitaryCamp) {
        this.foodSuppliesInMilitaryCamp = foodSuppliesInMilitaryCamp;
    }

    public MedicalSuppliesInMilitaryCampInventory getMedicalSuppliesInMilitaryCamp() {
        return medicalSuppliesInMilitaryCamp;
    }

    public void setMedicalSuppliesInMilitaryCamp(MedicalSuppliesInMilitaryCampInventory medicalSuppliesInMilitaryCamp) {
        this.medicalSuppliesInMilitaryCamp = medicalSuppliesInMilitaryCamp;
    }

    public BedsMilitaryCamps getBedsMilitaryCamps() {
        return bedsMilitaryCamps;
    }

    public void setBedsMilitaryCamps(BedsMilitaryCamps bedsMilitaryCamps) {
        this.bedsMilitaryCamps = bedsMilitaryCamps;
    }
    
}
