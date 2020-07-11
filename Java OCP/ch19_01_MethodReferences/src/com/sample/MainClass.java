/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.ArrayList;
import java.util.Arrays;

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
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "Android"));
        System.out.println("list：" + list);
        System.out.println("------------------");
        
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("------------------");
        
        list.forEach(s -> System.out.println(s));
        System.out.println("------------------");
        
        list.forEach(System.out::println);
        System.out.println("------------------");
        
        list.forEach(MainClass::staticPrint);
        System.out.println("\n------------------");
        
        MainClass myClass = new MainClass();
        list.forEach(myClass::instancePrint);
        System.out.println("\n------------------");
        
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
    
    private static void staticPrint(String s){
        System.out.print(s + " ");
    }
    
    private void instancePrint(String s){
        System.out.print(s + " ");
    }
    
}
