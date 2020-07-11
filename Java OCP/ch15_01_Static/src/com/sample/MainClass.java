/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import static java.lang.Math.*;

/**
 *
 * @author student
 */
public class MainClass {
    //建立類別成員
    public static int count = 0;
    private static final boolean[] switches = new boolean[5];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //呼叫類別成員：類別名稱.類別成員
        System.out.println("int 最大值：" + Integer.MAX_VALUE);
        System.out.println(Integer.parseInt("123") * 100);
        System.out.println("PI：" + PI);
        System.out.println("2 ^ 5 = " + pow(2, 5));
        System.out.println("-------------------");
        System.out.println("main() count = " + ++count);
        System.out.println("-------------------");
        
        switches[1] = false;
        switches[4] = false;
        
        for(boolean boo : switches){
            System.out.printf("%b | ", boo);
        }
        System.out.println("\n-------------------");
        
        User user1 = new User();
        User user2 = new User("Lisa");
        
        System.out.println("-------------------");
        
        int a = 1;
        
        {
            System.out.println("1. a = " + a);
            //int a = 2;
            int b = 2;
            System.out.println("2. b = " + b);
        }
        int b = 3;
        System.out.println("3. b = " + b);
        
    }
    
    static{
        System.out.println("static{} count = " + ++count);
        for(int i=0; i<switches.length; i++){
            switches[i] = true;
        }
    }
    
}
