/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jakes
 */
public class Tarea4 {

    public static void main(String[] args) {
        
        AddressBook myAddressBook = new AddressBook(); 
        
        myAddressBook.Create(); 
        myAddressBook.load();
        myAddressBook.list(); 
        
}  
}  
