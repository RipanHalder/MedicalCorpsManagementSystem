/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.RequestQueue.NewRequestFromCampCommandantToCampCommandant;
import Business.RequestQueue.RequestQueueCampCommandantCampCommandant;
import Business.RequestQueue.RequestQueueCampCommandantDoctor;
import Business.RequestQueue.RequestQueueCampCommandantFoodSupplier;
import Business.RequestQueue.RequestQueueDoctorMedicalSupplier;
import Business.Role.Role;
import Business.RequestQueue.RequestQueueNurseCampCommandant;
import Business.RequestQueue.RequestQueueNurseDoctor;
import Business.RequestQueue.WorkRequestCampCommandantCampCommandant;
/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class UserAccount {
    
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private Role role;
    private RequestQueueNurseCampCommandant requestQueue;
    private RequestQueueCampCommandantFoodSupplier requestQueueCampCommandantFoodSupplier;
    private RequestQueueDoctorMedicalSupplier requestQueueDoctorMedicalSupplier;
    private RequestQueueCampCommandantDoctor requestQueueCampCommandantDoctor;
    private RequestQueueNurseDoctor requestQueueNurseDoctor;
    private RequestQueueCampCommandantCampCommandant requestQueueCampCommandantCampCommandant;

    public UserAccount() {
        requestQueue = new RequestQueueNurseCampCommandant();
        requestQueueCampCommandantFoodSupplier = new RequestQueueCampCommandantFoodSupplier();
        requestQueueDoctorMedicalSupplier = new RequestQueueDoctorMedicalSupplier();
        requestQueueCampCommandantDoctor = new RequestQueueCampCommandantDoctor();
        requestQueueNurseDoctor = new RequestQueueNurseDoctor();
        requestQueueCampCommandantCampCommandant = new RequestQueueCampCommandantCampCommandant();
    }
    
    public String getUsername() {
        return username;
    }

    public RequestQueueCampCommandantCampCommandant getRequestQueueCampCommandantCampCommandant() {
        return requestQueueCampCommandantCampCommandant;
    }

    public void setRequestQueueCampCommandantCampCommandant(RequestQueueCampCommandantCampCommandant requestQueueCampCommandantCampCommandant) {
        this.requestQueueCampCommandantCampCommandant = requestQueueCampCommandantCampCommandant;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public void setUsername(String username) {
        this.username = username;
    }

    public RequestQueueCampCommandantFoodSupplier getRequestQueueCampCommandantFoodSupplier() {
        return requestQueueCampCommandantFoodSupplier;
    }

    public void setRequestQueueCampCommandantFoodSupplier(RequestQueueCampCommandantFoodSupplier requestQueueCampCommandantFoodSupplier) {
        this.requestQueueCampCommandantFoodSupplier = requestQueueCampCommandantFoodSupplier;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public RequestQueueNurseCampCommandant getRequestQueue() {
        return requestQueue;
    }

    @Override
    public String toString() {
        return username;
    }
    
}
