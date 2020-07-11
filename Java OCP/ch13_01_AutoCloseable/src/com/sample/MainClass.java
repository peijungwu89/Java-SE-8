/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.logging.Level;
import java.util.logging.Logger;

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
        try(Test test = new Test()){
            test.show();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("結束!");
    }
    
}

//----------------------
class Test implements AutoCloseable{
    
    public void show(){
        System.out.println("Test show()...");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Test close()...");
    }
}
