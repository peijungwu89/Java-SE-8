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
public class Flyingfish extends Fish implements Fly{

    public Flyingfish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.printf("飛魚：%s 在水中游%n", name);
    }

    @Override
    public void fly() {
        System.out.printf("飛魚：%s 在水面上飛，速度：%d%n", name, FlySpeed.SPEED+MoveSpeed.SPEED);
    }
    
}
