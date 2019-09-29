/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalSupplierEmployee;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class MedicalSupplierEmployeeDirectory {
    
    private ArrayList<MedicalSupplierEmployee> medicalSupplierEmployeeList;

    public MedicalSupplierEmployeeDirectory() {
        medicalSupplierEmployeeList = new ArrayList();
    }

    public ArrayList<MedicalSupplierEmployee> getMedicalSupplierEmployeeList() {
        return medicalSupplierEmployeeList;
    }
    
    public MedicalSupplierEmployee createMedicalSupplierEmployee(String name, String roleType){
        MedicalSupplierEmployee medicalSupplierEmployee = new MedicalSupplierEmployee();
        try{
            medicalSupplierEmployee.setName(name);
            medicalSupplierEmployee.setRoleType(roleType);
            medicalSupplierEmployeeList.add(medicalSupplierEmployee);
            }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
        return medicalSupplierEmployee;
    }
    
    public void removeMedicalSupplierEmployee(MedicalSupplierEmployee s){
    medicalSupplierEmployeeList.remove(s);
    }
}