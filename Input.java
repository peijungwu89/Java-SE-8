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
        
        System.out.print("輸入西元年：");
        int year = scanner.nextInt();
        System.out.printf("西元 %d 年是民國 %d 年%n",year, year-1911);
        
        System.out.print("輸入名字 年齡 身高(用空白隔開)：");
        
        String name = scanner.next();
        int age = scanner.nextInt();
        double height = scanner.nextDouble();

        System.out.println("我是 " + name + "，今年 " + age + " 歲，身高 " + height +" 公分");
        
        scanner.nextLine(); //清空 scanner
        
        System.out.print("中翻英 這是一本書。 ==> ");
        String input = scanner.nextLine();
        System.out.println("## " + input);
        
    }
    
}
