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
public class Shark extends Fish{
    
    public Shark(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.printf("鯊魚：%s 在追趕餵食員%n", name);
    }
    
}
