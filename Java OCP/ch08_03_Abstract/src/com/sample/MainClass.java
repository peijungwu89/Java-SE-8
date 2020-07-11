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
//        Shape shape = new Shape("Shape", "Blue");
//        shape.getArea();
        
        Circle circle = new Circle(10, "圓形", "Green");
        System.out.printf("circle[%s, %s, r:%.2f, a:%.2f]%n", circle.getType(), circle.getColor(), circle.getRadius(), circle.getArea());
        System.out.println("----------");
        
        Rectangle rect = new Rectangle(4, 5, "矩形", "Red");
        System.out.printf("rect[%s, %s, l:%d, w:%d, a:%.2f]%n", rect.getType(), rect.getColor(), rect.getLength(), rect.getWidth(), rect.getArea());
    }
    
}
