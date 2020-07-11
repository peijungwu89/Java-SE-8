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
        System.out.print("第一行，print()資料顯示完成不換行。");
        System.out.println("\n第二行，println()資料顯示完成換行。第三行，使用\\n換行");
        
        System.out.println("c:\\workspace\\java.txt");
        System.out.println("目前學習\"Java\"程式");
        System.out.println("字元符號：" + "'A'");
        System.out.println("字元符號：" + "\'A\'");
        
        System.out.println("12345678123456781234567812345678");
        System.out.println("Jackie\t95\t98\t88");
        System.out.println("Amy\t99\t98\t97");
        System.out.println("Lisa\t100\t80\t96");
        
        System.out.println("----------------------");
        
        System.out.println(2 + 4 + 6);      //12
        System.out.println("2" + 4 + 6);    //"246"
        System.out.println("2" + (4 + 6));  //"210"
        
        
        String name = "Lisa";
        int age = 12;
        double height = 135.7;
        
        System.out.println("我是 Lisa，今年 10 歲，身高 135.7 公分");
        System.out.println("我是 " + name + "，今年 " + age + " 歲，身高 " + height +" 公分");
        
        //printf(String format, Object ... args)
        //%s 字串     %c 字元     %b 布林值
        //%d 十進位整數
        //%f 浮點數
        //%n 換行
        System.out.printf("我是 %s，今年 %d 歲，身高 %f 公分%n", name, age, height);
        
        System.out.println("-------------------------");
        System.out.printf("|%10d|%n", 654321);
        System.out.printf("|%10d|%n", 54321);
        System.out.printf("|%10d|%n", 4321);
        System.out.printf("|%10d|%n", 321);
        System.out.printf("|%10d|%n", 21);
        System.out.printf("|%10d|%n", 1);
        System.out.printf("|%10d|%n", -123);
        System.out.println();
        System.out.printf("|%-10d|%n", 654321);
        System.out.printf("|%-10d|%n", 54321);
        System.out.printf("|%-10d|%n", 4321);
        System.out.printf("|%-10d|%n", 321);
        System.out.printf("|%-10d|%n", 21);
        System.out.printf("|%-10d|%n", 1);
        System.out.printf("|%-10d|%n", -123);
        System.out.println();
        System.out.printf("|%+10d|%n", 654321);
        System.out.printf("|%+10d|%n", 54321);
        System.out.printf("|%+10d|%n", 4321);
        System.out.printf("|%+10d|%n", 321);
        System.out.printf("|%+10d|%n", 21);
        System.out.printf("|%+10d|%n", 1);
        System.out.printf("|%+10d|%n", -123);
        System.out.println();
        System.out.printf("|%-+10d|%n", 654321);
        System.out.printf("|%-+10d|%n", 54321);
        System.out.printf("|%-+10d|%n", 4321);
        System.out.printf("|%-+10d|%n", 321);
        System.out.printf("|%-+10d|%n", 21);
        System.out.printf("|%-+10d|%n", 1);
        System.out.printf("|%-+10d|%n", -123);
        System.out.println();
        char type = 'P';
        System.out.printf("%c%04d%n", type, 5);
        System.out.printf("%c%04d%n", type, 26);
        System.out.printf("%c%04d%n", type, 135);
        System.out.printf("%c%04d%n", type, 1234);
        System.out.println();
        
        System.out.printf("%6.2f%n", 123.456789);
        System.out.printf("%6.2f%n", 12.3456789);
        System.out.printf("%6.2f%n", 1.23456789);
    }
    
}
