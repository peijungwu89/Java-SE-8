/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class Person {
    
    //欄位
    private String name;
    private int age;
    private String email;
    private String phone;
    private String city;
    
    //static 內部建構類別
    public static class Builder{
        
        //Builder 欄位
        private String name = "";
        private int age = 0;
        private String email = "";
        private String phone = "";
        private String city = "高雄";
        
        //接收資料方法
        public Person.Builder name(String val){
            this.name = val;
            return this;
        }
        
        public Person.Builder age(int val){
            this. age = val;
            return this;
        }
        
        public Person.Builder email(String val){
            this.email = val;
            return this;
        }
        
        public Person.Builder phone(String val){
            this.phone = val;
            return this;
        }
        
        public Person.Builder city(String val){
            this.city = val;
            return this;
        }
        
        public Person build(){
            return new Person(this);
        }
    }
    
    //私有的 Person 建構子
    private Person(Person.Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
        this.city = builder.city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + age + ", " + email + ", " + phone + ", " + city + "]";
    }
    
    
    //建立集合資料
    public static List<Person> createPersonList() {
        List<Person> list = new ArrayList<>();

        list.add(new Person.Builder()
                .name("Amy")
                .age(20)
                .email("amy@xxx.xxx")
                .phone("1234567")
                .city("高雄")
                .build());
        list.add(new Person.Builder()
                .name("Jackie")
                .age(22)
                .email("kacloe@xxx.xxx")
                .phone("2345678")
                .city("台中")
                .build());
        list.add(new Person.Builder()
                .name("Lisa")
                .age(21)
                .email("lisa@xxx.xxx")
                .phone("3456789")
                .city("高雄")
                .build());
        list.add(new Person.Builder()
                .name("Tom")
                .age(18)
                .email("tom@xxx.xxx")
                .phone("4567891")
                .city("台北")
                .build());
        return list;

    }
    
}
