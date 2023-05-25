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
public class SalaryModel {
    private int salaryID;
    private int userID;
    private int shiftID;
    private float bonus;
    private float fine;
    private int status;
    private String note;

    public SalaryModel(int salaryID, int userID, int shiftID, float bonus, float fine, int status, String note) {
        this.salaryID = salaryID;
        this.userID = userID;
        this.shiftID = shiftID;
        this.bonus = bonus;
        this.fine = fine;
        this.status = status;
        this.note = note;
    }

    public int getSalaryID() {
        return salaryID;
    }

    public void setSalaryID(int salaryID) {
        this.salaryID = salaryID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getShiftID() {
        return shiftID;
    }

    public void setShiftID(int shiftID) {
        this.shiftID = shiftID;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float getFine() {
        return fine;
    }

    public void setFine(float fine) {
        this.fine = fine;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
    
}
