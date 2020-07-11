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
        int a = 10;
        int b = a;
        System.out.printf("1. a=%d, b=%d%n", a, b);
        a++;
        System.out.printf("2. a=%d, b=%d%n", a, b);
        
        doTest(a);
        System.out.printf("5. a=%d%n", a);
        
        Book book = new Book();
        book.name = "Java SE 8";
        book.price = 800;
        System.out.printf("6. %s : %d%n", book.name, book.price);
        
        doTest(book);
        System.out.printf("9. %s : %d%n", book.name, book.price);
        
        String str = "hello";
        System.out.printf("A. str = %s%n", str);
        doTest(str);
        System.out.printf("D. str = %s%n", str);
        
    }
    
    private static void doTest(String str) {
        System.out.printf("B. str = %s%n", str);
        str += "!";
        System.out.printf("C. str = %s%n", str);
    }
    
    private static void doTest(Book book){
        System.out.printf("7. %s : %d%n", book.name, book.price);
        book.price = 900;
        System.out.printf("8. %s : %d%n", book.name, book.price);
    }
    
    private static void doTest(int a){
        System.out.printf("3. a=%d%n", a);
        a++;
        System.out.printf("4. a=%d%n", a);
    }

    
    
}
