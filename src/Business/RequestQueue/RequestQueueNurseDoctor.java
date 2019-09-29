/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RequestQueue;

import java.util.ArrayList;

/**
 *
 * @author Ripan Halder, Nilay Haryal
 */
public class RequestQueueNurseDoctor {
 
    private ArrayList<WorkRequestNurseDoctor> workRequestNurseDoctorList;
    
    public RequestQueueNurseDoctor() {
        workRequestNurseDoctorList = new ArrayList<>();
    }

    public ArrayList<WorkRequestNurseDoctor> getWorkRequestNurseDoctorList() {
        return workRequestNurseDoctorList;
    }
}
