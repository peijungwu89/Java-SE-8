/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
        Student student = new Student("amy");
        student.sum(90, 80, 70);
        System.out.printf("%s, %d, %.2f, %s%n", student.getName(), student.getTotal(), student.getAverage(), student.getLocalDateTime());
        
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("amy.student"))){
            oos.writeObject(student);
            System.out.println("資料保存成功!");
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
