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
public class Cylinder extends Circle{
    
    private double height;
    
    public Cylinder(){
        //super(); //可省略
        System.out.println("Cylinder()...");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea(){
        return 2 * super.getArea() + getCircumference() * height;
    }
    
}
