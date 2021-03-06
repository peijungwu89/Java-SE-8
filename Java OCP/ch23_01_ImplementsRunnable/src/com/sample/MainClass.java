/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

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
        System.out.printf("目前執行緒：%s%n", Thread.currentThread().getName());
        Car car1 = new Car("T牌");
        Car car2 = new Car("F牌");
        
        Thread t1 = new Thread(car1, "T-thread");
        Thread t2 = new Thread(car2);
        t2.setName("F-thread");
        
        t1.start();
        t2.start();
        
        System.out.println("車輛生產完成!");
    }
    
}


//-------------------
class SuperCar{}

class Car extends SuperCar implements Runnable{
    String name;

    public Car(String name) {
        this.name = name;
    }    

    @Override
    public void run(){
        for(int i=1; i<=3; i++){
            System.out.printf("目前執行緒：%s，%s 第 %d 輛車生產完成%n", Thread.currentThread().getName(), name, i);
        }
    }
}
