/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RequestQueue;

import Business.Inventories.FoodSupplies;

public class NewRequestToFoodSupplier extends WorkRequestCampCommandantFoodSupplier{
    
     private String Result;
     private String requestCategory;
     private int quantity;
     private FoodSupplies foodSupplies;

     public NewRequestToFoodSupplier(){
         foodSupplies = new FoodSupplies();
     }
     
    public String getResult() {
        return Result;
    }

    public FoodSupplies getFoodSupplies() {
        return foodSupplies;
    }

    public void setFoodSupplies(String name, int quant) {
        this.foodSupplies.setFoodName(name);
        this.foodSupplies.setQuantity(quant);
    }

    public void setResult(String Result) {
        this.Result = Result;
    }

    public String getRequestCategory() {
        return requestCategory;
    }

    public void setRequestCategory(String requestCategory) {
        this.requestCategory = requestCategory;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
