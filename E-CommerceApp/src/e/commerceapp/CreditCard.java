/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e.commerceapp;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Berdan
 */
public class CreditCard {
    
    private ArrayList<Integer> cardNumber = new ArrayList();
    private User owner;
    private ArrayList<Integer> securityNumber = new ArrayList();
    private ArrayList<Integer> expirationDate = new ArrayList();
    private int balance = 0;

 
    
    public CreditCard(User owner){
        Random rand  = new Random();
        for(int i = 0 ;i<16;i++){               //kredikartı numarası oluşturma
            int randomCardNumber = rand.nextInt(10);
            cardNumber.add(randomCardNumber);
        }
        for(int i = 0 ; i < 3 ; i++){
            int randomSecurityNumber = rand.nextInt(10);            //securitynuMBER
            securityNumber.add(randomSecurityNumber);
        }
         int expirationDateDay = (int)(Math.random()*30+1);
         int expirationDateMonth = (int)(Math.random()*12+1);       //expiration date 
         int expirationDateYears = 2025;
       
        expirationDate.add(expirationDateDay);
        expirationDate.add(expirationDateMonth);
        expirationDate.add(expirationDateYears);
        
        System.out.println("Kredi kartınız oluşturuluyor...");
        System.out.println("Kredi kartı numaranız :");
        getAllCardNumber();
        System.out.println("");
        
        System.out.println("Güvenlik numaranız..: ");
        getAllSecurityNumber();
        System.out.println("");
        System.out.println("Kartınızın son kullanma tarihi :"+expirationDate.get(0)+"."+expirationDate.get(1)+"."+expirationDate.get(2));
        System.out.println("Güvenliğiniz ve kartınızın kullanımı için verilen bilgileri unutmayınız.");
    }
    public void getAllCardNumber(){
        for(int i =0;i<this.cardNumber.size();i++){     
            System.out.print(cardNumber.get(i));
        }
    }
    public void getAllSecurityNumber(){
        for(int i = 0 ; i<this.securityNumber.size();i++){
            System.out.print(securityNumber.get(i));
        }
    }
    
    
    public void addBalance(int i ){
        this.balance +=i;
    }
    
   
    
    
                                            //getter and setter 
    public ArrayList<Integer> getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(ArrayList<Integer> cardNumber) {
        this.cardNumber = cardNumber;
    }
    
      public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public ArrayList<Integer> getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(ArrayList<Integer> securityNumber) {
        this.securityNumber = securityNumber;
    }

    public ArrayList<Integer> getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(ArrayList<Integer>expirationDate) {
        this.expirationDate = expirationDate;
    }
    
    
                                            //getter and setter     
}
