/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

        try(FileInputStream fis = new FileInputStream("test.txt")) {
            doTest();
        } catch (IOException | SQLException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            System.out.println("Exception：" + ex);
        }
    }

    private static void doTest() throws Exception {
        double random = new Random().nextDouble();
        if (random >= 0.75) {
            throw new IOException("I/O錯誤!");
        } else if (random >= 0.5) {
            throw new SQLException("SQL錯誤!");
        } else {
            System.out.println("系統運作正常...");
        }
    }

}
