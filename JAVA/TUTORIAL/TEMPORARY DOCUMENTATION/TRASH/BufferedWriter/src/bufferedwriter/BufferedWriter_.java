/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import static java.lang.System.out;

/**
 *
 * @author rylle
 */
public class BufferedWriter_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //Write to your file
        Writer write_file = new FileWriter("writer.txt");
        BufferedWriter bw_file;
        bw_file = new BufferedWriter(write_file);
        bw_file.write("This is Writer");
        bw_file.close();
        
        //Write text instead of System.out.print
        Writer write_out = new PrintWriter(System.out);
        BufferedWriter bw_out;
        bw_out = new BufferedWriter(write_out);
        bw_out.write("This is Writer w/o using System.out\n");
        bw_out.close();
    }
    
}
