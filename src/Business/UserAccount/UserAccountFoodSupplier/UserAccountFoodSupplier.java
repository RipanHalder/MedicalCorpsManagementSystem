/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount.UserAccountFoodSupplier;

import Business.FoodSupplierEmployee.FoodSupplierEmployee;
import Business.MedicalCampEmployee.MedicalCampEmployee;
import Business.MedicalSupplierEmployee.MedicalSupplierEmployee;
import Business.Role.Role;
import Business.Soldiers.Soldiers;
import Business.RequestQueue.RequestQueueNurseCampCommandant;
import Business.UserAccount.UserAccount;
/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class UserAccountFoodSupplier extends UserAccount{
    
    private FoodSupplierEmployee foodSupplierEmployee;

    
    public FoodSupplierEmployee getFoodSupplierEmployee() {
        return foodSupplierEmployee;
    }

    public void setFoodSupplierEmployee(FoodSupplierEmployee foodSupplierEmployee) {
        this.foodSupplierEmployee = foodSupplierEmployee;
    }
    
}
