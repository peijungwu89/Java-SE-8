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
public class MyException extends Exception{
    
    private int errNum;
    
    public MyException(String message, int errNum){
        super(message);
        this.errNum = errNum;
    }

    @Override
    public String toString() {
        return "系統發生錯誤，代碼 " + errNum + " ,請將錯誤代碼告知系統管理員：";
    }
    
        
    
}
