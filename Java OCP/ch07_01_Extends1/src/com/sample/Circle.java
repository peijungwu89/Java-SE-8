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
public class Circle {
    
    private double radius;
    public final double PI = 3.14;  //常數
    
    public Circle(){
        System.out.println("Circle()...");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        return PI * radius * radius;
    }
    
    public double getCircumference(){
        return 2 * PI * radius;
    }
    
    
}
