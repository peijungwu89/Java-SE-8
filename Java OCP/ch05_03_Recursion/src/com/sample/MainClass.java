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
        doTest(10);
        System.out.println("\n-------------------------");
    }

    private static void doTest(int i) {
        System.out.printf("%3d", i);
        if(i == 1){
            return;
        }else{
            doTest(i-1);
        }
        System.out.printf("%3d", i);
    }
    
}
