/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.RequestQueue.RequestQueueNurseCampCommandant;
import Business.Role.Role;
import Business.Soldiers.SoldierDirectory;
import java.util.ArrayList;
import Business.MedicalSupplierEmployee.MedicalSupplierEmployeeDirectory;
import Business.FoodSupplierEmployee.FoodSupplierEmployeeDirectory;
import Business.RequestQueue.RequestQueueCampCommandantCampCommandant;
import Business.RequestQueue.RequestQueueCampCommandantDoctor;
import Business.RequestQueue.RequestQueueCampCommandantFoodSupplier;
import Business.RequestQueue.RequestQueueDoctorMedicalSupplier;
import Business.RequestQueue.RequestQueueNurseDoctor;
import Business.UserAccount.UserAccountSoldier.UserAccountDirectory;
import Business.UserAccount.UserAccountMedicalSupplier.UserAccountMedicalSupplierDirectory;
import Business.UserAccount.UserAccountFoodSupplier.UserAccountFoodSupplierDirectory;

public abstract class Organization {
    
    private String name;
    private RequestQueueNurseCampCommandant requestQueue;
    private RequestQueueCampCommandantFoodSupplier requestQueueCampCommandantFoodSupplier;
    private RequestQueueDoctorMedicalSupplier requestQueueDoctorMedicalSupplier;
    private SoldierDirectory soldierDirectory;
    private MedicalSupplierEmployeeDirectory medicalSupplierAccountDirectory;
    private FoodSupplierEmployeeDirectory foodSupplierEmployeeDirectory;
    private UserAccountDirectory soldierUADirectory;
    private UserAccountFoodSupplierDirectory foodSupplierUADirectory;
    private UserAccountMedicalSupplierDirectory medicalSupplierUADirectory;
    private RequestQueueCampCommandantCampCommandant requestQueueCampCommandantCampCommandant;
    private int organizationID;
    private static int counter;
    private RequestQueueCampCommandantDoctor requestQueueCampCommandantDoctor;
    private RequestQueueNurseDoctor requestQueueNurseDoctor;
    
