
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

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
        
        Socket sock = new Socket("127.0.0.1", 2030);
        
        System.err.println(sock.getRemoteSocketAddress());
        
        DataOutputStream outputStream = new DataOutputStream(sock.getOutputStream());
        
        outputStream.writeUTF("Hello this is client");
    }
}
