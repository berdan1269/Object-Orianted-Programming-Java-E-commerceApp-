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
public class ECommerceApp {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

  //  public ArrayList<User> userss = new ArrayList<User>();
   
    Operations operations = new Operations();
        boolean kontrol = true;
         Scanner input = new Scanner(System.in);
     
         //ürünleri yarattık.
            Products p1 = new Products("Yazılı Tshirt", "Kırmızı", "Tshirt", 20, 30, 5, "İnce tshirt");
            Products p2 = new Products("Yazısız Tshirt", "Yeşil", "Tshirt", 20, 30, 5, "Kalın tshirt");
            Products p3 = new Products("Mavi Pantalon", "Mavi", "Pantolon", 90, 25, 10 , "Yama izli Pantalon");
            Products p4 = new Products("Desenli Şort", "Gri", "Şort", 60, 15, 5, "Yazlık desenli erkek şort");
            Products p5 = new Products("Düz Şort ", "Siyah", "Şort", 50,26, 10, "Yazlık desensiz düz erkek şort");
            Products p6 = new Products("Yazılı Tshirt", "Kırmızı", "Tshirt", 20, 30, 5, "İnce tshirt");
        
        
    
        
        while (kontrol){
             System.out.println("Berdan.com'a hoşgeldiniz.Lütfen giriş yapmak için 1 i kayıt olmak için 2 yi seçiniz.");
            
            int kullaniciSecimi = input.nextInt(); 
             if(kullaniciSecimi == 1){
                 System.out.println("Lütfen kullanıcı adınızı giriniz");
                 String kullaniciAdi = input.next();
                 System.out.println("Lütfen şifrenizi giriniz.");
                String sifre = input.next();
                boolean control = operations.login(kullaniciAdi, sifre);
                if(control){
                    System.out.println("Yönlendiriliyorsunuz..");
                    kontrol = false;
                }else{
                    System.out.println("Kullanıcı adı ve şifre eşleşmiyor.");
                }
               
             }
             if(kullaniciSecimi == 2){
                 System.out.println("Lütfen kullanıcı isminizi giriniz");
                 String kullaniciIsmi = input.next();
                 System.out.println("Lütfen isminizi giriniz  ");
                 String isim = input.next();
                 System.out.println("Lütfen soyadınızı giriniz ");
                 String soyad = input.next();
                 System.out.println("Lütfen şifrenizi giriniz ");
                 String sifre = input.next();
                 System.out.println("Lütfen email adresinizi giriniz.");
                 String email = input.next();
                 System.out.println("Lütfen ev adresinizi giriniz.");
                 String adres = input.next();
                  
                 operations.register(kullaniciIsmi, isim, soyad, sifre, email, adres);
                 System.out.println("Tebrikler başarıyla kayıt oldunuz.");
         
             }
        }
        
        
        
