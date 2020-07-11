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
public class User implements Comparable<User>{
    private int id;
    private String name;
    private double balance;

    public User(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "[" + id + ", " + name + ", " + balance + "]";
    }

    @Override
    public int compareTo(User o) {
//        if(this.id - o.getId() > 0){
//            return 1;
//        }else if(this.id - o.getId() == 0){
//            return 0;
//        }else{
//            return -1;
//        }
        //int result = new Integer(this.id).compareTo(o.getId());
        //int result = this.name.compareTo(o.getName());
        int result = new Double(this.balance).compareTo(o.getBalance());
        return result * -1;
    }
    
    
}
