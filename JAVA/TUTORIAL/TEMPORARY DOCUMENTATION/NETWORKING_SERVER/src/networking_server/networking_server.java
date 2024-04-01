/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package networking_server;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author rylle
 */
public class networking_server {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SocketException, UnknownHostException, IOException {
        // TODO code application logic here
        
        /* Create Server Socket */
        ServerSocket server = new ServerSocket(2030);
        
        /* Create Socket */
        Socket client_accept = server.accept();
        
        /* Create Data Input Stream */
        DataInputStream dis = new DataInputStream(client_accept.getInputStream());
        
        /* Read Data from Data Input Stream */
        System.err.println(dis.readUTF());
        
        /* Close Socket */
        client_accept.close();
        
        /* Close Server Socket */
        server.close();
    }
}
