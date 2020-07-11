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
public class Anemenefish extends Fish {
    
    public Anemenefish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.printf("小丑魚：%s 在水中游泳%n", name);
    }
    
}
