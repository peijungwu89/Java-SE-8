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
//          列舉型別
public enum PowerState {
    
    //列舉值
    OFF("關閉"), ON("開啟"), SUSPEND("暫停");
    
    //欄位
    private String state;
    
    //private 建構子
    private PowerState(String state){
        this.state = state;
    }

    @Override
    public String toString() {
        return "電源" + state;
    }
    
    
    
}
