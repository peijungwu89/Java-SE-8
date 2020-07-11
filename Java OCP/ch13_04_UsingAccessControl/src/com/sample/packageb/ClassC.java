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
public class ClassC extends ClassA{
    
    @Override
    public void show(){
        System.out.println("ClassC extends ClassA...");
        //System.out.println("- w=" + w);
        //System.out.println("  x=" + x);
        System.out.println("# y=" + y);
        System.out.println("+ z=" + z);
        
        System.out.println("-----------");
        
        ClassA classa = new ClassA();
        System.out.println("ClassC new ClassA...");
        //System.out.println("- w=" + classa.w );
        //System.out.println("  x=" + classa.x);
        //System.out.println("# y=" + classa.y);
        System.out.println("+ z=" + classa.z);
    }
    
}
