/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package SimpleSSHBeta;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import java.io.IOException;

/**
 *
 * @author rylle
 */
public class testing {
    private static JSch ssh = new JSch();
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws JSchException, IOException, InterruptedException {
        // TODO code application logic here
        SimpleSsh ssh = new SimpleSsh();
        
        ssh.setCredentials("admin","192.168.0.1", 22);
        ssh.sshConnect();
        ssh.sshExec("/ip address print");
        String output = ssh.getOutput();
        System.err.println(output);
    }
}
