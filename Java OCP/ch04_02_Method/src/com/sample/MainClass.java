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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total = 0;
        for(int i=1; i<=50; i++){
            total += i;
        }
        System.out.println("1+...+50=" + total);
        
        total = 0;
        for(int i=1; i<=100; i++){
            total += i;
        }
        System.out.println("1+...+100=" + total);
        
        total = 0;
        for(int i=1; i<=200; i++){
            total += i;
        }
        System.out.println("1+...+200=" + total);
        
        System.out.println("-------------");
        
        //呼叫方法
        total_1(50);
        total_1(100);
        total_1(200);        
        System.out.println("-------------");
        
        total = total_2(50);
        System.out.println("1+...+50=" + total);
        System.out.println("1+...+75=" + total_2(75));
        
    }
    
    //建立類別成員方法有回傳值
    private static int total_2(int max){
        int total = 0;
        for(int i=1; i<=max; i++){
            total += i;
        }
        return total;
    }    
    
    
    //建立類別成員方法無回傳值
    private static void total_1(int max){
        int total = 0;
        for(int i=1; i<=max; i++){
            total += i;
        }
        System.out.println("1+...+" + max + "=" + total);
    }
    
}
