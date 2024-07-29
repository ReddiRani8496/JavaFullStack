/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author reddirani.battuluri
 */
public class FIO {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\reddirani.battuluri\\Documents\\TMSTables.txt");
//            System.out.println(fis.available());
//            byte[] data = new byte[fis.available()];
//            fis.read(data);
//            String str = new String(data);
//            System.out.println(str);
            BufferedInputStream bis = new BufferedInputStream(fis);
            int b;
            while((b=bis.read())!=-1)
                System.out.print((char)b);
                    
        
//            FileOutputStream fos = new FileOutputStream("C:\\Users\\reddirani.battuluri\\Documents\\temp.txt");
//            fos.write(data);
//            System.out.println("succefully data writen to file");
//            fos.close();
            fis.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
            
            
    
}
