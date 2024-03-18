/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jserialcomm;
import com.fazecast.jSerialComm.*;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author rylle
 */
public class Jserialcomm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //GET ALL AVAILABLE COM PORT
        SerialPort ports[] = SerialPort.getCommPorts();
        for (SerialPort serialPort : ports) {
            System.out.println(serialPort.getSystemPortName());
        }
        
        //CHEK IF COM PORT IS OPEN
        SerialPort port = ports[1];
        if (port.openPort()) {
            System.out.println("\nCOM PORT IS OPEN!");
        }else{
            System.out.println("\nCOM PORT IS NOT OPEN!");
        }
        
        port.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 0, 0);
        Scanner data = new Scanner(port.getInputStream());
        while(data.hasNextLine()) {
           
            
            String number = "";
            try{
                number = data.nextLine();
            }catch(Exception e){
            }
            System.err.println(number);
        }
        
        
        //SET COM PORT
        
        
        
         // determine which serial port to use
               /* SerialPort ports[] = SerialPort.getCommPorts();
                System.out.println("Select a port:");
                int i = 1;
                for(SerialPort port : ports) {
                        System.out.println(i++ + ". " + port.getSystemPortName());
                }
                Scanner s = new Scanner(System.in);
                int chosenPort = s.nextInt();

                // open and configure the port
                SerialPort port = ports[chosenPort - 1];
                if(port.openPort()) {
                        System.out.println("Successfully opened the port.");
                } else {
                        System.out.println("Unable to open the port.");
                        return;
                }
                port.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 0, 0);
               
                // enter into an infinite loop that reads from the port and updates the GUI
                Scanner data = new Scanner(port.getInputStream());
                while(data.hasNextLine()) {
                        String number;
                        try{
                            number = data.nextLine();
                        }catch(Exception e){
                        }
                        System.err.println("awd");
                }*/
         
    }
    
}
