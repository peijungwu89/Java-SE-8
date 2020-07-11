/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class Book {
    
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + price + "]";
    }
    
    public static List<Book> createBookList(){
        List<Book> list = new ArrayList<>();
        list.add(new Book("Java SE 8", 800));
        list.add(new Book("Python 3.8", 600));
        list.add(new Book("Android 9", 750));
        list.add(new Book("MySQL", 600));
        list.add(new Book("Java SE 11", 800));
        return list;
    }
    
}
