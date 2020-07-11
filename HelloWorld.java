/*
   多行註解 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//單行註解
//套件區：分類管理類別
package com.sample;

//import區：引用外部套件
import java.util.Date;

/**
 *
 * @author student
 */
//類別區
public class MainClass {

    /**
     * @param args the command line arguments
     */
    //主方法：程式進入點
    public static void main(String[] args) {
        // TODO code application logic here
        //敘述句，需要用【;】結束
        System.out.println("Hello! World!");
        //                 建立日期時間物件 
        System.out.println(new Date());
        
        //取得 args 陣列中的元素顯示
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[1] + args[2]);
    }
    
}

/*
多行註解
不可以使用巢狀註解
	
    1.命名規則
      A.符號 A~Z a~z 0~9 _(底線) $       <<數字不可以是第一個符號 如：6test>>
        合法命名： Hello ,id ,$name ,C_TABLE01
      B.套件 com.gjun.sample
      C.類別、介面  Hello    HelloWorld 
      D.方法、變數  name   setName  getUserName
      E.常數  PI  USER_TABLE  
	  
    2.程式說明：        
	A.package
            管理分類類別，用來宣告該檔案中的類別是屬於哪一個Package(類別庫)，必須寫在程式的第一行
	B.import 
            引用現成API或廠商或自己開發類別，必須先宣告在import區，讓編譯器找到這些類別所在的位置		
        C.宣告類別
            [封裝修飾字] [abstract|final] class 類別名稱 [extends 父類別] [implements 介面名稱]{
                //...
            }
            public 存取修飾字，表示公開用
            class 關鍵字
            MainClass 類別名稱
            [注意]：類別若宣告public，則存檔時的主檔名必須與類別名稱相同
                  一個java檔案可以有多的類別宣告，但只有一個可以宣告public
		
	D.宣告主方法：類別成員，程式進入點
            main 方法名稱
            static 代表main方法直接載入至Global記憶體被執行
            void 代表方法無回傳值
            String[] args 方法參數列：String[] 字串陣列，args 陣列名稱，在此用來接收命令列傳入的參數
			
*/
