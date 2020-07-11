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
        average(10, 20);
        average(10, 20, 30);
        average(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        
        
    }

    private static void average(int... nums) {
        int total = 0;
        for(int n : nums){
            total += n;
        }
        System.out.printf("total：%d, average：%d%n", total, total/nums.length);
        
    }
    
    //----------------------------------------
    // void test1(int... i, double... d){}
    void test2(String s, int i, double... d){}
    //void test3(String... s, String s1){}
    void test4(double d, double d2, double... d3){}
    

    
}
