/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author reddirani.battuluri
 */
public class Serializaion implements Serializable{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name="john";
        e.address="dslkjf";
        e.SSN=123;
        e.number=342;
        try {
//            FileOutputStream fos = new FileOutputStream("C:\\Users\\reddirani.battuluri\\Documents\\Training\\7-Java SE\\Workspaces\\JavaApps_Lesson10\\JavaIO\\src\\training\\iqgateway\\sam.txt");
//            ObjectOutputStream ous = new ObjectOutputStream(fos);
//            ous.writeObject(e);
//            ous.close();
//            fos.close();
              
            FileInputStream fis = new FileInputStream("C:\\\\Users\\\\reddirani.battuluri\\\\Documents\\\\Training\\\\7-Java SE\\\\Workspaces\\\\JavaApps_Lesson10\\\\JavaIO\\\\src\\\\training\\\\iqgateway\\\\sam.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
           e = (Employee)ois.readObject();
           System.out.println(e.name);
        } catch (Exception ex) {
            Logger.getLogger(Serializaion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

class Employee implements java.io.Serializable {
   private static final long serialVersionUID = 1L;
   public String name;
   public String address;
   public transient int SSN;
   public int number;
   
  
}
