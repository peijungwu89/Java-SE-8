/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

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
        Company company = new Company();
        Thread t1 = new Thread(company, "銷售員A");
        Thread t2 = new Thread(company, "銷售員B");
        Thread t3 = new Thread(company, "銷售員C");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }

        System.out.println("-------------------");
        System.out.println("balance = " + company.balance);

    }

}

//-----------------------------
class Company implements Runnable {

    int balance;

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            runBalance();
            System.out.println(i + ". " + Thread.currentThread().getName() + "\tbalance=" + balance);

        }
    }

    private synchronized void runBalance() {
        int temp = balance;

        try {
            Thread.sleep(new Random().nextInt(1234));
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        temp += 100;
        balance = temp;
    }

}


/*
class Company implements Runnable {

    int balance;

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            synchronized (this) {
                int temp = balance;

                try {
                    Thread.sleep(new Random().nextInt(1234));
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                temp += 100;
                balance = temp;
                System.out.println(i + ". " + Thread.currentThread().getName() + "\tbalance=" + balance);
            }
        }
    }

}
 */
