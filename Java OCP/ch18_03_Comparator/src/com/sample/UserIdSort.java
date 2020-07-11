/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.Comparator;

/**
 *
 * @author student
 */
public class UserIdSort implements Comparator<User>{

    @Override
    public int compare(User o1, User o2) {
        return new Integer(o1.getId()).compareTo(o2.getId());
    }
    
}
