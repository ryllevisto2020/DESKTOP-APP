/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author rylle
 */
public class AccessConfigProperties {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        //For Dynamic Settings
        Properties properties = new Properties();
        String file ="E:\\PROJECT - SCRATCH\\PRACTICE CODE\\JAVA\\JavaApplication2\\src\\config.properties";
        FileInputStream FIS = new FileInputStream(file);
        FileOutputStream FOS = new FileOutputStream(file);
        properties.load(FIS);
        properties.setProperty("url", "test");
        properties.save(FOS, file);
    }
}
