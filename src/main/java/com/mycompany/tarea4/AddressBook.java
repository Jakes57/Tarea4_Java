/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea4;

/**
 *
 * @author jakes
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddressBook {
    HashMap<String,String> directorio = new HashMap<String,String>();
    
    
    public String Create(){
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Nombre del contacto");
    String nombre = scanner.nextLine();
    System.out.println("Telefono del contacto"); 
    String telefono = scanner.nextLine();  
    
     directorio.put(nombre,telefono); 
    
    System.out.println(directorio); 
        return null;
    } 
    
    public void load () throws FileNotFoundException, IOException {
        //Cargara los contactos del archivo
      
        String line;
        try {
             File file = new File("text/contacts.txt");
             if(file.exists()) {
                 BufferedReader reader = new BufferedReader(new FileReader("text/contacts.txt"));
                 while ((line = readLine()) !=null){
                     String[] parts = line.split(":", 2);
                     String key = parts[0];
                     String value = parts [1];
                     contactsMap.put(key, value); 
                     
                 }
             }
        }
        else{ 
                file.createNewfile(); 
                }
        throw new RuntimeException(e);  
    }
}
    
    public void delete() {
        //Borra un contacto
        Scanner scanner = new Scanner(System.in);
       
        directorio.remove(scanner.nextLine());
        
        return null;
        
        
    }
    
    public void list() {
        //muestra los contactos de la agenda
        
        for(String i : directorio.keySet()) {
            System.out.print(i+" "+": ");
            System.out.println(directorio.get(i));
        } 
        return null;
    }
} 

      

      
        
    
    
    
    
        

    
 
    
 
    

    
    
    
    
    
    
    
    
    
    
    

