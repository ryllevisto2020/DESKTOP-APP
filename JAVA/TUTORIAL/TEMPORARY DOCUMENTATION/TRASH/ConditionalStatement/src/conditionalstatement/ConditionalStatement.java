/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conditionalstatement;

/**
 *
 * @author rylle
 */
public class ConditionalStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean bool = true;
        if(bool){
            System.err.println("IF condition");
        }
        System.err.println("---------------");
        
        boolean bool_ph1 = false;
        if(bool_ph1){
            System.err.println("IF condition");
        }else{
            System.err.println("ELSE condition");
        }
        System.err.println("---------------");
        
        int pin = 1;
        switch (pin) {
            case 1:
                System.err.println("SWITCH condition");
                break;
            case 2:
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
