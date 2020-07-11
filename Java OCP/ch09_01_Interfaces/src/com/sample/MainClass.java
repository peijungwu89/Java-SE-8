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
        //MyInterface mi = new MyInterface();
        
        MyClass myClass = new MyClass();
        myClass.method2();
        myClass.methos3();
        myClass.method4();
        MyInterface.method5();
    }
    
}
