/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
        String temp = "This is a book. 這是一本書。定價：1234";
        File file = new File("test.txt");
        
        try(FileWriter fw = new FileWriter(file);
                FileReader fr = new FileReader(file)){
            fw.write(temp);
            System.out.println("資料存檔完成!\n------------------------");
            fw.flush();
            
            int value;
            while((value=fr.read()) != -1){
                System.out.print((char)value);
            }
            System.out.println("\n資料讀取完成!\n------------------------");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
