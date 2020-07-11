/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class ReadStudentObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("amy.student"))){
            Student student = (Student)ois.readObject();
            System.out.println(student.getName());
            System.out.println(student.getTotal());
            System.out.println(student.getAverage());
            System.out.println(student.getLocalDateTime());
            
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        } 
    }
    
}
