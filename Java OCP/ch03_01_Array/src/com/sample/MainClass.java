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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //宣告、實作、初始化一維陣列
        //型別[] 陣列名稱 = {元素1, 元素2, 元素3, ...};
        
        String[] str1 = {"Java", "Android", "Python"};
        System.out.println("str1：" + str1);
        
        //取值：陣列名稱[索引值]
        System.out.println("1. " + str1[0]);
        System.out.println("2. " + str1[1]);
        System.out.println("3. " + str1[2]);
        
        //設值：陣列名稱[索引值]=值;
        str1[2] = "Python 3.8";
        
        System.out.println("------------");
        //一般 for 迴圈
        for(int i=0; i<str1.length; i++){
            System.out.println((i+1) + ". " + str1[i]);
        }
        
        System.out.println("------------");
        //宣告一維陣列：型別[] 陣列名稱;
        //實作一維陣列：陣列名稱 = new 型別[陣列長度];
        //--------------------------------------------------
        //宣告、實作一維陣列：型別[] 陣列名稱 = new 型別[陣列長度];
        //--------------------------------------------------
        int[] iArray = new int[5];  //陣列長度宣告後不可以改變
        
        iArray[1] = 20;
        iArray[3] = 40;
        
        //增強型 for 迴圈
        //for(型別 暫時性變數名稱 : 陣列或集合){...}
        for(int i : iArray){
            System.out.printf("%d | ", i);
        }
        System.out.println("\n------------");
        
        //int[] test1 = new int[];
        int test2[] = new int[1];
        int []test3 = new int[2];
        //int[] test4 = new int[2]{1, 2};
        int[] test5;
        //test5 = {1, 2, 3};
        test5 = new int[]{1, 2, 3};
        int[] test6 = new int[]{}; //nt[] test6 = new int[0];
        int[] test7 = new int[]{1, 2, 3, 4};

        //-------------------------------------
        
        Book[] books = new Book[3];
        System.out.println(books[0]);
        books[0] = new Book("Java SE 8", 800);
        books[1] = new Book("Python 3.8", 700);
        books[2] = new Book("Android 9", 800);
        
        for(Book book : books){
            System.out.printf("%s --> %d%n", book.name, book.price);
        }
        
        System.out.println("------------");
        
        int[][] ids = {{11, 12, 13, 14, 15}, {21, 22}, {31, 32, 33}};
        System.out.println("ids[1][0] = " + ids[1][0]);
        
        for(int i=0; i<ids.length; i++){
            for(int j=0; j<ids[i].length; j++){
                System.out.printf("%d ", ids[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("------------");
        for(int[] temp : ids){
            for(int i : temp){
                System.out.printf("%d ", i);
            }
            System.out.println();
        }
        
        System.out.println("------------");
        int[][] test8 = new int[3][];
        test8[0] = new int[5];
        test8[1] = new int[2];
        test8[2] = new int[3];
        System.out.println(test8[0].length);
        System.out.println(test8[1].length);
        System.out.println(test8[2].length);
        
                
    }
    
}
