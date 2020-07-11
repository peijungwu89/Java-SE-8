/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

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
        Date date = new Date();
        System.out.println(date);
        
        LocalDate today = LocalDate.now();
        System.out.println("today：" + today);
        
        LocalTime time = LocalTime.now();
        System.out.println("time：" + time);
        
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now：" + now);
        System.out.println("-------------");
        
        LocalDate ld_1 = LocalDate.of(2020, 3, 22);
        System.out.println("ld_1：" + ld_1);
        LocalDate ld_2 = LocalDate.of(2020, Month.JUNE, 22);
        System.out.println("ld_2：" + ld_2);
        LocalDate ld_3 = LocalDate.parse("2020-05-22");  //yyyy-MM-dd
        System.out.println("ld_3：" + ld_3);
        System.out.println("-------------");
        
        System.out.println("today：" + today);
        System.out.println("isBefore()：" + today.isBefore(ld_1));
        System.out.println("isBefore()：" + today.isBefore(ld_2));
        System.out.println("isAfter()：" + today.isAfter(ld_1));
        System.out.println("isAfter()：" + today.isAfter(ld_2));
        System.out.println("isEqual()：" + today.isEqual(ld_2));
        System.out.println("isEqual()：" + today.isEqual(ld_3));
        System.out.println("isLeapYear()：" + today.isLeapYear());
        System.out.println("getDayOfYear()：" + today.getDayOfYear());
        System.out.println("getDayOfMonth()：" + today.getDayOfMonth());
        System.out.println("getDayOfWeek()：" + today.getDayOfWeek());
        System.out.println("-------------");
        
        System.out.println(now);
        System.out.println(now.format(DateTimeFormatter.ISO_DATE));
        System.out.println(now.format(DateTimeFormatter.ISO_TIME));
        System.out.println(now.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("");
        System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
        System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        System.out.println(now.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("");
        System.out.println(now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(now.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("");
        System.out.println(now.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG)));
        System.out.println(now.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
        System.out.println(now.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        
        System.out.println("-------------");
        System.out.println("計算1：" + today.plusWeeks(2).minusDays(1).plusMonths(1));
        System.out.println("計算2：" + today.minusDays(3)
                                           .plusWeeks(2)
                                           .plusMonths(3)
                                           .format(DateTimeFormatter.ofPattern("E MM/dd/yyyy")));
        System.out.println("-------------");
        MinguoDate minguoDate = MinguoDate.now();
        System.out.println("minguoDate：" + minguoDate);
        System.out.println("minguoDate：" + minguoDate.atTime(time));
        
        JapaneseDate japaneseDate = JapaneseDate.now();
        System.out.println("japaneseDate：" + japaneseDate);
        
    }
    
}
