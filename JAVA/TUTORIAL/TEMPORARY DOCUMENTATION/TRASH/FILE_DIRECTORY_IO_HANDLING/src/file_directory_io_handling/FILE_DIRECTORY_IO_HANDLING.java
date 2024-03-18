/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package file_directory_io_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

/**
 *
 * @author rylle
 */
public class FILE_DIRECTORY_IO_HANDLING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //FILE HANDLING
        //OPEN FILE
        File file = new File("file.txt");
        //CHECK FILE IF EXIST
        if (file.exists()) {
            //CREATE NEW FILE
            file.createNewFile();
        }else{
            //WRITE FILE
            FileWriter FW = new FileWriter(file);
            FW.write("WRITE TEXT");
            FW.close();
        }
        
        //READ FILE
        BufferedReader BR = new BufferedReader(new FileReader(file));
        System.err.println(BR.readLine());
        BR.close();
        
        //DELETE FILE
        file.delete();
        //--------------------------------------------------------------------//
        //DIRECTORY HANDLING
        File dir = new File("visto");
        
        //CREATE DIRECTORY
        dir.mkdir();
        
        //DELETE DIRECTORY
        dir.delete();
        //--------------------------------------------------------------------//
        //INPUT/OUTPUT HANDLING
        
    }
}
