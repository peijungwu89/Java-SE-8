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
public class ClassB {
    
    public void show(){
        ClassA classa = new ClassA();
        System.out.println("ClassB...");
        //System.out.println("- w=" + classa.w );
        System.out.println("  x=" + classa.x);
        System.out.println("# y=" + classa.y);
        System.out.println("+ z=" + classa.z);
    }
}