        kontrol = true;
        while(kontrol){
            System.out.println("Berdan.com'un ürünlerini aşağıda görüp satın alabilirsiniz");
            
            System.out.println("1 : Ürünler için 1 yazınız.");
           
            System.out.println("2 : Favorilerinizi görmek için 2 yazınız. ");
            System.out.println("3 : Kartlarınızı görmek için 3 yazınız.");
            System.out.println("9 : Yeni kart çıkartmak için şubeye bağlanın. 9 yazınız.");
            
            int kullaniciSecimi = input.nextInt();
            switch(kullaniciSecimi){
                case 1 : 
                     System.out.println("1 : "+p1.getProductName());
                     System.out.println("2 : "+p2.getProductName());
                     System.out.println("3 : "+p3.getProductName());
                     System.out.println("4 : "+p4.getProductName());
                     System.out.println("5 : "+p5.getProductName());
                     System.out.println("6 : "+p6.getProductName());
                     kullaniciSecimi = input.nextInt();
                    switch(kullaniciSecimi){
                        case 1:
                            System.out.println("Rengi: "+p1.getProductColor()+" Açıklaması: "+p1.getProductDescription());
                            System.out.println("Satın almak için 1 , Favorilere eklemek için 2 ye tıklayınız.Geri dönmek için 0 yazınız.");
                            kullaniciSecimi = input.nextInt();
                            
                            switch(kullaniciSecimi){
                                 case 0 :
                                     break;
                                 case 1:
                                 operations.userOrder(p1);
                                    break;
                                 case 2:
                                    operations.addFavorites(p1);
                                     break;
                    }
                    break;
                    
                        case 2:
                        System.out.println("Rengi: "+p2.getProductColor()+" Açıklaması: "+p2.getProductDescription()); 
                        System.out.println("Satın almak için 1 , Favorilere eklemek için 2 ye tıklayınız.Geri dönmek için 0 yazınız.");
                        kullaniciSecimi = input.nextInt();
                            switch(kullaniciSecimi){
                                case 0 :
                            break;
                                case 1:
                                 operations.userOrder(p2);
                            break;
                                case 2:
                                operations.addFavorites(p2);
                             break;
                    }
                    break;
                        case 3:
                         System.out.println("Rengi: "+p3.getProductColor()+" Açıklaması: "+p3.getProductDescription());   
                         System.out.println("Satın almak için 1 , Favorilere eklemek için 2 ye tıklayınız.Geri dönmek için 0 yazınız.");
                        kullaniciSecimi = input.nextInt();
                            switch(kullaniciSecimi){
                                case 0 :
                            break;
                                case 1:
                                 operations.userOrder(p3);
                            break;
                                case 2:
                                operations.addFavorites(p3);
                             break;
                    }
                    break;
                        case 4:
                            System.out.println("Rengi: "+p4.getProductColor()+" Açıklaması: "+p4.getProductDescription());  
                             System.out.println("Satın almak için 1 , Favorilere eklemek için 2 ye tıklayınız.Geri dönmek için 0 yazınız.");
                            kullaniciSecimi = input.nextInt();
                            switch(kullaniciSecimi){
                                case 0 :
                            break;
                                case 1:
                                operations.userOrder(p4);
                            break;
                                case 2:
                                operations.addFavorites(p4);
                           break;
                    }
                    break;
                        case 5:
                            System.out.println("Rengi: "+p5.getProductColor()+" Açıklaması: "+p5.getProductDescription());  
                            System.out.println("Satın almak için 1 , Favorilere eklemek için 2 ye tıklayınız.Geri dönmek için 0 yazınız.");
                            kullaniciSecimi = input.nextInt();
                                switch(kullaniciSecimi){
                                case 0 :
                            break;
                                case 1:
                                operations.userOrder(p5);
                            break;
                                case 2:
                                operations.addFavorites(p5);
                           break;
                    }
                    break;
                        case 6:
                            System.out.println("Rengi: "+p6.getProductColor()+" Açıklaması: "+p6.getProductDescription());    
                            System.out.println("Satın almak için 1 , Favorilere eklemek için 2 ye tıklayınız.Geri dönmek için 0 yazınız.");
                            kullaniciSecimi = input.nextInt();
                            switch(kullaniciSecimi){
                                case 0 :
                            break;
                                case 1:
                                operations.userOrder(p6);
                            break;
                                case 2:
                                 operations.addFavorites(p6);
                           break;
                    }
                    break;
                    }
               break;
                    
            case 2:
                operations.seeFavorites();
                    break;
            
            case 3:  
                System.out.println("Kartlarınız sıralanıcaktır ..");
                operations.allCard();
                
                break;
                
            case 9:
                System.out.println("Berdan banka yönlendiriliyorsunuz.");
                System.out.println("Yönlendiriliyorsunuz..");
                System.out.println("Kartınız oluşturuluyor..");
                System.out.println("Lütfen eklemek istediğiniz bakiyeyi yazınız.");
                kullaniciSecimi = input.nextInt();
                operations.yeniCard(kullaniciSecimi);
                    break;
                    
            //case 5:
              //  p1.addColor("Yeşil");     deneme.
                //p1.addColor("Kırmızı");
                //break;
                
            }
            
        }
        
        
        
        
        
  
    
       
  
    
        
      
     
        
    
      
     
        
    }
    
    
}

