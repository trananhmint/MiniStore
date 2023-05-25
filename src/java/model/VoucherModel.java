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
public class VoucherModel {
    private int voucherID;
    private String voucherName;
    private float promotion;
    private float maximum;
    private String type;
    private float condition;
    private int status;

    public VoucherModel(int voucherID, String voucherName, float promotion, float maximum, String type, float condition, int status) {
        this.voucherID = voucherID;
        this.voucherName = voucherName;
        this.promotion = promotion;
        this.maximum = maximum;
        this.type = type;
        this.condition = condition;
        this.status = status;
    }

    public int getVoucherID() {
        return voucherID;
    }

    public void setVoucherID(int voucherID) {
        this.voucherID = voucherID;
    }

    public String getVoucherName() {
        return voucherName;
    }

    public void setVoucherName(String voucherName) {
        this.voucherName = voucherName;
    }

    public float getPromotion() {
        return promotion;
    }

    public void setPromotion(float promotion) {
        this.promotion = promotion;
    }

    public float getMaximum() {
        return maximum;
    }

    public void setMaximum(float maximum) {
        this.maximum = maximum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getCondition() {
        return condition;
    }

    public void setCondition(float condition) {
        this.condition = condition;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
