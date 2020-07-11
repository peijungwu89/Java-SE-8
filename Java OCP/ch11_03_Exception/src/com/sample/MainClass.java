/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.InputMismatchException;
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
        try {
            System.out.print("分子 a=");
            int a = scanner.nextInt();
            System.out.print("分母 b=");
            int b = scanner.nextInt();
            int c = cal(a, b);
            System.out.printf("%d / %d = %d%n", a, b, c);
        } catch (InputMismatchException ex) {
            System.out.println("[錯誤]輸入資料型別錯誤!");
        } catch (ArithmeticException ex) {
            System.out.println("事情大條了!發生錯誤：" + ex);
        } finally {
            System.out.println("資料庫關閉!");
        }
        System.out.println("結束!");
    }

    private static int cal(int a, int b) {
        if(b == 0){
            throw new ArithmeticException("分母不可為0!");
        }
        return a / b;
    }

}
