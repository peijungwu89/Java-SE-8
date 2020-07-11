/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.ArrayDeque;

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
        ArrayDeque<String> fifo = new ArrayDeque<>();
        fifo.add("Kiwi");
        fifo.add("Apple");
        fifo.add("Orange");
        fifo.add("Banana");
        fifo.add("Apple");
        System.out.println("fifo：" + fifo);
        System.out.println("取出不移除：" + fifo.peek());
        System.out.println("fifo：" + fifo);
//        System.out.println("取出並移除：" + fifo.remove());
//        System.out.println("取出並移除：" + fifo.remove());
//        System.out.println("取出並移除：" + fifo.remove());
//        System.out.println("取出並移除：" + fifo.remove());
//        System.out.println("取出並移除：" + fifo.remove());
//        System.out.println("取出並移除：" + fifo.remove());
        System.out.println("取出並移除：" + fifo.poll());
        System.out.println("取出並移除：" + fifo.poll());
        System.out.println("取出並移除：" + fifo.poll());
        System.out.println("取出並移除：" + fifo.poll());
        System.out.println("取出並移除：" + fifo.poll());
        System.out.println("取出並移除：" + fifo.poll());
        System.out.println("fifo：" + fifo);
        
        System.out.println("------------");
        ArrayDeque<String> lifo = new ArrayDeque<>();
        lifo.push("Kiwi");
        lifo.push("Apple");
        lifo.push("Orange");
        lifo.push("Banana");
        lifo.push("Apple");
        System.out.println("lifo：" + lifo);
        while(lifo.size()>0){
            System.out.println(lifo.pop());
        }
        System.out.println("lifo：" + lifo);
    }
    
}
