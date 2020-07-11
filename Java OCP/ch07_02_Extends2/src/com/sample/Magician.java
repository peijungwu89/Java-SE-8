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
public class Magician extends Role{

    public Magician() {
        System.out.println("新魔法師誕生...");
    }
    
    public void cure(){
        System.out.printf("魔法師：%s 進行魔法治療%n", getName());
    }
    
    public void fight(){
        System.out.printf("魔法師：%s 進行魔法攻擊%n", getName());
    }
  
}
