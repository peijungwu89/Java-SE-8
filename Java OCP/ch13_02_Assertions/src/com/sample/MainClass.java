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
        cal(6);
        cal(7);
        cal(8);
        cal(0);
        System.out.println(0 % 3);
        //cal(-7);
        //System.out.println(-7 % 3);
    }

    private static void cal(int i) {
        
        i*= new Random().nextInt(100);        
        assert i>=0 : i+" 小於0!";
        
        //assert (i*= new Random().nextInt(100))>=0 : i+" 小於0!";
        
        if(i % 3 == 0){
            System.out.printf("%d %% 3 = 0%n",  i);
        }else if(i  % 3 == 1){
            System.out.printf("%d %% 3 = 1%n",  i);
        }else{
            System.out.printf("%d %% 3 = 2%n",  i);
        }
    }
    
}
