/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package networking_client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author rylle
 */
public class networking_client {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        // TODO code application logic here

        /* Create Socket */
        Socket client = new Socket("127.0.0.1",2030);
        
        /* Create Data Output Stream */
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        
        /* Write Data to Data Output Stream */
        dos.writeUTF("Hello World!");
        
        /* Flust Data from Data Output Stream */
        dos.flush();
        
        /* Close Socket */
        client.close();
    }
}
