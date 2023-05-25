/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class ProductModel {
    private int productID;
    private float price;
    private int quantity;
    private int soldQuantity;
    private int defectedQuantity;
    private String imagePath;
    private String description;
    private Date EXP;
    private Date MFG;
    private int cateID;
    private int status;

    public ProductModel(int productID, float price, int quantity, int soldQuantity, int defectedQuantity, String imagePath, String description, Date EXP, Date MFG, int cateID, int status) {
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
        this.soldQuantity = soldQuantity;
        this.defectedQuantity = defectedQuantity;
        this.imagePath = imagePath;
        this.description = description;
        this.EXP = EXP;
        this.MFG = MFG;
        this.cateID = cateID;
        this.status = status;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public int getDefectedQuantity() {
        return defectedQuantity;
    }

    public void setDefectedQuantity(int defectedQuantity) {
        this.defectedQuantity = defectedQuantity;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEXP() {
        return EXP;
    }

    public void setEXP(Date EXP) {
        this.EXP = EXP;
    }

    public Date getMFG() {
        return MFG;
    }

    public void setMFG(Date MFG) {
        this.MFG = MFG;
    }

    public int getCateID() {
        return cateID;
    }

    public void setCateID(int cateID) {
        this.cateID = cateID;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
