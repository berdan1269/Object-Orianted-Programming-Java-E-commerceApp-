/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerceapp;

/**
 *
 * @author Berdan
 */
public class Orders {
    
    private User ordersOwner;
    private Products product;
    private CreditCard card;

    
    public Orders(User ordersOwner , Products product,CreditCard card){
        this.ordersOwner= ordersOwner ;
        this.product = product;
        this.card = card;
        
    }
    
    public void orderCompletion(){ // siparişi tamamlama işlemleri
        if(product.getProductStocks()>0){
            this.product.setProductStocks(this.product.getProductStocks()-1);
            this.card.setBalance(card.getBalance()-this.product.getProductPrice());
            System.out.println(card.getBalance());
            System.out.println(product.getProductStocks());
        }else{
            System.out.println("Bu ürün tükendi.!");
        }
       
    }
    
    
    
    
                                    // getter and setter 
    public User getOrdersOwner() {
        return ordersOwner;
    }

    public void setOrdersOwner(User ordersOwner) {
        this.ordersOwner = ordersOwner;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public CreditCard getCard() {
        return card;
    }

    public void setCard(CreditCard card) {
        this.card = card;
    }



                                    // getter and setter     
}
