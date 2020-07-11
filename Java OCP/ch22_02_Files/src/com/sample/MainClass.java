/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        Path source = Paths.get("c:/com/sample/java/hello.txt");
        Path tage = Paths.get("c:", "com", "example", "python", "hi.txt");
        System.out.println("source --> " + source);
        System.out.println("tage --> " + tage);
        
        try {
            Files.createDirectories(source.getParent());
            Files.createDirectories(tage.getParent());
            
            if(Files.exists(source)){
                System.out.println(source.getFileName() + " 檔案已存在!");
            }else{
                Files.createFile(source);
                System.out.println(source.getFileName() + " 檔案建立完成!");
            }
            
            if(Files.isWritable(source)){
                System.out.println(source.getFileName() + " 檔案可寫...");
                ArrayList<String> list = new ArrayList<>();
                list.add("Java SE 8");
                list.add("巨匠電腦");
                list.add(LocalDateTime.now().toString());
                list.add("--------------------------------------------------");
                Files.write(source, list, StandardOpenOption.APPEND);
                
            }else{
                System.out.println(source.getFileName() + " 檔案不可寫...");
            }
            
            
            //Files.copy(source, tage, StandardCopyOption.REPLACE_EXISTING);
            //Files.move(source, tage, StandardCopyOption.REPLACE_EXISTING);
            //Files.delete(tage);
            
            Path tage_test = Paths.get("c:\\com\\test\\java.txt");
            
            //Files.copy(source, tage_test, StandardCopyOption.REPLACE_EXISTING);
            //java.nio.file.NoSuchFileException 資料夾不存在
            
            //Files.delete(source.getParent());
            //java.nio.file.DirectoryNotEmptyException 刪除的資料夾不為空
            
            //--------------------------------
            String url = "https://www.andremotz.com/wp-content/uploads/2014/07/Javafx_logo_color-672x372.png";
            URI uri = URI.create(url);
            Path imagePath = Paths.get("java.png");
            try(InputStream is = uri.toURL().openStream()){
                Files.copy(is, imagePath, StandardCopyOption.REPLACE_EXISTING);
            }
            
            System.out.println("------------------------------------------");
            try(Stream<Path> files = Files.list(Paths.get("."))){
                files.forEach(System.out::println);
            }
            System.out.println("------------------------------------------");
            try(Stream<Path> files = Files.walk(Paths.get("."))){
                files.forEach(System.out::println);
            }
            System.out.println("------------------------------------------");
            try(BufferedReader br = new BufferedReader(new FileReader(source.toFile()))){
                br.lines().forEach(System.out::println);
            }
            System.out.println("===========================================");
            try(Stream<String> lines = Files.lines(source)){
                lines.forEach(System.out::println);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
    }
    
}
