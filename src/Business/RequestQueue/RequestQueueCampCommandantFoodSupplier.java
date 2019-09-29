/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RequestQueue;

import java.util.ArrayList;

/**
 *
 * @author ripan
 */
public class RequestQueueCampCommandantFoodSupplier {
 
    private ArrayList<WorkRequestCampCommandantFoodSupplier> workRequestCampCommandantFoodSupplier;
    
    public RequestQueueCampCommandantFoodSupplier() {
        workRequestCampCommandantFoodSupplier = new ArrayList<>();
    }

    public ArrayList<WorkRequestCampCommandantFoodSupplier> getWorkRequestCampCommandantFoodSupplier() {
        return workRequestCampCommandantFoodSupplier;
    }
}
