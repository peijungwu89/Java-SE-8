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
        UseAny u1 = new UseAny();
        u1.add(100);
        System.out.println("u1：" + (int)u1.get()*2);
        
        UseAny<Double> u2 = new UseAny<Double>();
        u2.add(100.0);
        System.out.println("u2：" + u2.get() * 0.9);
        
        UseAny<String> u3 = new UseAny<>();
        u3.add("Java");
        System.out.println("u3：" + u3.get() + " SE");
        
        UseAny<Integer> u4 = new UseAny();
        u4.add(100);
        System.out.println("u4：" + u4.get());
        
    }
    
}


//-----------------------
class UseAny<T>{
    private T temp;
    
    public void add(T temp){
        this.temp = temp;
    }
    
    public T get(){
        return temp;
    }
}
