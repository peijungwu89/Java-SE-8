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
//        Test t1 = new Test();
//        Test t2 = new Test();
//        Test t3 = new Test();
        Test t1 = Test.getInstance();
        Test t2 = Test.getInstance();
        Test t3 = Test.getInstance();
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        
        t1.show();
        t2.show();
        t3.show();
        
    }
    
}

//-------------------------------
class Test{
    
    private static final Test instance = new Test();
    
    private int count = 0;
    
    private Test(){
        System.out.println("Test()...");
    }
    
    public static Test getInstance(){
        return instance;
    }
    
    public void show(){
        System.out.println("count：" + ++count);
    }
}
