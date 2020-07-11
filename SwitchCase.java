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
        System.out.print("輸入月份(1~12)：");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("%d 月有31天%n", month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("%d 月有30天%n", month);
                break;
            case 2:
                System.out.printf("%d 月有28天%n", month);
                break;
            default:    
                System.out.println("輸入錯誤!");
        }
        
        System.out.println("結束!");
    }

}
