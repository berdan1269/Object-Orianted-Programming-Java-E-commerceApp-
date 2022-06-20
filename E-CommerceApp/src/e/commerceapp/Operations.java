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
public class Operations {
        private ArrayList<User> users = new ArrayList<>();
        private User girisYapmisUser ;

    
    
    public void register(String username,String name,String surname,String password,String email,String adress){
        
        User user = new User(username,name,surname,password,email,adress);
         CreditCard card = new CreditCard(user); //deneme defualt
          card.addBalance(500);// deneme default
        user.addCreditCard(card); // deneme default
       
        users.add(user);
    }
    public boolean login(String username , String password){
        boolean d = false; // başta hiç kullanıcı olmadıgı için true yaparsak kayıtı olmayanda girebilir enbaşta.
        for(int i =0;i<users.size();i++){
            if(users.get(i).getUsername().equals(username) && users.get(i).getPassword().equals(password)){
                girisYapmisUser = users.get(i);
                d =true;
                System.out.println("Tebrikler giriş yaptınız..");
                break;
             
            }
            else{
                System.out.println("Kullanıcı adı veya şifre eşleşmiyor lütfen yeniden deneyiniz.");
                d= false;
            }
        }
        return d;
    }
    
    public void addFavorites(Products p){
       // System.out.println(girisYapmisUser.getEmail());
        girisYapmisUser.addFavorites(p);
      
    }
    
    public void userOrder(Products p){
        girisYapmisUser.userOrder(p);
        
    }
    
    public void seeFavorites(){
        girisYapmisUser.seeFavorites();
    }
    
    public void allCard(){
       
        girisYapmisUser.seeAllCards();
    }
   
    public void yeniCard(int a){
        CreditCard card = new CreditCard(girisYapmisUser);
        card.addBalance(a);
        girisYapmisUser.addCreditCard(card);
    }
    
}
