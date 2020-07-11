/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import com.sample.packagea.ClassA;
import com.sample.packagea.ClassB;
import com.sample.packageb.ClassC;
import com.sample.packageb.ClassD;

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
        ClassA classa = new ClassA();
        classa.show();
        System.out.println("----------");
        
        ClassB classb = new ClassB();
        classb.show();
        System.out.println("----------");
        
        ClassC classc = new ClassC();
        classc.show();
        System.out.println("----------");
        
        ClassD classd = new ClassD();
        classd.show();
        System.out.println("----------");
    }
    
}
