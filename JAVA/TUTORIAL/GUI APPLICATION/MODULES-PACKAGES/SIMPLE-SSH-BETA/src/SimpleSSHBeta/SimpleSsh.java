/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package SimpleSSHBeta;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.io.ByteArrayOutputStream;

/**
 *
 * @author rylle
 */
public class SimpleSsh {
    private static String _uname;
    private static String _host;
    private static int _port;
    //Create SSH using JSCH class
    JSch ssh = new JSch();
    
    Session session;
    ChannelExec exec;
    
     //Create Byte Array OutputStream 
    ByteArrayOutputStream response = new ByteArrayOutputStream();
    

    public void setCredentials(String uname,String host,int port){
        //Set SSH Credentials
        _uname = uname;
        _host = host;
        _port = port;
    }
    
    public void sshConnect() throws JSchException{
        
        //Set SSH Session
        session = ssh.getSession(_uname, _host, _port);
        //Set Configuration -> "StringHostKeyChecking" with a value of "no"
        session.setConfig("StrictHostKeyChecking", "no");
        //Connect 
        session.connect();
    }
    
    public void sshExec(String command) throws JSchException, InterruptedException{
        //Create Channel for Exec
        ChannelExec openChannel = (ChannelExec) session.openChannel("exec");
        //Set Command
        openChannel.setCommand(command);
        
        //Set Response in Open Channel OutputStream
        openChannel.setOutputStream(response);
        
        //Connect
        openChannel.connect();
        
        while (openChannel.isConnected()) {            
            Thread.sleep(1500);
        }
    }
    
    public String getOutput(){
        return response.toString();
    }
}
