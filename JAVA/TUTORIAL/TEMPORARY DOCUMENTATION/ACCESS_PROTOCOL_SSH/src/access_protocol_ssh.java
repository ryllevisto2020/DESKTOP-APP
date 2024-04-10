
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author rylle
 */
public class access_protocol_ssh {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws JSchException, IOException, InterruptedException {
        // TODO code application logic here
        
        JSch ssh = new JSch();
        
        Session session = ssh.getSession("admin", "192.168.0.1",22);
        session.setConfig("StrictHostKeyChecking", "no");
        session.connect();
        
        ChannelExec channel = (ChannelExec) session.openChannel("exec");
        channel.setCommand(":put [/ip address print]");
        ByteArrayOutputStream response = new ByteArrayOutputStream();
        channel.setOutputStream(response);
        channel.connect();
        
        while (channel.isConnected()) {
            Thread.sleep(100);
            String responseString = new String(response.toByteArray());
            System.err.println(responseString);
        }
        
    }
}
