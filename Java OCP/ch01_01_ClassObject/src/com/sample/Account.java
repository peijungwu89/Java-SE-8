/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.Date;

/**
 *
 * @author student
 */
public class Account {
    
    //欄位(屬性)
    //語法：[存取修飾] 型別 欄位名稱[=值]
    public String name;
    public int balance;
    private Date date;
    
    //建構子：初始化物件，只被執行一次
    //語法：[存取修飾] 類別名稱(參數列){...}
    public Account(){
        System.out.println("新帳戶建立...");
    }    
    
    //方法(操作)
    //[存取修飾] 回傳型別 方法名稱(參數列){...}
    public String info(){
        //建立 date 日期時間物件
        date = new Date();
        
        String msg = "帳戶：" + name + "\n存款：" + balance + "\n" + date;
        return msg;
    }
    
}
