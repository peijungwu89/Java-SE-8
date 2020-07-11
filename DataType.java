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
        //區域變數
        //語法：資料型別 變數名稱 = 值;
        //語法：資料型別 變數名稱 = 值;
	//資料型別：基本型別、參考名別
	//基本型別┬數字 ┬ 整數(byte、short、int、long)
	//　　　　│　　 ├ 浮點數(float、double)
	//　　　　│　　 └ 字元(char)
	//　　　　└邏輯 ─ 布林(boolean)		
		
	//整數 byte(8bits),short(16bits),int(32bits、預設),long(64bits)  
        
        int a1 = 2147483647; //-2147483648 ~ 2147473647
        long a2 = 2147483648L; ////數值超出 int 範圍(-2148483648~2147483647)，在數字後方加【L】
        int a3 = 2147483647 + 2; //溢位
        long a4 = 2_147_48__3______647 + 2L; 
        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);
        System.out.println("a3 = " + a3);
        System.out.println("a4 = " + a4);
        
        //十進位 0~9
        System.out.println("十進位：" + 6699);
        //二進位 0b 0~1
        System.out.println("二進位 0b1101000101011：" + 0b1_1010_0010_1011);
        //八進位 0 0~7
        System.out.println("八進位 015053：" + 015053);
        //十六進位 0x 0~9 A(10) B(11) C(12) D(13) E(14) F(15)
        System.out.println("十六進位 0x1A2B：" + 0x1A2B);
        
        //浮點數 float(32bits 使用時加F)、double(64bits、預設)
        //IEEE二進位浮點數算術標準（IEEE 754）浮點數演算規範，使用分數與指數來表示浮點數
	//0.5 = 1/2
	//0.75 = 1/2 + 1/4
	//0.875 = 1/2 + 1/4 + 1/8
	//java.math.BigDecimal
        
        float b1 = 0.1F;
        double b2 = 0.1;
        System.out.println(b1 + b2);
        
        System.out.println(0.1F + 0.1F + 0.1F);
        System.out.println(0.1 + 0.1 + 0.1);
        
        System.out.println(1.0 - 0.8);
        
        //字元 char (16bits)
        char c1 = 'A';
        char c2 = '\u0041';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1 + 5);
        System.out.println((char)(c1 + 5)); //強制轉型：(目標型別)值
        
        char c3 = '熱';
        char c4 = '\u5496';
        char c5 = '\u5561';
        System.out.println("-->" + c3 + c4 + c5);
        System.out.println(c3 + c4 + c5);
        

        //邏輯 布林 boolean --> true/false
        boolean booA = 3 <= 8;
        boolean booB = 3 == 8;
        System.out.println(booA);
        System.out.println(booB);
        System.out.println(!booB); // ! not 反
        
        //---------------------------
        
        
        
        
        
    }
    
}
