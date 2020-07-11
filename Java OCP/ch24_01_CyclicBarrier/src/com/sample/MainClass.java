/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
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
        Test test = new Test();
        ExecutorService es = Executors.newFixedThreadPool(5);
        for(int i=1; i<=15; i++){
            es.execute(test);
        }
        es.shutdown();
    }
    
}

class Test implements Runnable{

    private static final AtomicInteger ai = new AtomicInteger();
    private final CyclicBarrier barrier = new CyclicBarrier(5);
    
    @Override
    public void run() {
        
        try {
            Thread.sleep(new Random().nextInt(500));
            System.out.println(Thread.currentThread().getName() + "\tai=" + ai.getAndIncrement() + " 到公司");
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException ex) {
            System.out.println(ex);
        } 

        System.out.println(Thread.currentThread().getName() + " 出發!");
    }
    
}
