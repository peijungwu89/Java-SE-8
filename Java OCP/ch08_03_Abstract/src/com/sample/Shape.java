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
public abstract class Shape {
    
    //欄位
    private String type;
    private String color;
    
    //建構子
    public Shape(String type, String color){
        this.type = type;
        this.color = color;
    }
    
    //具體方法
    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
    
//    public double getArea(){
//        System.out.println("需覆寫 getArea()方法，定義計算面積公式");
//        return 0.0;
//    }
    
    public abstract double getArea();
}
