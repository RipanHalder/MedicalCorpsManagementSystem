/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount.UserAccountSoldier;

import Business.Soldiers.Soldiers;
import Business.UserAccount.UserAccount;
/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class UserAccountSoldier extends UserAccount{
    
    private Soldiers soldier;    

    public Soldiers getSoldier() {
        return soldier;
    }

    public void setSoldier(Soldiers soldier) {
        this.soldier = soldier;
    }
    
    
        
}
