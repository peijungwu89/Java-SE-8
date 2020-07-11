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
        Computer computer = new Computer();
        computer.setState(PowerState.ON);
        computer.setState(PowerState.SUSPEND);
        computer.setState(PowerState.ON);
        computer.setState(PowerState.OFF);
        
    }
    
}
