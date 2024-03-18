/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package IO_HANDLING;
import java.io.*;
import java.util.Scanner;
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
        
        /*
        
        1. Import java.io.* packages
        
        Input -> Read Data
        Output -> Write Data
        
        */
        
        /* Scanner Class */
        Scanner scan = new Scanner(System.in);
        System.err.print("Enter Your Name: ");
        String name = scan.nextLine();
        System.err.println("Your Name is "+name);
        
        System.err.println();
        
        /* BufferedInputStream */
        BufferedInputStream bis = new BufferedInputStream(System.in);
        System.err.print("Enter Your Name: ");
        int bis_data ;
        while ((bis_data = bis.read())!=10) {            
            System.err.println(bis_data);
        }
        
        System.err.println();
        
        /* DataInputStream */
        DataInputStream dis = new DataInputStream(System.in);
        System.err.print("Enter Your Name: ");
        int dis_data ;
        while ((dis_data=dis.read())!=10) {            
            System.err.println(dis_data);
        }
        
        System.err.println();
        
        /* ByteArrayInputStream */
        byte[] buf = new byte[2];
        buf[0] = 1;
        buf[1] = 2;
        ByteArrayInputStream bais = new ByteArrayInputStream(buf);
        for (byte readAllByte : bais.readAllBytes()) {
            System.err.print(readAllByte);
            System.err.print(",");
        }
        
        System.err.println();
        System.err.println();
        
        /* FileInputStream */
        FileInputStream fis = new FileInputStream("fis.txt");
        for (byte readAllByte : fis.readAllBytes()) {
            System.err.print(readAllByte);
            System.err.print(",");
        }
    }
}
