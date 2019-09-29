/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organizations.OrganizationDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    
    public void removeEnterprise(Enterprise e){
    enterpriseList.remove(e);
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        try{
            if(type==Enterprise.EnterpriseType.ArmedForces){
                enterprise=new ArmedForcesEnterprise(name);
                enterpriseList.add(enterprise);
            }
            if(type==Enterprise.EnterpriseType.MedicalSuppliers){
                enterprise=new MedicalSuppliersEnterprise(name);
                enterpriseList.add(enterprise);
            }
            if(type==Enterprise.EnterpriseType.FoodSuppliers){
                enterprise=new FoodSuppliersEnterprise(name);
                enterpriseList.add(enterprise);
            }
            }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
        return enterprise;
    }
}
