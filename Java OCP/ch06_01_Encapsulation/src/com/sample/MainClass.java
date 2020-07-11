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
        System.out.print("輸入西元年-月-日(2020-5-11)：");
        String inputDate = scanner.nextLine();
        
        CheckDate cd = new CheckDate();
        cd.setInputDate(inputDate);
    }
    
}
