/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package system_process;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rylle
 */
public class SYSTEM_PROCESS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO code application logic here
        
        //CREATE BUILDER
        ProcessBuilder process_builder = new ProcessBuilder();
       
        //CREATE COMMAND
        List<String> command = new ArrayList<>();
        command.add("notepad.exe");
        process_builder.command(command);
        
        //CREATE PROCESS
        Process process = process_builder.start();
    }
    
}
