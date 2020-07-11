/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.Random;
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
        
        //產生亂數 1~100任意整數
        int random = new Random().nextInt(100) + 1;
        int min = 1;
        int max = 100;
        int keyin;
        do{
            System.out.printf("請猜 %d ~ %d：", min, max);
            keyin = scanner.nextInt();
            if(keyin == random){
                System.out.println("猜中!!");
            }else{
                if(keyin > random){
                    max = keyin;
                }else{
                    min = keyin;
                }
            }
        }while(keyin != random);
        
    }
    
}
