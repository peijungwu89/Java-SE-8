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
        
        Magician magician = new Magician();
        magician.setName("哈利波特");
        magician.setLevel(10);
        magician.setBlood(100);
        System.out.printf("魔法師：[%s, %d, %d]%n", magician.getName(), magician.getLevel(), magician.getBlood());
        magician.cure();
        magician.fight();
        System.out.println("--------------------------------------------------");
        
        Soldier soldier = new Soldier();
        soldier.setName("雷恩大兵");
        soldier.setLevel(1);
        soldier.setBlood(100);
        System.out.printf("士兵：[%s, %d, %d]%n", soldier.getName(), soldier.getLevel(), soldier.getBlood());
        soldier.fight();
        System.out.println("--------------------------------------------------");
        
    }
    
}
