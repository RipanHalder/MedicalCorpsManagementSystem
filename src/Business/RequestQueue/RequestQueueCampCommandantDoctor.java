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
public class RequestQueueCampCommandantDoctor {
 
    private ArrayList<WorkRequestCampCommandantDoctor> workRequestCampCommandantDoctor;
    
    public RequestQueueCampCommandantDoctor() {
        workRequestCampCommandantDoctor = new ArrayList<>();
    }

    public ArrayList<WorkRequestCampCommandantDoctor> getWorkRequestCampCommandantDoctor() {
        return workRequestCampCommandantDoctor;
    }
}
