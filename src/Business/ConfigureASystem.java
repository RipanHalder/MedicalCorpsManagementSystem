package Business;

import Business.Soldiers.Soldiers;
import Business.Role.AdminRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccountSoldier.UserAccountSoldier;
import javax.swing.JOptionPane;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        EcoSystem system = EcoSystem.getInstance();
        try{    
            Soldiers soldiers = system.getSoldierDirectory().CreateSoldier("Ripan", Role.RoleType.CampCommandant.getValue());

            UserAccountSoldier ua = system.getSoldierUADirectory().createUserAccount("sysadmin", "sysadmin", soldiers, new SystemAdminRole(),"medicalcorpsmanagementsystem@gmail.com","Ripan Halder, Nilay Haryalripanmanish");
            }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
        finally{
        
            return system;
        }
    }
    
}
