/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package network_tcp_ip_socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketAddress;

/**
 *
 * @author rylle
 */
public class NETWORK_TCP_IP_SOCKET_CLIENT {
static String message = "";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        System.err.print("Enter Your Name:");
        InputStreamReader client_input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(client_input);
        String name = reader.readLine();
        
        //Create Client Socket for Connection and Connect to the Server Connection
        Socket client = new Socket("127.0.0.1", 2023);
                    
        //Send Data to Server
        //DataOutputStream data_to_server = new DataOutputStream(client.getOutputStream());
        //String a = "GET /dashboard/ HTTP/1.0\r\n\r\nHost: localhost\r\n";
        //data_to_server.write(a.getBytes());
        //data_to_server.flush();
        PrintWriter a = new PrintWriter(client.getOutputStream());
        a.write("Awd");
        a.flush();
        
        //Receive All Incoming Data from Server
        DataInputStream data_from_server = new DataInputStream(client.getInputStream());
        byte readAllBytes = data_from_server.readByte();
        System.err.println(readAllBytes);
        //System.out.println(new String(new byte[]{data_from_server.readAllBytes()[0]}, "US-ASCII"));
        
        /*
        System.err.print("Enter Your Message[Type Q to Quit]:");
        InputStreamReader client_input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(client_input);
        String message = reader.readLine();*/
    }
    
}
