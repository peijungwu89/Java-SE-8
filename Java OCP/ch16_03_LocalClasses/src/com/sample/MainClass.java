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
        new OuterClass().outerMethod(4);
    }

}

//-------------------------------------------
class OuterClass {

    private int a = 1;
    private int b = 2;
    private static int c = 3;

    public void outerMethod(int d) {
        int e = 5;
        int f = 6;        
        //Local classes
        class InnerClass {

            private int b = 4;

            public InnerClass() {
                System.out.println("InnerClass()...");
            }

            public void show() {
                System.out.println("OuterClass a = " + a);
                System.out.println("OuterClass b = " + OuterClass.this.b);
                System.out.println("OuterClass c = " + OuterClass.c);
                System.out.println("InnerClass b = " + b);
                System.out.println("outerMethod d = " + d);
                System.out.println("outerMethod e = " + e);
                //System.out.println("outerMethod f = " + f);
            }

        }
        InnerClass inc = new InnerClass();
        System.out.println("inc.b = " + inc.b);
        inc.show();
        f = f + inc.b; 
        System.out.println("f = " + f);
    }

}
