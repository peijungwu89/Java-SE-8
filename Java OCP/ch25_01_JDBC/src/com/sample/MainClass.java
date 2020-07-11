/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class MainClass implements IEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try (Connection conn = DriverManager.getConnection(url, user, password);
                Statement stmt = conn.createStatement()) {

            System.out.printf("資料庫已 %s%n", conn.isClosed() ? "關閉" : "開啟");

            DatabaseMetaData dbm = conn.getMetaData();
            System.out.println("supportsANSI92EntryLevelSQL()：" + dbm.supportsANSI92EntryLevelSQL());

            Scanner scanner = new Scanner(System.in);
            ResultSet rs = null;

            outer:
            while (true) {
                System.out.print("----------------------\n"
                        + "1) 新增資料表\n"
                        + "2) 新增單筆紀錄\n"
                        + "3) 批次新增\n"
                        + "4) 紀錄查詢(全部)\n"
                        + "5) 紀錄查詢(依條件)\n"
                        + "6) 修改紀錄\n"
                        + "7) 刪除紀錄\n"
                        + "8) 結束\n"
                        + "----------------------\n"
                        + "==> ");
                int keyin = scanner.nextInt();
                String sql = "";
                switch (keyin) {
                    case 1:
                        //新增資料表
                        rs = dbm.getTables(null, null, TABLE_NAME, null);
                        if(rs.next()){
                            System.out.println("資料表 " + TABLE_NAME + " 已存在!");
                        }else{
                            sql = String.format("CREATE TABLE %s("
                                    + "%s INT NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY(START WITH 1, INCREMENT BY 1),"
                                    + "%s VARCHAR(20),"
                                    + "%s VARCHAR(20),"
                                    + "%s DATE,"
                                    + "%s INT)", TABLE_NAME, ID, FIRST_NAME, LAST_NAME, BIRTHDAY, SALARY);
                            System.out.println(sql);
                            stmt.execute(sql);
                            System.out.println("資料表 " + TABLE_NAME + " 建立完成!");
                        }
                        break;
                    case 2:
                        //新增單筆紀錄
                        sql = String.format("INSERT INTO %s(%s, %s, %s, %s) VALUES('Amy', 'Lee', '2001-01-02', 36000)", TABLE_NAME, FIRST_NAME, LAST_NAME, BIRTHDAY, SALARY);
                        System.out.println(sql);
                        int result = stmt.executeUpdate(sql);
                        System.out.println("異動筆數：" + result);    
                        break;
                    case 3:
                        //批次新增
                        String[] sqls = new String[5];
                        sqls[0] = String.format("INSERT INTO %s(%s, %s, %s, %s) VALUES('Haley', 'Lin', '2005-03-01', 36000)", TABLE_NAME, FIRST_NAME, LAST_NAME, BIRTHDAY, SALARY);
                        sqls[1] = String.format("INSERT INTO %s(%s, %s, %s, %s) VALUES('Duke', 'Wang', '2004-04-06', 46000)", TABLE_NAME, FIRST_NAME, LAST_NAME, BIRTHDAY, SALARY);
                        sqls[2] = String.format("INSERT INTO %s(%s, %s, %s, %s) VALUES('Jacky', 'Lee', '2003-05-07', 38000)", TABLE_NAME, FIRST_NAME, LAST_NAME, BIRTHDAY, SALARY);
                        sqls[3] = String.format("INSERT INTO %s(%s, %s, %s, %s) VALUES('Louis', 'Chen', '2002-06-08', 42000)", TABLE_NAME, FIRST_NAME, LAST_NAME, BIRTHDAY, SALARY);
                        sqls[4] = String.format("INSERT INTO %s(%s, %s, %s, %s) VALUES('Carl', 'Wang', '2001-07-09', 48000)", TABLE_NAME, FIRST_NAME, LAST_NAME, BIRTHDAY, SALARY);

                        for(String s : sqls){
                            stmt.addBatch(s);
                        }
                        int[] results = stmt.executeBatch();
                        for(int r : results){
                            System.out.println("異動筆數：" + r);   
                        }
                        break;
                    case 4:
                        //紀錄查詢(全部)
                        sql = "SELECT * FROM " + TABLE_NAME;
                        System.out.println(sql);
                        rs = stmt.executeQuery(sql);
                        while(rs.next()){
                            System.out.printf("%d --> %s\t%s\t%s\t%d%n", rs.getInt(ID), rs.getString(FIRST_NAME), rs.getString(LAST_NAME), rs.getString(BIRTHDAY), rs.getInt(SALARY));
                        }

                        break;
                    case 5:
                        // 紀錄查詢(依條件)
                        // sql = "SELECT * FROM " + TABLE_NAME + " WHERE " + LAST_NAME + "='Lee'";
                        sql = "SELECT * FROM " + TABLE_NAME + " WHERE " + SALARY + " <40000";
                        System.out.println(sql);
                        rs = stmt.executeQuery(sql);
                        while(rs.next()){
                            System.out.printf("%d --> %s\t%s\t%s\t%d%n", rs.getInt(ID), rs.getString(FIRST_NAME), rs.getString(LAST_NAME), rs.getString(BIRTHDAY), rs.getInt(SALARY));
                        }
                        break;
                    case 6:
                        // 修改紀錄
                        sql = "UPDATE " + TABLE_NAME + " SET " + SALARY + "=40000 WHERE " + SALARY + "<40000"; 
                        System.out.println(sql);
                        result = stmt.executeUpdate(sql);
                        System.out.println("異動筆數：" + result);
                        break;
                    case 7:
                        // 刪除紀錄
                        sql = "DELETE FROM " + TABLE_NAME + " WHERE " + LAST_NAME + "='Wang'"; 
                        System.out.println(sql);
                        result = stmt.executeUpdate(sql);
                        System.out.println("異動筆數：" + result);
                        break;
                    case 8:
                        System.out.println("系統結束!");
                        break outer;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}
