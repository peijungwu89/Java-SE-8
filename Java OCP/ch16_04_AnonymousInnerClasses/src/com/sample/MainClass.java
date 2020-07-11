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
        CTest ct1 = new CTest();
        ct1.doTest();
        
        System.out.println("------------");
        ITest it1 = new ITest(){
            @Override
            public void doTest() {
                System.out.println("it1 匿名內部類別 doTest()...");
            }
        };
        it1.doTest();
        System.out.println("----------------------");
        ITest it2 = () -> System.out.println("it2 Lambda doTest()...");
        it2.doTest();
        
        System.out.println("----------------------");
//        ContainsAnalyzer containsAnalyzer = new ContainsAnalyzer();
//        System.out.println("containsAnalyzer：" + containsAnalyzer.analyze("Java SE 8", "SE"));
//        System.out.println("----------------------");
//        StartWithAnalyzer startWithAnalyzer = new StartWithAnalyzer();
//        System.out.println("startWithAnalyzer：" + startWithAnalyzer.analyze("Python 3.8", "Py"));
//        System.out.println("----------------------");
        StringAnalyzer sa1 = (t, s) -> t.contains(s);
        System.out.println("sa1：" + sa1.analyze("Java SE 8", "SE"));
        
        System.out.println("-----------");
        StringAnalyzer sa2 = (t, s) -> t.startsWith(s);
        System.out.println("sa2：" + sa2.analyze("Python 3.8", "Py"));
        
        System.out.println("-----------");
        Analyzer<String> analyzer1 = (a, b) -> a.contains(b);
        System.out.println("analyzer1：" + analyzer1.analyze("Java SE 8", "SE"));
        
        Analyzer<Integer> analyzer2 = (x, y) -> x > y;
        System.out.println("analyzer2：" + analyzer2.analyze(10, 20));
        
        
    }   
}

@FunctionalInterface
interface ITest{
    void doTest();    
}

class CTest implements ITest{
    
    @Override
    public void doTest() {
        System.out.println("CTest doTest()...");
    }   
    
}

//-------------------------------------
@FunctionalInterface
interface StringAnalyzer{
    public boolean analyze(String sourceStr, String searchStr);
}

//class ContainsAnalyzer implements StringAnalyzer {
//    @Override
//    public boolean analyze(String target, String searchStr){
//        return target.contains(searchStr);
//    }
//}
//
//class StartWithAnalyzer implements StringAnalyzer{
//
//    @Override
//    public boolean analyze(String target, String searchStr) {
//        return target.startsWith(searchStr);
//    }    
//}

//-----------------------------
//泛型
@FunctionalInterface
interface Analyzer<T>{
    public boolean analyze(T t1, T t2);
}