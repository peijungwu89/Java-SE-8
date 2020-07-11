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
        sum(10, 20);
        sum(1, 3, 5);
        sum(3.0, 5);
        sum(10, 2.5);
    }
    private static void sum(int i, double d) {
        System.out.println(i + d);
    }    
    
//    public double sum(int i, double d){
//        return i + d;
//    }   

    private static void sum(double d, int i) {
        System.out.println(d + i);
    }
    
    private static void sum(int i, int i0) {
        System.out.println(i + i0);
    }

    private static void sum(int i, int i0, int i1) {
        System.out.println(i + i0 + i1);
    }

    

    
    
}
