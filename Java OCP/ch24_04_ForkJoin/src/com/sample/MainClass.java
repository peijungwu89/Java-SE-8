/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        int num = 50;
//        System.out.println("使用遞迴...");
//        Instant t1 = Instant.now();
//        System.out.println("t1：" + t1.toString());
//        System.out.printf("第 %d 項： %d%n", num, FibonacciTask.fibonacci(num));
//        Instant t2 = Instant.now();
//        System.out.println("使用遞迴時間：" + Duration.between(t1, t2).toMillis() + "毫秒");
//        System.out.println("使用ForkJoin...");
//        int processors = Runtime.getRuntime().availableProcessors();
//        System.out.println("processors = " + processors);        
//        Instant t3 = Instant.now();
//        FibonacciTask task = new FibonacciTask(num);
//        ForkJoinPool pool = new ForkJoinPool(processors);
//        System.out.printf("第 %d 項： %d%n", num, pool.invoke(task));
//        Instant t4 = Instant.now();
//        System.out.println("使用ForkJoin時間：" + Duration.between(t3, t4).toMillis() + "毫秒");

        System.out.println("使用Java SE 8 平行運算...");
        Instant t5 = Instant.now();
        List<Long> list = Stream.iterate(new long[]{0, 1}, n -> new long[]{n[1], n[0]+n[1]})
                                .parallel()
                                .limit(num+1)
                                .map(n -> n[0])
                                .collect(Collectors.toList());
        System.out.println("list：" + list);
        System.out.printf("第 %d 項： %d%n", num, list.get(list.size()-1));
        Instant t6 = Instant.now();
        System.out.println("使用平行運算時間：" + Duration.between(t5, t6).toMillis() + "毫秒");
    }
    
}
