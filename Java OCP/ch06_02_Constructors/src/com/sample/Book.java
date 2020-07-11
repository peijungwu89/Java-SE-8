/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.time.LocalDate;

/**
 *
 * @author student
 */
public class Book {
    
    //欄位(屬性)
    private int id;
    private String name;
    private double price;
    private LocalDate localDate = LocalDate.now();
    
    //建構子：初始化物件，只被執行一次
    //語法：[存取修飾] 類別名稱(參數列){...}
    //無參數建構子
    public Book(){
        System.out.println("Book()...");
    }
    
    //有參數建構子
    public Book(int id, String name, double price){
        System.out.println("Book()...");
        //操作一
        this.id = id;
        //操作二
        setName(name);
        setPrice(price);
    }
    
    //方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
    
    
}
