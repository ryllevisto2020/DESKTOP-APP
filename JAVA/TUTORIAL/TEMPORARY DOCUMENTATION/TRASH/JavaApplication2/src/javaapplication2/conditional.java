/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author rylle
 */
public class conditional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0;
        System.out.println("-----------If--------------");
        if(count == 0){
            System.out.println("true");
        }
        
        System.out.println("-----------If...Else--------------");
        int count_one = 1;
        if(count == 0){
            System.out.println("true");
            if (count_one == 0) {
                
            }else{
                System.out.println("false");
            }
        }
        
        System.out.println("-----------Switch--------------");
        switch (count) {
            case 0 -> System.out.println("choose\s"+count);
            default -> throw new AssertionError();
        }
    }
    
}
