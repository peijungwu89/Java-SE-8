/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.packageb;

import com.sample.packagea.ClassA;

/**
 *
 * @author student
 */
public class ClassD {
    
    public void show(){
        ClassA classa = new ClassA();
        System.out.println("ClassD...");
        //System.out.println("- w=" + classa.w );
        //System.out.println("  x=" + classa.x);
        //System.out.println("# y=" + classa.y);
        System.out.println("+ z=" + classa.z);
    }
}
