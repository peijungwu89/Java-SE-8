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
        
        System.out.print("輸入成績(0~100)：");
        int score = scanner.nextInt();
        
        if(score>=0 && score<=100){
            
            String result = "";
//            if(score >= 60){
//                result = "及格";
//            }else{
//                result = "不及格";
//            }   
            
//            //精簡 if-else
//            if(score >= 60)
//                result = "及格";
//            else
//                result = "不及格";

            //精簡 if-else 
//            if(score >= 60) result = "及格";
//            else result = "不及格";

            //三元運算子   判別式 ? 成立 : 不成立
            result = score >= 60 ? "及格" : "不及格";
            
            char level;
            if(score >= 90){
                level = 'A';
            }else if(score >= 80){
                level = 'B';
            }else if(score >= 70){
                level = 'C';
            }else if(score >= 60){
                level = 'D';
            }else{
                level = 'F';
            }

            System.out.printf("成績：%d，%s，等級：%c%n", score, result, level);
            
        }else{
            System.out.println("成績輸入錯誤!");
        }
        
        System.out.println("--------------------------------");
        
        System.out.print("輸入西元年：");
        int year = scanner.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.printf("%d 是閏年%n", year);
        }else{
            System.out.printf("%d 不是閏年%n", year);
        }
        
       
        System.out.println("結束!");
        
    }
    
}
