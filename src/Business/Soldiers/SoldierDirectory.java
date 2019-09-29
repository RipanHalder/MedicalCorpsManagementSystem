/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Soldiers;

import Business.Role.Role;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class SoldierDirectory {

    private ArrayList<Soldiers> soldierList;

    public SoldierDirectory() {
        soldierList = new ArrayList<>();
    }

    public ArrayList<Soldiers> getSoldierList() {
        return soldierList;
    }

    public Soldiers CreateSoldier(String name, String roleType) {
        Soldiers soldier = new Soldiers();
        try {
            soldier.setName(name);
            soldier.setRoleType(roleType);
            soldierList.add(soldier);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
        return soldier;
    }
    public void removeSoldier(Soldiers s){
    soldierList.remove(s);
    }
}
