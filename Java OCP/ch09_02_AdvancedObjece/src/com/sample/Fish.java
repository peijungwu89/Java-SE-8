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
public abstract class Fish implements Swimmer{
    
    protected String name;
    
    public Fish(String name){
        this.name = name;
    }
    
//    public void swim(){
//        System.out.printf("魚：%s 在水中游泳%n", name);
//    }
    
//    public abstract void swim();
}
