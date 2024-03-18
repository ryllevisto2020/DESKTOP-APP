/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bufferedreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rylle
 */
public class BufferedReader_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //Read user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.err.print("Input your name: ");
        String name = br.readLine();
        System.err.println("your name is: "+name);
        
        //Read file
        BufferedReader br_file = new BufferedReader(new FileReader("reader.txt"));
        //System.err.println(br_file.readLine()); //=> read one line only
        
        //To read another line
        String line;
        while ((line = br_file.readLine())!=null) {            
            System.err.println(line);
        }
    }
    
}
