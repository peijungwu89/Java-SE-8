/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.ArrayList;
import java.util.Iterator;

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
        ArrayList<Integer> list = new ArrayList<>();
        list.add(new Integer(10));  //Java SE 5.0 前 boxing 裝箱
        list.add(20);               //Java SE 5.0開始 autoboxing 自動裝箱
        list.add(Integer.valueOf(30));
        list.add(2, 40);
        list.add(20);
        System.out.println("list：" + list);
        
        int total = 0;
        for(int i=0; i<list.size(); i++){
            Integer wInt = list.get(i);
            int pInt = wInt.intValue();    //Java SE 5.0 前 unboxing  拆箱  
            total += pInt;
        }
        System.out.println("total = " + total);
        
        total = 0;
//        for(Integer wInt : list){
//            int pInt = wInt;         //Java SE 5.0開始 autounboxing 自動拆箱
//        }
        for(int i : list){  //autounboxing 自動拆箱
            total += i;
        }
        System.out.println("total = " + total);
        
        //迭代器
        total = 0;
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int pInt = iterator.next();
            System.out.printf("%d | ", pInt);
            total += pInt;
        }
        System.out.println("\ntotal = " + total);
    }
    
}
