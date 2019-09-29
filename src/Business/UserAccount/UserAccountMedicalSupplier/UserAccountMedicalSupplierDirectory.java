/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount.UserAccountMedicalSupplier;

import Business.Role.Role;
import Business.MedicalSupplierEmployee.MedicalSupplierEmployee;
import java.util.ArrayList;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class UserAccountMedicalSupplierDirectory {
    
    private ArrayList<UserAccountMedicalSupplier> userAccountList;
    
     public UserAccountMedicalSupplierDirectory() {
        userAccountList = new ArrayList<>();
    }
     
     public ArrayList<UserAccountMedicalSupplier> getUserAccountList() {
        return userAccountList;
    }
     
     public UserAccountMedicalSupplier authenticateUser(String username, String password){
        for (UserAccountMedicalSupplier ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
     
     public UserAccountMedicalSupplier createUserAccount(String username, String password, MedicalSupplierEmployee employee, Role role,String email,String phone){
        UserAccountMedicalSupplier userAccount = new UserAccountMedicalSupplier();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setMedicalSupplierEmployee(employee);
        userAccount.setRole(role);
        userAccount.setEmail(email);
        userAccount.setPhoneNumber(phone);
        userAccountList.add(userAccount);
        return userAccount;
    }
     
     public boolean checkIfUsernameIsUnique(String username){
        for (UserAccountMedicalSupplier ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
