/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
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
        for(int i=0; i<20; i++){
            new Thread(new Test(), String.format("T%02d", i)).start();
        }
    }
    
}


//----------------------------------
class Test implements Runnable{
    private static int i = -1;
    private static final AtomicInteger ai = new AtomicInteger();

    @Override
    public void run() {
        try {
            Thread.sleep(new Random().nextInt(100));
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println(Thread.currentThread().getName() + "\ti=" + ++i + "\tai=" + ai.getAndIncrement());
    }
    
}
