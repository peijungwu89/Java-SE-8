/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        int score = 0;
        
        while(score >= 0){
            System.out.print("輸入成績，輸入負數結束：");
            score = scanner.nextInt();
            if(score >= 0){
                total += score;
            }else{
                System.out.println("total = " + total);                
            }
        }
        System.out.println("結束!");
        
    }
    
}
