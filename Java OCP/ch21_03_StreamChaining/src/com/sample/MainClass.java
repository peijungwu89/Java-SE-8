/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
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
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String[] inputLog = new String[3];
        
        try(FileWriter fw = new FileWriter("log.txt", true);
                BufferedWriter bw = new BufferedWriter(fw)){
            System.out.print("帳號：");
            inputLog[0] = br.readLine();
            System.out.print("密碼：");
            inputLog[1] = br.readLine();
            inputLog[2] = LocalDateTime.now().toString();
            
            for(String s : inputLog){
                bw.write(s);
                bw.newLine();
            }
            bw.write("---------------------------");
            bw.newLine();
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
