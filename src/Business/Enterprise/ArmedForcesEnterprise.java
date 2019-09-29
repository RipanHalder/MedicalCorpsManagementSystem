/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class ArmedForcesEnterprise extends Enterprise {
    
    public ArmedForcesEnterprise(String name){
        super(name,EnterpriseType.ArmedForces);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
