/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author student
 */
public class Student implements Serializable{
    
    private String name;
    private int total;
    private transient double average;
    private transient LocalDateTime localDateTime = LocalDateTime.now();

    public Student(String name) {
        this.name = name;
    }
    
    public void sum(int... scores){
        for(int s : scores){
            total += s;
        }
        average = total/ scores.length;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }

    public double getAverage() {
        return average;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
            
    
}
