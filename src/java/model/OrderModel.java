/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author DELL
 */
public class OrderModel {
    private int orderID;
    private int productID;
    private int payID;
    private int voucherID;
    private int quantityOfItems;
    private String note;
    private int status;
    private LocalDateTime orderTime;
    private int userID;

    public OrderModel(int orderID, int productID, int payID, int voucherID, int quantityOfItems, String note, int status, LocalDateTime orderTime, int userID) {
        this.orderID = orderID;
        this.productID = productID;
        this.payID = payID;
        this.voucherID = voucherID;
        this.quantityOfItems = quantityOfItems;
        this.note = note;
        this.status = status;
        this.orderTime = orderTime;
        this.userID = userID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getPayID() {
        return payID;
    }

    public void setPayID(int payID) {
        this.payID = payID;
    }

    public int getVoucherID() {
        return voucherID;
    }

    public void setVoucherID(int voucherID) {
        this.voucherID = voucherID;
    }

    public int getQuantityOfItems() {
        return quantityOfItems;
    }

    public void setQuantityOfItems(int quantityOfItems) {
        this.quantityOfItems = quantityOfItems;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    
}
