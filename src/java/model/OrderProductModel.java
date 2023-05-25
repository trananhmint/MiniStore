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
public class OrderProductModel {
    private int orderID;
    private int productID;
    private int quantity;
    private float price;
    private float promotionPrice;
    private int status;

    public OrderProductModel(int orderID, int productID, int quantity, float price, float promotionPrice, int status) {
        this.orderID = orderID;
        this.productID = productID;
        this.quantity = quantity;
        this.price = price;
        this.promotionPrice = promotionPrice;
        this.status = status;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(float promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
