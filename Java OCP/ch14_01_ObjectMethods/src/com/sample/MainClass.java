/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.HashSet;

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
        Book book1 = new Book(1, "Java SE 8", 800.0);
        System.out.println("book1：" + book1);
        
        Book book2 = new Book(2, "Python 3.8", 750.0);
        System.out.println("book2：" + book2);
        
        Book book3 = new Book(1, "Java SE 8", 800.0);
        System.out.println("book3：" + book3);
        
        System.out.println("--------------");
        System.out.println("book1 == book3：" + (book1==book3));
        
        System.out.println("--------------");
        System.out.println("book1.equals(book2)：" + book1.equals(book2));
        System.out.println("book2.equals(book3)：" + book2.equals(book3));
        System.out.println("book3.equals(book1)：" + book3.equals(book1));
        
        System.out.println("--------------");
        System.out.println("book1：" + book1.hashCode());
        System.out.println("book2：" + book2.hashCode());
        System.out.println("book3：" + book3.hashCode());
        
        System.out.println("--------------");
        HashSet<Book> set = new HashSet<>();
        System.out.println(set.add(book1));
        System.out.println(set.add(book2));
        System.out.println(set.add(book3));
        System.out.println(set);
        
        
    }
    
}
