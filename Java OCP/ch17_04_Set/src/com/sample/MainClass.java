/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

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
        HashSet<Integer> hashSet = new HashSet<>();
        while(hashSet.size() < 6){
            int random = new Random().nextInt(49) + 1;
            System.out.printf("加入 %d --> %b%n", random, hashSet.add(random));
        }
        System.out.println("下注號碼：" + hashSet);
        //-------------------------------------------------------
        TreeSet<Integer> treeSet = new TreeSet<>();
        while(treeSet.size() < 6){
            treeSet.add(new Random().nextInt(49) + 1);
        }
        System.out.println("開獎號碼：" + treeSet);
        //------------------------------------------------------
        int count = 0;
        String msg = "";
        for(int i : treeSet){
            if(hashSet.contains(i)){
                count++;
                msg = msg + String.format("%02d ", i);
            }
        }
        System.out.printf("中獎號碼：%s 共 %d 個%n", msg, count);
    }
    
}
