/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class ShiftTimeModel {
    private int shiftID;
    private int userID;
    private Date date;
    private LocalTime shiftStart;
    private LocalTime shiftEnd;
    private float shiftSalary;
    private int status;

    public ShiftTimeModel(int shiftID, int userID, LocalTime shiftStart, LocalTime shiftEnd, float shiftSalary, int status) {
        this.shiftID = shiftID;
        this.userID = userID;
        this.shiftStart = shiftStart;
        this.shiftEnd = shiftEnd;
        this.shiftSalary = shiftSalary;
        this.status = status;
    }

    public int getShiftID() {
        return shiftID;
    }

    public void setShiftID(int shiftID) {
        this.shiftID = shiftID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public LocalTime getShiftStart() {
        return shiftStart;
    }

    public void setShiftStart(LocalTime shiftStart) {
        this.shiftStart = shiftStart;
    }

    public LocalTime getShiftEnd() {
        return shiftEnd;
    }

    public void setShiftEnd(LocalTime shiftEnd) {
        this.shiftEnd = shiftEnd;
    }

    public float getShiftSalary() {
        return shiftSalary;
    }

    public void setShiftSalary(float shiftSalary) {
        this.shiftSalary = shiftSalary;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
