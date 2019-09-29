/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FoodSupplierEmployee;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class FoodSupplierEmployeeDirectory {
    
    private ArrayList<FoodSupplierEmployee> foodSupplierEmployeeList;

    public FoodSupplierEmployeeDirectory() {
        foodSupplierEmployeeList = new ArrayList();
    }

    public ArrayList<FoodSupplierEmployee> getFoodSupplierEmployeeList() {
        return foodSupplierEmployeeList;
    }
    
    public FoodSupplierEmployee createFoodSupplierEmployee(String name, String roleType){
        FoodSupplierEmployee foodSupplierEmployee = new FoodSupplierEmployee();
        try{            
            foodSupplierEmployee.setName(name);
            foodSupplierEmployee.setRoleType(roleType);
            foodSupplierEmployeeList.add(foodSupplierEmployee);
            }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
        return foodSupplierEmployee;
    }
    public void removeFoodSupplier(FoodSupplierEmployee s){
    foodSupplierEmployeeList.remove(s);
    }
}