    private String longitute;
    private String latitute;
    
    
    public enum Type{
        Admin("Admin Organization"), 
        Soldiers("Military Camp Organization"), 
        MedicalSuppliers("Medical Suppliers Organization"),
        FoodSuppliers("Food Suppliers Organization"),
        Doctors("Medical Camp Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
     public Organization(String name) {
        this.name = name;
        requestQueue = new RequestQueueNurseCampCommandant();
        requestQueueCampCommandantFoodSupplier = new RequestQueueCampCommandantFoodSupplier();
        requestQueueCampCommandantDoctor = new RequestQueueCampCommandantDoctor();
        soldierDirectory = new SoldierDirectory();
        foodSupplierEmployeeDirectory = new FoodSupplierEmployeeDirectory();
        medicalSupplierAccountDirectory = new MedicalSupplierEmployeeDirectory();
        soldierUADirectory = new UserAccountDirectory();
        medicalSupplierUADirectory = new UserAccountMedicalSupplierDirectory();
        foodSupplierUADirectory = new UserAccountFoodSupplierDirectory();
        requestQueueDoctorMedicalSupplier = new RequestQueueDoctorMedicalSupplier();
        requestQueueNurseDoctor = new RequestQueueNurseDoctor();
        requestQueueCampCommandantCampCommandant = new RequestQueueCampCommandantCampCommandant();
        organizationID = counter;        
        ++counter;
    }
     
     public abstract ArrayList<Role> getSupportedRole();
     
    public int getOrganizationID() {
        return organizationID;
    }

    public String getLongitute() {
        return longitute;
    }

    public void setLongitute(String longitute) {
        this.longitute = longitute;
    }

    public String getLatitute() {
        return latitute;
    }

    public void setLatitute(String latitute) {
        this.latitute = latitute;
    }

    public RequestQueueCampCommandantCampCommandant getRequestQueueCampCommandantCampCommandant() {
        return requestQueueCampCommandantCampCommandant;
    }

    public void setRequestQueueCampCommandantCampCommandant(RequestQueueCampCommandantCampCommandant requestQueueCampCommandantCampCommandant) {
        this.requestQueueCampCommandantCampCommandant = requestQueueCampCommandantCampCommandant;
    }

    public RequestQueueNurseDoctor getRequestQueueNurseDoctor() {
        return requestQueueNurseDoctor;
    }

    public void setRequestQueueNurseDoctor(RequestQueueNurseDoctor requestQueueNurseDoctor) {
        this.requestQueueNurseDoctor = requestQueueNurseDoctor;
    }

    public RequestQueueDoctorMedicalSupplier getRequestQueueDoctorMedicalSupplier() {
        return requestQueueDoctorMedicalSupplier;
    }

    public RequestQueueCampCommandantDoctor getRequestQueueCampCommandantDoctor() {
        return requestQueueCampCommandantDoctor;
    }

    public void setRequestQueueCampCommandantDoctor(RequestQueueCampCommandantDoctor requestQueueCampCommandantDoctor) {
        this.requestQueueCampCommandantDoctor = requestQueueCampCommandantDoctor;
    }

    public void setRequestQueueDoctorMedicalSupplier(RequestQueueDoctorMedicalSupplier requestQueueDoctorMedicalSupplier) {
        this.requestQueueDoctorMedicalSupplier = requestQueueDoctorMedicalSupplier;
    }

    public RequestQueueCampCommandantFoodSupplier getRequestQueueCampCommandantFoodSupplier() {
        return requestQueueCampCommandantFoodSupplier;
    }

    public void setRequestQueueCampCommandantFoodSupplier(RequestQueueCampCommandantFoodSupplier requestQueueCampCommandantFoodSupplier) {
        this.requestQueueCampCommandantFoodSupplier = requestQueueCampCommandantFoodSupplier;
    }

    public SoldierDirectory getSoldierDirectory() {
        return soldierDirectory;
    }

    public UserAccountDirectory getSoldierUADirectory() {
        return soldierUADirectory;
    }

    public void setSoldierUADirectory(UserAccountDirectory soldierUADirectory) {
        this.soldierUADirectory = soldierUADirectory;
    }

    public UserAccountFoodSupplierDirectory getFoodSupplierUADirectory() {
        return foodSupplierUADirectory;
    }

    public void setFoodSupplierUADirectory(UserAccountFoodSupplierDirectory foodSupplierUADirectory) {
        this.foodSupplierUADirectory = foodSupplierUADirectory;
    }

    public UserAccountMedicalSupplierDirectory getMedicalSupplierUADirectory() {
        return medicalSupplierUADirectory;
    }

    public void setMedicalSupplierUADirectory(UserAccountMedicalSupplierDirectory medicalSupplierUADirectory) {
        this.medicalSupplierUADirectory = medicalSupplierUADirectory;
    }
    
    public String getName() {
        return name;
    }

    public MedicalSupplierEmployeeDirectory getMedicalSupplierAccountDirectory() {
        return medicalSupplierAccountDirectory;
    }

    public void setMedicalSupplierAccountDirectory(MedicalSupplierEmployeeDirectory medicalSupplierAccountDirectory) {
        this.medicalSupplierAccountDirectory = medicalSupplierAccountDirectory;
    }

    public FoodSupplierEmployeeDirectory getFoodSupplierEmployeeDirectory() {
        return foodSupplierEmployeeDirectory;
    }

    public void setFoodSupplierEmployeeDirectory(FoodSupplierEmployeeDirectory foodSupplierEmployeeDirectory) {
        this.foodSupplierEmployeeDirectory = foodSupplierEmployeeDirectory;
    }

    public RequestQueueNurseCampCommandant getRequestQueue() {
        return requestQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRequestQueue(RequestQueueNurseCampCommandant requestQueue) {
        this.requestQueue = requestQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    

}
