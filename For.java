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
        for(int i=1; i<=10; i+=2){
            System.out.printf("%d ", i);
        }
        System.out.println("\n------------------");
        
        int a = 1;
        for(;;){
            if(a<=10){
                System.out.printf("%d ", a);
                a+=2;
            }else{
                break;
            }
        }
        System.out.println("\na=" + a);
        System.out.println("------------------");
        
        int total = 0;
        for(int i=1; i<=50; i++){
            
            if(i % 5 == 0) continue;
            
            System.out.printf("%3d", i);
            total += i;
            if(total >= 300) break;
        }
        System.out.println("\ntotal=" + total + "\n------------------");
        
        for(int i=2; i<=9; i++){
            for(int j=1; j<=9; j++){
                System.out.printf("%dX%d=%2d\t", i, j, i*j);
            }
            System.out.println();
        }
        
        System.out.println("------------------");
        
        for(int i=1; i<=9; i++){
            for(int j=2; j<=9; j++){
                System.out.printf("%dX%d=%2d\t", j, i, i*j);
            }
            System.out.println();
        }
    }
    
}
