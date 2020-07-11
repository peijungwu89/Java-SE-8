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
public class Soldier extends Role{

    public Soldier() {
        System.out.println("新士兵誕生...");
    }
    
    public void fight(){
        System.out.printf("士兵：%s 進行火炮攻擊%n", getName());
    }
 
}
