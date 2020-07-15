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
        int a = 10;
        double b = a;
        int c = (int)b;
        
        double d = 123.45;
        int e = (int)d;
        System.out.println("e = " + e);
        
        float f = (float)1.23;
        
        int g = 257;
        byte h = (byte)g;
        System.out.println("h = " + h);
        
        short s1 = 1;
        short s2 = 2;
        short s3 = (short)(s1 + s2);
        System.out.println("s3 = " + s3);
        
        
    }
    
}
