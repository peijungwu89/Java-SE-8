/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.HashMap;
import java.util.Set;

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
        HashMap<String, String> users = new HashMap<>();
        System.out.println("users.put(\"A123456789\", \"謝先生\")：" + users.put("A123456789", "謝先生"));
        users.put("B123456789", "Amy");
        users.put("C123456789", "Tom");
        users.put("D123456789", "Lisa");
        users.put("E123456789", "Tom");
        System.out.println("users.put(\"A123456789\", \"小明\")：" + users.put("A123456789", "小明"));
        System.out.println(users);
        System.out.println(users.get("D123456789"));
        
        Set<String> keys = users.keySet();
        System.out.println("keys：" + keys);
        
        System.out.println("ID\t\tName");
        System.out.println("----------------------------");
        for(String key : keys){
            System.out.printf("%s\t%s%n", key, users.get(key));
        }
        
        
        
        
        
    }
    
}
