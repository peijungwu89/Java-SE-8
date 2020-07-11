/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;
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
        try {            
            doTest();
        } catch (SQLException ex) {
            System.out.println("main:" + ex.getMessage());
        } catch (MyException ex) {
            System.out.println(ex + ex.getMessage());
        }
        System.out.println("結束!");
    }

    private static void doTest() throws SQLException, MyException {
        double random = new Random().nextDouble();
        if(random >= 0.75){
            try {
                throw new IOException("I/O錯誤!");
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }else if(random >= 0.5){
            try {
                throw new SQLException("SQL錯誤!");
            } catch (SQLException ex) {
                System.out.println("doTest：" + ex);
                //例外再拋
                throw ex;
            }
        }else if(random >= 0.25){
            throw new MyException("小明", 2266);
        }else{
            System.out.println("系統運作正常...");
        }
    }
    
}
