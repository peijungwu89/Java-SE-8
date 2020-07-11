/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author student
 */
public class FibonacciTask extends RecursiveTask<Long>{
    
    private int n;

    public FibonacciTask(int n) {
        this.n = n;
    }

    @Override
    protected Long compute() {
        if(n < 41){
            return fibonacci(n);
        }else{
            ForkJoinTask<Long> task1 = new FibonacciTask(n - 1).fork();
            ForkJoinTask<Long> task2 = new FibonacciTask(n - 2).fork();
            return task1.join() + task2.join();
        }
    }    

    public static long fibonacci(int n){
        if(n < 2){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }


    
}
