
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author rylle
 */
public class networking_server {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        // TODO code application logic here
        
        ServerSocket server = new ServerSocket(2030);
        
        Socket client = server.accept();
        
        System.err.println(client.getRemoteSocketAddress());
        
        DataInputStream outputStream = new DataInputStream(client.getInputStream());
        
        System.err.println(outputStream.readUTF());
    }
}
