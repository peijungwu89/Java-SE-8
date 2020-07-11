/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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
        String bookName_1 = getStringBookName("A02");
        System.out.println("@ bookName_1：" + bookName_1);
        
        if(bookName_1 != null){
            System.out.println("bookName_1：" + bookName_1.toUpperCase());
        }else{
            System.out.println("bookName_1 is null");
        }
        
        System.out.println("---------------------------");
        Optional<String> bookName_2 = getOptionalBookName("B03");
        System.out.println("bookName_2：" + bookName_2);
        //System.out.println("bookName_2：" + bookName_2.get()); //get()只處理非null的資料
        System.out.println("bookName_2：" + bookName_2.orElse("找不到相關書籍!")); //orElse()可以處理null的資料
        
        if(bookName_2.isPresent()){
            System.out.println("bookName_2：" + bookName_2.get());
        }else{
            System.out.println("找不到相關書籍!");
        }
    }
    
    
    private static Optional<String> getOptionalBookName(String key){
        Map<String, String> bookMap = getBookMap();
        //return Optional.of(bookMap.get(key));         //Optional.of() 只處理非null的資料
        return Optional.ofNullable(bookMap.get(key));   //Optional.ofNullable() 可以處理null的資料
    }
    
    private static String getStringBookName(String key){
        Map<String, String> bookMap = getBookMap();
        String bookName = bookMap.get(key);
        System.out.println("# bookName：" + bookName);
        return bookName;
    }
    
    
    
    private static Map<String, String> getBookMap(){
        Map<String, String> bookMap = new HashMap<>();
        bookMap.put("A01", "Java SE 8");
        bookMap.put("B02", "Python 3.8");
        bookMap.put("C03", "Android 9");
        return bookMap;
    } 
    
}
