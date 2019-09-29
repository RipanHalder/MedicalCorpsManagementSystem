/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventories;

import java.util.HashMap;

/**
 *
 * @author Ripan Halder
 */
public class MedicalSuppliesInMedicalCampInventory {
    private HashMap<String, Integer> medicalInventory;
    
    public MedicalSuppliesInMedicalCampInventory(){
        medicalInventory = new HashMap<>();
    }

    public HashMap<String, Integer> getMedicalInventory() {
        return medicalInventory;
    }

    public void addToMedicalInventory(String drugName, Integer quantity) {
        this.medicalInventory.put(drugName, quantity);
    }
}
