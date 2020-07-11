/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import static com.sample.MainClass.count;
import static java.lang.System.out;


/**
 *
 * @author student
 */
public class User {
    
    private static int id = 0;
    
    private String uid;
    
    static{
        out.println("User static{} count = " + ++count);
    }
    
    public User(){
//        System.out.println("User() count = " + ++MainClass.count);
//        id++;
//        uid = String.format("U%02d", id);   //U01、U02、...
        out.println("id：" + id + ", uid：" + uid);
    }
    
     public User(String name){
//        System.out.println("User() count = " + ++MainClass.count);
//        id++;
//        uid = String.format("U%02d", id);   //U01、U02、...
        out.println("id：" + id + ", uid：" + uid + ", name：" + name);
    }
     
    {
        System.out.println("@@@@@@ User 實作區塊{} count = " + ++MainClass.count);
        System.out.println("User() count = " + ++MainClass.count);
        id++;
        uid = String.format("U%02d", id);   //U01、U02、...
    } 
}
