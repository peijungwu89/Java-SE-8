/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

/**
 *
 * @author student
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //建立物件
        //語法：類別型別 參考名稱 = new 建構子();
        Account user1 = new Account();
        
        //物件操作
        //語法：參考名稱.物件成員
        user1.name = "Amy";
        user1.balance = 500;
        
        System.out.println("user1：\n" + user1.info());
        System.out.println("----------------");
        
        Account user2 = new Account();
        user2.name = "Jackie";
        user2.balance = 2000;
        System.out.println("user2：\n" + user2.info());
        
        System.out.println("--------------");
        Account user3 = user2;
        
        user3.balance = 5000;
        
        System.out.println("user3：\n" + user3.info());
        System.out.println("user2：\n" + user2.info());
        
        System.out.println("--------------");
        
        user1 = user3;
        System.out.println("user1：\n" + user1.info());
        System.out.println("----------------");
        
        user2 = null;
        user2.name = "Tom"; //NullPointerException
        
    }
    
}
