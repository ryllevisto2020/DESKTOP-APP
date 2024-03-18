/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author rylle
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        File path = new File("");
        String filePath = path.getAbsolutePath();
        
        //Load File
        File file = new File(filePath+"\\build - Copy.xml");
        //Read File
        FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String line;
        while ((line = br.readLine())!=null) {            
            System.err.println(line);
        }
        //Write File
        FileWriter writer = new FileWriter(file);
        writer.write("hello World");
        writer.close();
    }
    
}
