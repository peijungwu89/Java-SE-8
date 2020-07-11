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
        Book book1 = new Book("Java SE 8");
        book1.info();
        System.out.println("-------------------------------");
        Book book2 = new Book("Java SE 11", 700);//53
        book2.info();//60
    }    
}
//----------------------------------------
class SuperBook{
    private String name;
    
    public SuperBook(String name){//31
        System.out.println("SuperBook(String name)...");//32
        this.name = name;//45
    }
    
    public void info(){//36
        System.out.println("SuperBook info() name：" + name);//62
    }
}

class Book extends SuperBook{    
    private int price;
    
    public Book(String name){    //44    
        super(name);//30
        System.out.println("連線資料庫...");//46
        System.out.println("驗證帳號...");//47
        System.out.println("程式1...");//48
        System.out.println("程式2...");//49
        System.out.println("程式3...");//50
        System.out.println("Book(String name)...");//55
    }
    
    public Book(String name, int price){ //54
        this(name);//43
        System.out.println("Book(String name, int price)...");//56
        this.price = price;//23
    }
    
    @Override
    public void info(){//61
        super.info();//35
        System.out.println("Book info() price：" + price);//24
    }
}
