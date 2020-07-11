/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.ArrayList;

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
        ArrayList<String> list = new ArrayList<>();
        while(true){
            String temp = "OutOfMemoryError";
            list.add(temp);
            if(list.size() % 1000000 == 0){
                System.out.println("list元素個數：" + list.size()/1000000 + " 百萬筆");
            }
        }
        
    }
    
}
