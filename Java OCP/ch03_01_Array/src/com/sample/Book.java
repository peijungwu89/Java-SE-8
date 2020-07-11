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
public class Book {
    //欄位
    String name;
    int price;
    
    //建構子
    public Book(String name, int price){
        //指定欄位的值等於參數
        //使用 this(這個物件)
        this.name = name;
        this.price = price;
    }
}
