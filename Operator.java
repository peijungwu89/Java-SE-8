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
        
        //指定運算 =
        byte a1 = 100; //隱含轉換
        //byte a2 = 128;  //-128~127 //隱含轉換錯誤，編譯失敗
        
        int a3 = 100;
        //byte a4 = a3;     //int to byte 錯誤
        
        //int a5 = a6 = a7;
        //int a5 = a6 = a7 = 5;
        int a5, a6, a7;
        a5 = a6 = a7 = 5;
        
        //算術運算 + - * / %(餘數)
        int b1 = 19;
        //int b2 = 5;
        double b2 = 5.0; 
        System.out.println(b1 + " + " + b2 + " = " + (b1 + b2));
        System.out.println(b1 + " - " + b2 + " = " + (b1 - b2));
        System.out.println(b1 + " * " + b2 + " = " + (b1 * b2));
        System.out.println(b1 + " / " + b2 + " = " + (b1 / b2));
        System.out.println(b1 + " % " + b2 + " = " + (b1 % b2));
        
        System.out.println("-----------------");
        int c1 = 5;
        System.out.printf("1. c1 = %d%n", c1);
        
        c1 = c1 + 1;
        System.out.printf("2. c1 = %d%n", c1);
        
        //指派運算 += -= *= /= %=
        c1 += 1;    //c1 = c1 + 1;
        System.out.printf("3. c1 = %d%n", c1);
        
        int c2 = 3;
        c1 *= c2;  // c1 = c1 * c2;
        System.out.printf("4. c1 = %d, c2 = %d%n", c1, c2);
        
        // ++遞增(固定+1) / --遞減(固定-1)
        ++c1;   //前置遞增
        System.out.printf("5. c1 = %d%n", c1);
        
        c1++;   //後置遞增
        System.out.printf("6. c1 = %d%n", c1);
        
        int c3 = 5;
        int c4 = --c3;
        System.out.printf("c3=%d, c4=%d%n", c3, c4);
        
        int c5 = 5;
        int c6 = c5--;
        System.out.printf("c5=%d, c6=%d%n", c5, c6);
        
        System.out.println("-----------------");
        //關係運算 > >= < <= ==(相等) !=(不相等)  -->  true/false        
        System.out.println(5 > 3);
        System.out.println(5 <= 3);
        System.out.println(5 == 3);
        System.out.println(5 != 3);
        
        //邏輯運算 &&(且) ||(或)  !(反)
        int d1 = 2;
        int d2 = 3;
        int d3 = 4;
        boolean boo = (d1+=2)>(d2+=3) || (d3+=4)>(d2-=2);
        System.out.printf("boo=%b, d1=%d, d2=%d, d3=%d%n", boo, d1, d2, d3);
        
        
        
    }
    
}
