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
        String[] names = {"Ned", "Fred", "Jessie", "Alice", "Rick"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        System.out.println("list：" + list);
        
        for(String s : list){
            System.out.printf("%s | ", s.toUpperCase());
        }
        System.out.println("\n--------------");
        System.out.println("list：" + list);
        
        list.replaceAll(s -> s.toUpperCase());
        System.out.println("list：" + list);
        System.out.println("--------------");
        
        //不建議，索引值會改
//        for(int i=0; i<list.size(); i++){
//            String temp = list.get(i);
//            System.out.println(i + ". " + temp);
//            if(temp.length()<5){
//                list.remove(temp);
//            }
//        }
        //list.removeIf(s -> s.length()<5);
        list.removeIf(s -> s.startsWith("A"));
        System.out.println("list：" + list);
    }
    
}

/*
        Lambda運算式
        input -> body
        ------------------------------------------
        input 無參數：                  () ->
        input 一個參數a：               a ->    
        input 多個參數a,b(加型別)：      (int a,int b)->
        input 多個參數a,b(省略型別)：    (a,b)->
        ------------------------------------------
        body 什麼事不做：       -> {}
        body 單行無回傳值：     -> System.out.println(...);
        body 多行無回傳值：     -> {System.out.println(...);
                                 System.out.println(...);
                                 ...}    
        body 單行有回傳值：     -> a+b;
        body 多行有回傳值：     -> {...
                                 ...
                                 return a+b;}
       
*/
