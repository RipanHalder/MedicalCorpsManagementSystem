/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organizations.Organization;
import Business.Role.Role;
import Business.Role.AdminRole;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    public static EcoSystem getInstance(){
        try{
            if(business==null){
                business=new EcoSystem();
            }
            }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    public void removeNetwork(Network network){
        networkList.remove(network);
     }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new AdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        try{
            if(!this.getSoldierUADirectory().checkIfUsernameIsUnique(userName)){
                return false;
            }
            for(Network network:networkList){

            }
            }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
        return true;
    }
}
