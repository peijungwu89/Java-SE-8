/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        Stream<Integer> s1 = Arrays.asList(1, 2, 3, 4, 5).stream();
        System.out.println("s1：" + s1);
        s1.forEach(System.out::println);
        System.out.println("-------------");
        
        Stream<String> s2 = Stream.of("A", "B", "C");
        System.out.println("s2：" + s2);
        s2.forEach(s -> System.out.printf("%s | ", s));
        System.out.println("\n-------------");

        //Stream<Double> s3 = Arrays.stream(new Double[]{1.0, 2.0, 3.0});
        DoubleStream s3 = Arrays.stream(new double[]{4.0, 5.0, 6.0});//功能同上
        System.out.println("s3：" + s3);
        s3.forEach(d -> System.out.printf("%.2f | ", d));
        System.out.println("\n-------------");
        
        IntStream s4 = Stream.of("A1", "B2", "C3")
                .map(s -> s.substring(1))
                .mapToInt(s -> Integer.parseInt(s));
        s4.forEach(i -> System.out.printf("%3d", i));
        System.out.println("\n-------------");
        
        Stream.of("A1", "B2", "C3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .forEach(i -> System.out.printf("%3d", i));
        
        System.out.println("\n-------------");
        
        int sum_1 = Stream.of("A1", "B2", "C3")
                .map(s -> s.substring(1))
                .mapToInt(s -> Integer.parseInt(s))
                .sum();
        System.out.println("sum_1：" + sum_1);
        
        System.out.println("-------------");
        
        Stream<String> s5 = Stream.of("java", "python", "c#", "android", "mysql", "c")
                .peek(s -> System.out.printf("1. %s%n", s))
                .filter(s -> s.length() > 3)
                .peek(s -> System.out.printf("2. %s%n", s))
                .map(String::toUpperCase)
                .peek(s -> System.out.printf("3. %s%n", s));
        int count = s5.toArray().length;        
        System.out.println("count：" + count);
//        s5.forEach(System.out::println);        
        System.out.println("-------------");
        
        Stream.of("java", "python", "c#", "android", "mysql", "c")
                .peek(s -> System.out.printf("1. %s%n", s))
                .filter(s -> s.length() > 3)
                .peek(s -> System.out.printf("2. %s%n", s))
                .map(String::toUpperCase)
                .peek(s -> System.out.printf("3. %s%n", s))
                .forEach(s -> System.out.printf("4. %s%n", s));
        
        System.out.println("-------------");
        
        List<String> list = Arrays.asList("java", "python", "c#", "android", "mysql", "c");
        System.out.println("排序前：" + list);
        list.stream()
            //.sorted() //自然排序
            .sorted(String::compareTo)    //同上一行 .sorted()
            .forEach(s -> System.out.printf("%s | ", s));
        System.out.println("\n-------------");
        System.out.println("排序後：" + list);
        System.out.println("-------------");
        
        list.stream()
            .sorted((x1, x2) -> x1.compareTo(x2) * -1)
            .forEach(s -> System.out.printf("%s | ", s));
        
        System.out.println("\n-------------");
        
        Comparator<Book> compBook = Comparator
                                        .comparing(Book::getPrice)       //先比較價格
                                        .thenComparing(Book::getName);   //再比較書名
        
        List<Book> bookList = Book.createBookList();
        bookList.stream()
                .sorted(compBook)
                .forEach(System.out::println);
        System.out.println("-------------");
        
        List<String> listA = Arrays.asList("A1", "A2", "A3");
        List<String> listB = Arrays.asList("B1", "B2", "B3");
        List<String> listC = Arrays.asList("C1", "C2", "C3");
        List<String> listD = Arrays.asList("D1", "D2", "D3");
        
        List<List<String>> listAll = new ArrayList<>();
        listAll.add(listA);
        listAll.add(listB);
        listAll.add(listC);
        listAll.add(listD);
        System.out.println(listAll);
        
        List<String> listTest = new ArrayList<>();
        for(List<String> temp: listAll){
            for(String s : temp){
                listTest.add(s);
            }
        }
        System.out.println("listTest：" + listTest);
        List<String> list_flatMap = listAll.stream()
                                           .flatMap(l -> l.stream())
                                           .collect(Collectors.toList());
        System.out.println("list_flatMap：" + list_flatMap);
        System.out.println("-------------");
        
        long count_1 = Stream.of("java", "python", "c#", "android", "mysql", "c").count();
        System.out.println("count_1 = " + count_1 );
        
        OptionalInt oi = Stream.of(5, 10, 15, 20, 25, 30, 5)
                               .mapToInt(i -> i)
                               //.min();
                               .max();                               
        System.out.println("oi = " + oi.getAsInt());
        int sum_2 = Stream.of(5, 10, 15, 20, 25, 30, 5).mapToInt(i -> i).sum();
        System.out.println("sum_2 = " + sum_2);
        double sum_3 = Stream.of(5.0, 10.0, 15.0, 20.0, 25.0, 30.0, 5.456).mapToDouble(d -> d).sum();
        System.out.println("sum_3 = " + sum_3);
        double average = Stream.of(5, 10, 15, 20, 25, 30, 5).mapToInt(i -> i).average().getAsDouble();
        System.out.println("average = " + average);
        Stream.of(5, 10, 15, 20, 25, 30, 5).mapToInt(i -> i).average().ifPresent(System.out::println);
      
        
    }
}
