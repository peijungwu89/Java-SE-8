/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

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
        String temp = "this is a book.";
        //String temp = null;
        
        //Consumer 消費型：有參數、沒有回傳值
        //Consumer<T> 的 accept(T t) 方法接收一個參數，執行後無回傳值
        Optional.ofNullable(temp).ifPresent(s -> System.out.println(s.toUpperCase()));
        
        System.out.println("--------------------");
        
        //Function 功能型：有參數、有回傳值
        //Function<T,R> 的 apply(T t) 方法接收一個參數，執行後回傳指定型態的結果
        Optional<String> opt1 = Optional.ofNullable(temp).map(String::toUpperCase);
        System.out.println(opt1.orElse("is empty"));
        
        System.out.println("--------------------");
        
        //Predicate 診斷型：有參數、有回傳boolean
        //Predicate<T> 的 test(T t) 方法接收一個參數回傳boolean
        Optional<String> opt2 = Optional.ofNullable(temp).filter(s -> s.length()>10);
        System.out.println(opt2);
        System.out.println(opt2.orElse("is empty"));
        
        System.out.println("--------------------");
        
        //Supplier 供應型：沒有參數、有回傳值
        //Supplier<T> 的 get() 方法用來回傳特定的結果，回傳值的型態必須同呼叫的方法的回傳型態
        String temp2 = null;
        //String temp3 = Optional.ofNullable(temp2).orElse("Java SE");
        String temp3 = Optional.ofNullable(temp2).orElseGet(() -> "Java SE");        
        System.out.println("temp3：" + temp3);
        
        System.out.println("--------------------");
        
        //BiConsumer：有2個參數、無回傳值
        //BiConsumer<T,U> 的 accept(T t, U u)傳入2個參數，無回傳值
        Map<String, String> bookMap = new HashMap<>();
        bookMap.put("A01", "Java SE 8");
        bookMap.put("B02", "Python 3.8");
        bookMap.put("C03", "Android 9");
        
        Set<String> keys = bookMap.keySet();
        for(String key : keys){
            System.out.printf("%s\t%s%n", key, bookMap.get(key));
        }
        
        System.out.println("------------");
        bookMap.forEach((k, v) -> System.out.printf("%s\t%s%n",k, v));
        
        
    }
    
}
