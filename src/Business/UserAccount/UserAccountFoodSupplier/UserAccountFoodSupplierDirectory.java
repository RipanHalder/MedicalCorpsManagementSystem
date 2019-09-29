/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount.UserAccountFoodSupplier;

import Business.FoodSupplierEmployee.FoodSupplierEmployee;
import Business.Role.Role;
import Business.Soldiers.Soldiers;
import java.util.ArrayList;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class UserAccountFoodSupplierDirectory {
    
    private ArrayList<UserAccountFoodSupplier> userAccountList;
    
     public UserAccountFoodSupplierDirectory() {
        userAccountList = new ArrayList<>();
    }
     
     public ArrayList<UserAccountFoodSupplier> getUserAccountList() {
        return userAccountList;
    }
     
     public UserAccountFoodSupplier authenticateUser(String username, String password){
        for (UserAccountFoodSupplier ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
     
     public UserAccountFoodSupplier createUserAccount(String username, String password, FoodSupplierEmployee employee, Role role,String email,String phone){
        UserAccountFoodSupplier userAccount = new UserAccountFoodSupplier();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setFoodSupplierEmployee(employee);
        userAccount.setRole(role);
        userAccount.setEmail(email);
        userAccount.setPhoneNumber(phone);
        userAccountList.add(userAccount);
        return userAccount;
    }
     
     public boolean checkIfUsernameIsUnique(String username){
        for (UserAccountFoodSupplier ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
