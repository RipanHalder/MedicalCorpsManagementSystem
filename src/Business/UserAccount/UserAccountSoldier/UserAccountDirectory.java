/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount.UserAccountSoldier;

import Business.Role.Role;
import Business.Soldiers.Soldiers;
import java.util.ArrayList;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccountSoldier> userAccountList;
    
     public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }
     
     public ArrayList<UserAccountSoldier> getUserAccountList() {
        return userAccountList;
    }
     
     public UserAccountSoldier authenticateUser(String username, String password){
        for (UserAccountSoldier ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
     
     public UserAccountSoldier createUserAccount(String username, String password, Soldiers soldier, Role role,String email,String phone){
        UserAccountSoldier userAccount = new UserAccountSoldier();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setSoldier(soldier);
        userAccount.setRole(role);
        userAccount.setEmail(email);
        userAccount.setPhoneNumber(phone);
        userAccountList.add(userAccount);
        return userAccount;
    }
     
     public boolean checkIfUsernameIsUnique(String username){
        for (UserAccountSoldier ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
