/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RequestQueue;

import Business.UserAccount.UserAccountSoldier.UserAccountSoldier;
import java.util.Date;

/**
 *
 * @author ripan
 */
public class WorkRequestCampCommandantDoctor {
 private String message;
    private UserAccountSoldier sender;
    private UserAccountSoldier receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    
    public WorkRequestCampCommandantDoctor(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccountSoldier getSender() {
        return sender;
    }

    public void setSender(UserAccountSoldier sender) {
        this.sender = sender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }   

    public UserAccountSoldier getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccountSoldier receiver) {
        this.receiver = receiver;
    }
    @Override
    public String toString(){
        return message;
    }
}
