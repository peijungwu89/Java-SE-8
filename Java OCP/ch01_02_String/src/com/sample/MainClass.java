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
        String s1 = "java";
        String s2 = "Java";
        String s3 = "Java";
        String s4 = new String("Java");
        String s5 = new String("Java");
        
        // == 是比較物件記憶體位置
        System.out.println("s2==s3：" + (s2==s3));
        System.out.println("s4==s5：" + (s4==s5));
        
        //比較字串內容
        System.out.println("equals()大小寫不同：" + s1.equals(s5));
        System.out.println("equalsIgnoreCase() 不分大小寫：" + s1.equalsIgnoreCase(s5));
        
        System.out.println("----------");
        String s6 = "Java";
        String s7 = "SE";
        String s8 = s6 + s7;
        String s9 = "JavaSE";
        String s10 = "Java" + "SE";
        System.out.println("s8：" + s8);
        System.out.println("s9：" + s9);
        System.out.println("s10：" + s10);
        System.out.println("s8==s9：" + (s8==s9));
        System.out.println("s9==s10：" + (s9==s10));
        System.out.println("s10==s8：" + (s10==s8));
        
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        //a + b;
        String temp1 = a + b;
        System.out.println("1. temp1：" + temp1); //ab
        temp1.concat(c);
        temp1 = temp1.concat(c);
        System.out.println("2. temp1：" + temp1);
        System.out.println("--------------------------");
        
        String temp2 = a + b;
        temp2 = temp2 + c;
        temp2 = temp2 + d;
        System.out.println("temp2：" + temp2);
        
        StringBuilder temp3 = new StringBuilder();
        temp3.append(a).append(d);
        temp3.append(c);
        temp3.append(d);
        System.out.println("temp3：" + temp3.toString());
        System.out.println("--------------------------");
        
        String str = " This is a book. 這是一本書。 ";
        System.out.println("012345678901234567");
        System.out.println(str);
        System.out.println("str字串長度：" + str.length());
        System.out.println("第10個字元：" + str.charAt(9));
        System.out.println("轉大寫：" + str.toUpperCase());
        System.out.println("轉小寫：" + str.toLowerCase());
        str = str.trim();
        System.out.println(str);
        System.out.println("str字串長度：" + str.length());
        System.out.println("str.substring(8)：" + str.substring(8));
        System.out.println("str.substring(10, 14)：" + str.substring(10, 14));
        System.out.println("str.startsWith(\"This\")：" + str.startsWith("This"));
        System.out.println("str.endsWith(\"一本書。\")：" + str.endsWith("一本書。"));
        
        System.out.println("-------------");
        int index1 = str.indexOf("i");
        System.out.println("index1：" + index1);
        int index2 = str.indexOf("i", index1+1);
        System.out.println("index2：" + index2);
        
        int i = -1;
        int count = 0;
        do{
            i = str.indexOf("s", i+1);
            if(i >= 0){
                System.out.println("找到第 " + ++count + " 個 s 在索引值位置：" + i);
            }
        }while(i != -1);
        
        System.out.println("-----------");
        byte a1 = Byte.parseByte("1");
        short a2 = Short.parseShort("2");
        int a3 = Integer.parseInt("3");
        long a4 = Long.parseLong("4");
        float a5 = Float.parseFloat("5.5");
        double a6 = Double.parseDouble("6.6");
        System.out.println("total=" + (a1 + a2 + a3 + a4 + a5 + a6));
        
        
        
        
        
        
        
        
    }
    
}
