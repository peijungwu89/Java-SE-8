/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
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
        //List<String> list = new ArrayList<>();
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        
        for(int i=0; i<15; i++){
            list.add(String.format("M%02d", i));
        }
        
        Thread thread = new Thread(new Test(list));
        thread.start();
        
        for(String s : list){
            System.out.println(s + ":" + list + "," + list.hashCode());
        }
        System.out.println("結束!");
    }
    
}

class Test implements Runnable{
    
    private List<String> list;
    
    public Test(List<String> list){
        this.list = list;
    }

    @Override
    public void run() {
        for(int i=20; i<30; i++){
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException ex) {
//                System.out.println(ex);
//            }
            list.add(String.format("T%02d", i));
            System.out.println(i + "\t" + list + "," + list.hashCode());
        }
    }
    
}
