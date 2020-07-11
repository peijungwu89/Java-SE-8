/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.Random;

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
        int[] lotto = new int[6];
        boolean boo;
        do {
            boo = false;
            for (int i = 0; i < lotto.length; i++) {
                lotto[i] = new Random().nextInt(49) + 1; //1~49
            }

            outer:
            for (int i = 0; i < 5; i++) {
                for (int j = i + 1; j < 6; j++) {
                    //檢查重複
                    if (lotto[i] == lotto[j]) {
                        System.out.printf("%02d -> 索引位置 [%d] 與 [%d] 相同%n", lotto[j], i, j);
                        boo = true;
                        break outer;
                    }
                    
                    //檢查大小
                    if(lotto[i] > lotto[j]){
                        int temp = lotto[i];
                        lotto[i] = lotto[j];
                        lotto[j] = temp;
                    }                 
                 }
            }
            System.out.println("============");
        } while (boo);

        for (int i : lotto) {
            System.out.printf("%02d | ", i);
        }
        System.out.println();

    }

}
