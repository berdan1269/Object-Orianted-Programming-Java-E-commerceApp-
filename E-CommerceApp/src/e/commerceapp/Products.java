/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerceapp;

import java.util.ArrayList;

/**
 *
 * @author Berdan
 */
public class Products {
    private String productName; 
    private ArrayList<String> productColor = new ArrayList<>();
    private String productCatagories;

   
    private int productStocks;
    private int productPrice;

   
    private int productWeight;
    private String productDescription;

    
   
    public Products (String productName , String productColor, String productCatagories, int productStocks,int productPrice,int productWeight,String productDescription){
        
        this.productName =productName;
        this.productColor.add(productColor);
        this.productCatagories = productCatagories;
        this.productStocks=productStocks;
        this.productWeight = productWeight;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }
    
    public void addColor(String color){
        for(int i= 0;i<productColor.size();i++){
            if(!productColor.get(i).equals(color)){
                productColor.add(color);
            }else{
                System.out.println("Bu renk zaten bulunmaktadır.");
            }
        }
        
        
    }
    
    public void addOnStocks(int add){           //stok sayısını ekleme yapabilmek için 
        this.productStocks +=add;
    } 
    

    
    
    
    
                                                 // Setter and getter .. 
    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    
     public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
    
     public String getProductCatagories() {
        return this.productCatagories;
    }

    public void setProductCatagories(String productCatagories) {
        this.productCatagories = productCatagories;
    }

    public ArrayList<String> getProductColor() {
        return productColor;
    }

    public void setProductColor(ArrayList<String> productColor) {
        this.productColor = productColor;
    }

    public int getProductStocks() {
        return productStocks;
    }

    public void setProductStocks(int productStocks) {
        this.productStocks = productStocks;
    }

    public int getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
   
                                          // Setter and getter finish ..
    
    
    
}
