/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopstatement;

/**
 *
 * @author rylle
 */
public class LoopStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 10; i++) {
            System.err.println(i);
        }
        System.err.println("---------------");
        Boolean bool = true;
        while(bool){
            System.err.println("while loop");
            bool = false;
        }
        System.err.println("---------------");
        
        Boolean bool_ph1 = true;
        do {            
            System.err.println("Do While Loop");
            bool_ph1 = false;
        } while (bool_ph1);
        System.err.println("---------------");
    }
    
}
