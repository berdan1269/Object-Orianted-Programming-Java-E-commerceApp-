/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerceapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Berdan
 */
public class User {
    
    private String username;
    private String name;
    private String surname ;
    private int birthday;
    private String password;

    
    private String email;

   
    private String adress;
    private ArrayList<Products> orders = new ArrayList<Products>();
    private ArrayList<Products> favorites = new  ArrayList<Products>();
    private ArrayList<CreditCard> cards = new ArrayList<CreditCard>();
    
    public User(String username,String name,String surname,String password,String email,String adress){
        System.out.println("Hosgeldiniz...");
        
        this.username = username;
        this.name = name ;
        this.surname =surname;
        this.password = password;
        this.email = email;
        this.adress = adress;
     
        
    }
    
    
    
    public User(String username,String name,String surname,String password,String email,String adress,CreditCard card){
        System.out.println("Hoşgeldiniz..");
        
        this.username = username;
        this.name = name ;
        this.surname =surname;
        this.password = password;
        this.email = email;
        this.adress = adress;
        cards.add(card);
        
    }
    
    public void userOrder(Products product){
          System.out.println("Hangi kredi kartıyla ödeme yapmak istiyorsanız seçiniz..");
        for(int i = 0 ;i<cards.size();i++){
             System.out.println(i+": "+cards.get(i).getCardNumber());
        }
        Scanner input = new Scanner(System.in);
       int kullaniciSecimi = input.nextInt();
       // input.close();
        Orders order = new Orders(this, product, cards.get(kullaniciSecimi));
        order.orderCompletion();
    }
    
    
    
    
    
    public void addCreditCard(CreditCard card){
        if(!cards.contains(card)){
            cards.add(card);

        }else {
            System.out.println("Bu kart zaten kartlarınızda bulunmaktadır..!");
        }
    }
    
    
    public void addFavorites(Products p){ // ürünleri favorilere ekleme
          boolean a  = true;
        if(favorites.size() == 0){
            favorites.add(p);
           
           // seeFavorites(); // görmek için //silinebilir
        }
        else{
              for(int i = 0;i<favorites.size();i++){
            if(!favorites.get(i).getProductName().contains(p.getProductName())){
            a  = true;
            
         }
            else {
            
            a = false;
            break;
                
            }
            
              }
              
              if(a){
                  favorites.add(p);
            System.out.println("Başarıyla favorilere eklendi.");
            // System.out.println("buraya geliyo");
           // seeFavorites(); // görmek için // silinebilir.
              }else{
                  System.out.println("Bu ürün zaten sepetinizde.!");
              }
        
        }
        
    }
    
    public void seeFavorites(){
        for(int i = 0 ; i<favorites.size();i++){
            System.out.println(favorites.get(i).getProductName());
        }
    }
    
    //public void giveOrder() 
    
    public void seeAllCards(){
    for(int i =0;i<cards.size();i++){
        System.out.println(cards.get(i).getCardNumber());
    }
}
    
    
    
    
                                          //setter getter 
    
    public String getUsername (){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username ;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name ){
        this.name = name;
    }
    public String getSurname(){
        return this.surname ;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getBirthday(){
        return this.birthday;
    }
    public void setBirthday(int birthday){
        this.birthday=birthday;
    }
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public ArrayList<Products> getOrders() {
        return this.orders;
    }

    public void setOrders(ArrayList<Products> orders) {
        this.orders = orders;
    }

    public ArrayList<Products> getFavorites() {
        return this.favorites;
    }

    public void setFavorites(ArrayList<Products> favorites) {
        this.favorites = favorites;
    }

    public ArrayList<CreditCard> getCards() {
        return this.cards;
    }

    public void setCards(ArrayList<CreditCard> cards) {
        this.cards = cards;
    }
    
    
    
                                                     //setter getter finish
}
