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
public class CategoryModel {
    private int cateID;
    private String cateName;
    private String décription;

    public CategoryModel(int cateID, String cateName, String décription) {
        this.cateID = cateID;
        this.cateName = cateName;
        this.décription = décription;
    }

    public int getCateID() {
        return cateID;
    }

    public void setCateID(int cateID) {
        this.cateID = cateID;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public String getDécription() {
        return décription;
    }

    public void setDécription(String décription) {
        this.décription = décription;
    }
    
    
}
