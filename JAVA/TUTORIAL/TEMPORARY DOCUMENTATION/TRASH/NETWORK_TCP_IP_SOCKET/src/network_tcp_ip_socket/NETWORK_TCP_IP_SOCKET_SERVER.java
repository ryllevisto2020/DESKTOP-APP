/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package network_tcp_ip_socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import static network_tcp_ip_socket.NETWORK_TCP_IP_SOCKET_SERVER.accept;
import static network_tcp_ip_socket.NETWORK_TCP_IP_SOCKET_SERVER.line;
import static network_tcp_ip_socket.NETWORK_TCP_IP_SOCKET_SERVER.server;
/**
 *
 * @author rylle
 */
public class NETWORK_TCP_IP_SOCKET_SERVER {
static String line = "";
static ServerSocket server;
static Socket accept;
static DataInputStream data_from_client;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        while(true){
            try {
                //Create Server Socket for Connection
                server = new ServerSocket(2023);
            } catch (Exception e) {
            }

            //Accept All Incoming Connection to Server
            accept = server.accept();
        
            new server_thread(accept);
        }
    }
    
}

class server_thread implements Runnable{

    public server_thread(Socket client_socket) throws IOException {
        DataInputStream data_from_client = new DataInputStream(client_socket.getInputStream());
        System.err.println(data_from_client.readUTF());
        while(!line.equals("Q")){
            System.err.println(data_from_client.readUTF());
        }
    }
    
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}