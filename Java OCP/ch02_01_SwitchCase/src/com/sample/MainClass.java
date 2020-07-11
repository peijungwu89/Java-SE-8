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
        System.out.print("輸入 Apple | Kiwi | Orange：");
        String keyin = scanner.next().toLowerCase();
        
        switch(keyin){
            case "apple":
                System.out.println("蘋果");
                break;
            case "kiwi":
                System.out.println("奇異果");
                break;
            case "orange":
                System.out.println("柳橙");
                break;
            default:
                System.out.println("查無此商品!");
        }
        
    }
    
}
