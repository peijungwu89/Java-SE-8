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
public class Circle extends Shape{
    
    private double radius;
    public final double PI = 3.14;

    public Circle(double radius, String type, String color) {
        super(type, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return PI * radius * radius;
    }
    
    
}
