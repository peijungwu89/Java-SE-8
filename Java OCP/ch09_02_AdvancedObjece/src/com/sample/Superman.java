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
public class Superman implements Swimmer, Fly{
    
    private String name;
    
    public Superman(String name){
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.printf("超人：%s 水中救餵食員%n", name);
    }

    @Override
    public void fly() {
        System.out.printf("超人：%s 空中飛行%n", name);
    }
    
}
