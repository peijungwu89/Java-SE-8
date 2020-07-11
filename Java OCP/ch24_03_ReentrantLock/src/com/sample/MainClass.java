/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
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
        es.execute(new Lotto("Amy"));
        es.execute(new Lotto("Lisa"));
        es.execute(new Lotto("Jackie"));
        es.shutdown();
    }
    
}

class Lotto implements Runnable{
    
    private String name;
    private static final ReentrantLock reentrantLock = new ReentrantLock();

    public Lotto(String name) {
        this.name = name;
    }   

    @Override
    public void run() {
        try {
            reentrantLock.lock();
            Set<Integer> set = new TreeSet<>();
            while(set.size() < 6){            
                Thread.sleep(new Random().nextInt(1234));
                int random = new Random().nextInt(49)+1;
                System.out.println(name + "\t" + random + "\t" + set.add(random));
            }     
        } catch (InterruptedException ex) {
             System.out.println(ex);
        } finally{
            reentrantLock.unlock();
        }
       
    
    }
    
}
