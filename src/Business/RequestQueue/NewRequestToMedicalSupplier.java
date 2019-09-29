/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RequestQueue;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class NewRequestToMedicalSupplier extends WorkRequestDoctorMedicalSupplier{
    
    private String Result;
    private String requestCategory;
    
    public String getResult() {
        return Result;
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
    
}
