/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
        
        try(FileOutputStream fos = new FileOutputStream(file)){
            fos.write(temp.getBytes());
            System.out.println("資料存檔完成!\n------------------------");
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        try(FileInputStream fis = new FileInputStream(file)){
            System.out.println("檔案大小：" + fis.available() + " 位元組");
//            int value;
//            while((value=fis.read()) != -1){
//                System.out.print((char)value);
//            }

            byte[] buff = new byte[fis.available()];
            int count = 0;
            while((count=fis.read(buff)) > 0){
                System.out.print("count=" + count + "\t");
                System.out.println(new String(buff));
            }
            System.out.println("\n資料讀取完成!\n------------------------");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
