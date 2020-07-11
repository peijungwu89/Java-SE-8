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
//        OuterClass outc = new OuterClass();
//        outc.outerMethod();     

        new OuterClass().outerMethod();
        System.out.println("--------------------------");
        
        //OuterClass.InnerClass inc = new OuterClass.InnerClass();
        OuterClass outc = new OuterClass();
        OuterClass.InnerClass inc = outc.new InnerClass();
        inc.show();
        System.out.println("--------------------------");
        
        new OuterClass().new InnerClass().show();
    }
    
}

//-------------------------------------------
class OuterClass{
    
    private int a = 1;
    private int b = 2;
    private static int c = 3;
    
    public void outerMethod(){
        InnerClass inc = new InnerClass();
        System.out.println("inc.b = " + inc.b);
        inc.show();
    }
    
    //Member classes
    public class InnerClass{
        
        private int b = 4;
        //private static int c = 5;
        
        public InnerClass(){
            System.out.println("InnerClass()...");
        }
        
        public void show(){
            System.out.println("OuterClass a = " + a);
            System.out.println("OuterClass b = " + OuterClass.this.b);
            System.out.println("OuterClass c = " + OuterClass.c);
            System.out.println("InnerClass b = " + b);
        }
        
    }
}
