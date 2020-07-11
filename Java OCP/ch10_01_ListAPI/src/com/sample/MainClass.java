/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        ArrayList objList = new ArrayList();
        //新增元素 add()
        objList.add(100);
        objList.add(1.23);
        objList.add(100);
        objList.add(true);
        objList.add("Java");
        objList.add('A');
        System.out.println("objList：" + objList);
        //取值 get(index)
        System.out.println((double)objList.get(1) * 100); //取出時必須轉型回原來型別才可以使用
        System.out.println("------------------");
        
        ArrayList<String> strList = new ArrayList<>();
        //strList.add(100);
        strList.add("Java");
        strList.add("Android");
        strList.add("Python");
        strList.add(new String(new char[]{'J', 'a', 'v', 'a'}));
        System.out.println("strList：" + strList);
        System.out.println("strList資料個數：" + strList.size());
        strList.add(2, "MySQL");
        
        for(int i=0; i<strList.size(); i++){
            System.out.printf("%s | ", strList.get(i));
        }
        System.out.println("\n------------------");
        
        System.out.println("strList.indexOf(\"C#\")：" + strList.indexOf("C#"));
        System.out.println("strList.indexOf(\"Java\")：" + strList.indexOf("Java"));
        System.out.println("strList.indexOf(\"Java8\")：" + (strList.indexOf("Java8")>=0 ? strList.indexOf("Java8"):"找不到指定元素"));
        System.out.println("strList.remove(2)：" + strList.remove(2));
        System.out.println("strList.remove(\"Java\")：" + strList.remove("Java"));

        for(String s : strList){
            System.out.printf("%s | ", s);
        }
        System.out.println("\n------------------");
        //清空
        strList.clear();
        System.out.println("strList：" + strList);
        System.out.println("空集合 strList.isEmpty()：" + strList.isEmpty());
        
        System.out.println("------------------");
        
        String[] nums = {"one", "two", "three"};
        
        List<String> numList = Arrays.asList(nums);
        System.out.println("numList：" + numList);
        // numList.removeIf(s -> s.equals("one"));
        ArrayList<String> numArrayList = new ArrayList(numList);
        System.out.println("numArrayList：" + numArrayList);
        numArrayList.removeIf(s -> s.equals("one"));
        System.out.println("numArrayList：" + numArrayList);
        
//        for(int i=0; i<numArrayList.size(); i++){
//            numArrayList.set(i, numArrayList.get(i).toUpperCase());
//        }

        numArrayList.replaceAll(s -> s.toUpperCase()); //等同 78-80
        System.out.println("numArrayList：" + numArrayList);
        
        
        
        
    }
    
}
