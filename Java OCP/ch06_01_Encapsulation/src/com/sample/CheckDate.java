/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.time.LocalDate;

/**
 *
 * @author student
 */
public class CheckDate {
    
    private String inputDate;
    private int year, month, day;
    
    public void setInputDate(String inputDate){
        System.out.println("inputDate：" + inputDate);
        if(inputDate.trim().length() == 0 || inputDate.equalsIgnoreCase("null")){
            System.out.println("請輸入日期資料!");
        }else{
            this.inputDate = inputDate;
            if(check()){
                //日期正確
                System.out.printf("日期正確：%s%n", this.inputDate);
                year = year - 1911;
                System.out.printf("民國%s %d 年 %d 月 %d 日%n", year<=0?"前":"", year>0?year:year*-1+1, month, day);
            }else{
                System.out.println("輸入日期或格式錯誤!!");
            }
        }
        
    }

    private boolean check() {
        
        if(inputDate.matches("\\d{4}-\\d{1,2}-\\d{1,2}")){  //2020-5-11
            //字串切割
            String[] temp = inputDate.split("-");   //String[] temp = {"2020", "5", "11"}; 
            //將字串轉換成整數
            year = Integer.parseInt(temp[0]);
            month = Integer.parseInt(temp[1]);
            day = Integer.parseInt(temp[2]);
            //檢查日期是否正確
            try{
                LocalDate.of(year, month, day);
            }catch(Exception ex){
                return false;
            }           
        }else{
            return false;
        }
        
        return true;
    }
    
    
    
}


//https://zh.wikipedia.org/zh-tw/%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8F
