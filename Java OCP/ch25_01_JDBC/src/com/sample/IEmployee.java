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
public interface IEmployee {
    
    String url = "jdbc:derby://localhost:1527/EmployeeDB";
    String user = "app";
    String password = "app";
    
    String TABLE_NAME = "EMPLOYEE";
    String ID = "ID";
    String FIRST_NAME = "FIRSTNAME";
    String LAST_NAME = "LASTNAME";
    String BIRTHDAY = "BIRTHDAY";
    String SALARY = "SALARY";
    
    
}
