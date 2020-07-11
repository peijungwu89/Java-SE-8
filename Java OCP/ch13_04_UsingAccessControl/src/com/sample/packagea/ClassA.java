/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.packagea;

/**
 *
 * @author student
 */
public class ClassA {
    
    private int w =1;
    int x = 2;
    protected int y = 3;
    public int z = 4;
    
    public void show(){
        System.out.println("ClassA...");
        System.out.println("- w=" + w);
        System.out.println("  x=" + x);
        System.out.println("# y=" + y);
        System.out.println("+ z=" + z);
    }
}
