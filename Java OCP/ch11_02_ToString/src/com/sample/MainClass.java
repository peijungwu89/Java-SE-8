/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

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
        Date date = new Date();
        System.out.println("date：" + date);
        System.out.println("date：" + date.toString());
        
        ArrayList<String> list = new ArrayList(Arrays.asList("a", "b", "c"));
        System.out.println("list：" + list);
        System.out.println("list：" + list.toString());
        
        StringBuilder sb = new StringBuilder();
        sb.append("Java ");
        sb.append("SE ");
        sb.append(8);
        System.out.println("sb：" + sb);
        System.out.println("sb：" + sb.toString());
        String s = sb.toString();
        System.out.println("s：" + s);
        
        Book book = new Book("Java SE 8", 800);
        System.out.println("book：" + book);
        System.out.println("book：" + book.toString());
        
    }
    
}
