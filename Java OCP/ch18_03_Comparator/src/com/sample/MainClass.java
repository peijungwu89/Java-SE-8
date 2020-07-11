/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.ArrayList;
import java.util.Comparator;

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
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(9, "Amy", 500.0));
        users.add(new User(2, "Tom", 700.0));
        users.add(new User(8, "小明", 900.0));
        users.add(new User(4, "Jackie", 300.0));
        users.add(new User(6, "Lisa", 800.0));
        users.add(new User(5, "大華", 200.0));
        System.out.println("users：" + users);
        
        users.sort(new UserIdSort());
        System.out.println("users：" + users);
        
        users.sort(new UserNameSort());
        System.out.println("users：" + users);
    }
    
    
    private static class UserNameSort implements Comparator<User>{

        @Override
        public int compare(User o1, User o2) {
            return o1.getName().compareTo(o2.getName());
        }
        
    }
    
}
