/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rylle
 */
public class fileHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        File file = new File("E:\\PROJECT - SCRATCH\\PRACTICE CODE\\JAVA\\JavaApplication2\\text.txt");
        if(file.exists()){
            System.out.println("Exist");
        }else{
            file.createNewFile();
            System.out.println("Not Exist");
        }
        
        try (FileWriter writer = new FileWriter(file)) {
            
            writer.write("awd");
        }
        
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null){            
            System.out.println(line);
        }
    }
}
