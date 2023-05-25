/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DELL
 */
public class PaymentModel {
    private int payID;
    private String payName;

    public PaymentModel(int payID, String payName) {
        this.payID = payID;
        this.payName = payName;
    }

    public int getPayID() {
        return payID;
    }

    public void setPayID(int payID) {
        this.payID = payID;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }
    
}
