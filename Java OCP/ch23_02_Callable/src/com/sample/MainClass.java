/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *
 * @author student
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // TODO code application logic here
        FutureTask<Set> task1 = new FutureTask<>(new Lotto());
        FutureTask<Set> task2 = new FutureTask<>(new Lotto());
        Thread t1 = new Thread(task1, "T1");
        Thread t2 = new Thread(task2, "T2");
        t1.start();
        t2.start();
        System.out.println("T1：" + task1.get());
        System.out.println("T2：" + task2.get());
        System.out.println("完成!");
    }
    
}

//-----------------------------------------
class Lotto implements Callable<Set>{

    @Override
    public Set call() throws Exception {
        Set<Integer> lotto = new TreeSet<>();
        while(lotto.size() < 6){
            Thread.sleep(new Random().nextInt(1234));
            int random = new Random().nextInt(49) + 1;
            System.out.printf("%s\t%02d\t%b%n", Thread.currentThread().getName(), random, lotto.add(random));
        }
        return lotto;        
    }   
    
}
