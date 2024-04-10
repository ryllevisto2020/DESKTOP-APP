
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import org.apache.commons.io.input.ReaderInputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author rylle
 */
public class io_handling {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        // TODO code application logic here

        System.err.print("Name:");
        java.io.BufferedInputStream buff = new BufferedInputStream(System.in);
        
        InputStreamReader isr = new java.io.InputStreamReader(buff); //-> CONVERT INPUTSTREAM TO READER
        java.io.BufferedReader br = new BufferedReader(isr);
        
        System.err.println(br.readLine()+"\n");
        
        /*********************************************/
        
        byte[] buff_name_ascii = {118,105,115,116,111}; //-> ASCII DECIMAL VALUE
        byte[] buff_name = "visto".getBytes(); 
        java.io.ByteArrayInputStream bytes = new ByteArrayInputStream(buff_name);
        
        InputStreamReader isr_a = new java.io.InputStreamReader(bytes);
        java.io.BufferedReader br_a = new BufferedReader(isr_a);
        
        System.err.println(br_a.readLine()+"\n");
        
        /*********************************************/
        
        File file = new File("E:\\PROJECT - SCRATCH\\PRACTICE CODE\\2 DESKTOP APP AND CLI APP\\JAVA\\TUTORIAL\\TEMPORARY DOCUMENTATION\\IO_HANDLING\\PL LIST.txt");
        java.io.FileReader file_read = new FileReader(file);
        
        org.apache.commons.io.input.ReaderInputStream ris = new ReaderInputStream(file_read); //-> CONVERT READER TO INPUTSTREAM
        
        byte[] readAllBytes = ris.readAllBytes();
        for (byte readAllByte : readAllBytes) {
            System.err.println(readAllByte);
        }
    }
}
