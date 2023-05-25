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
public class UserModel {
    private String username;
    private String password;
    private String fullName;
    private String avatar;
    private String address;
    private String phone;
    private String email;
    private int roleID;
    private int shiftID;
    private int salaryID;
    private int reportID;
    private int checkID;
    private int status;
    private String note;

    public UserModel(String username, String password, String fullName, String avatar, String address, String phone, int roleID, int shiftID, int salaryID, int reportID, int checkID, int status, String note) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.avatar = avatar;
        this.address = address;
        this.phone = phone;
        this.roleID = roleID;
        this.shiftID = shiftID;
        this.salaryID = salaryID;
        this.reportID = reportID;
        this.checkID = checkID;
        this.status = status;
        this.note = note;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public int getShiftID() {
        return shiftID;
    }

    public void setShiftID(int shiftID) {
        this.shiftID = shiftID;
    }

    public int getSalaryID() {
        return salaryID;
    }

    public void setSalaryID(int salaryID) {
        this.salaryID = salaryID;
    }

    public int getReportID() {
        return reportID;
    }

    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    public int getCheckID() {
        return checkID;
    }

    public void setCheckID(int checkID) {
        this.checkID = checkID;
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
