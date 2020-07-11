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
public class Human implements Swimmer{

    private String name;
    
    public Human(String name) {
        this.name = name;        
    }

    @Override
    public void swim() {
        System.out.printf("餵食員：%s 在水中餵食小丑魚%n", name);
    }
    
}
