/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

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
        Person person1 = new Person.Builder().name("Amy").build();
        System.out.println("person1：" + person1);
        
        Person person2 = new Person.Builder()
                                   .email("tom@xxx.xxx")
                                   .name("Tom")
                                   .phone("07-2371933")
                                   .age(20)
                                   .city("台北")
                                   .build();
        System.out.println("person2：" + person2);
        
        System.out.println("-----------------------");
        
        List<Person> list = Person.createPersonList();
        for(Person person : list){
            System.out.println(person);
        }
        System.out.println("-----------------------");
        
        list.forEach( p -> System.out.println(p));
        System.out.println("-----------------------");
        list.stream()
            .filter(p -> p.getCity().equals("高雄"))    //中間操作
            .forEach(p -> System.out.println(p));       //終端操作
        
        System.out.println("-----------------------");
        list.stream()
            .filter(p -> p.getAge() % 2 == 0)
            .forEach(p -> System.out.println(p));
    }
    
}
