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
        Book book1 = new Book();
        System.out.printf("book1[%d, %s, %.2f, %s]%n", book1.getId(), book1.getName(), book1.getPrice(), book1.getLocalDate());
        System.out.println("------");
        //物件建立後使用 setXXX() 設值
        book1.setId(5);
        book1.setName("Java SE 8");
        book1.setPrice(800.0);
        System.out.printf("book1[%d, %s, %.2f, %s]%n", book1.getId(), book1.getName(), book1.getPrice(), book1.getLocalDate());
        System.out.println("------");
        
        Book book2 = new Book(6, "Python 3.8", 700.0);
        System.out.printf("book2[%d, %s, %.2f, %s]%n", book2.getId(), book2.getName(), book2.getPrice(), book2.getLocalDate());
        System.out.println("------");
        
        
    }
    
}
