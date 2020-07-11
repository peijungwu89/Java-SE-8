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
public interface MyInterface {
    //欄位：常數
    //private int a;
    //private int b = 10;
    //int c;
    int d = 40;         //public static final int d = 40;
    public int e = 50;  //public static final int e = 50;    
    
    //沒有建構子
    
    //沒有具體方法
//    public void method1(){
//        
//    }
    
    //抽象方法
    public abstract void method2();
    void methos3(); //public abstract void methos3();
    
    //--------------------------------------
    //Java SE 8 後新增
    //default 方法
    public default void method4(){
        System.out.println("default method4()...");
    }
    
    //static 方法
    public static void method5(){
        System.out.println("static method5()...");
    }
}
