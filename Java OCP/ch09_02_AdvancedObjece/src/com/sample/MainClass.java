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
//        Fish fish = new Fish("小魚兒");
//        fish.swim();
//        System.out.println("------------");
        Anemenefish anemenefish = new Anemenefish("尼莫");
        anemenefish.swim();
        System.out.println("------------");
        Shark shark = new Shark("大白鯊");
        shark.swim();
        System.out.println("------------");
        Human human = new Human("小明");
        human.swim();
        System.out.println("------------");
        Superman superman = new Superman("克拉克");
        superman.swim();
        superman.fly();
        System.out.println("------------");
        Flyingfish flyingfish = new Flyingfish("非魚");
        flyingfish.swim();
        flyingfish.fly();
    }
    
}
