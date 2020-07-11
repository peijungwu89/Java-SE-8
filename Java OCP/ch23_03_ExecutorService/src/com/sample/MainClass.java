/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        ExecutorService es = Executors.newFixedThreadPool(3);
        for(int i=1; i<=15; i++){
            int NUM = i;
            es.execute(new Runnable(){
                @Override
                public void run() {
                    int time = new Random().nextInt(1234);
                    System.out.println(Thread.currentThread().getName() + "\t" + NUM + "\t" + time);
                    try {
                        Thread.sleep(time);
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
            });
        }
        es.shutdown();
    }
    
}
