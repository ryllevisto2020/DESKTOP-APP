/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author rylle
 */
public class loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-----------For Loop--------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        System.out.println("-----------For Loop--------------");
        String arr[] = {"1","2","3"};
        for (String arrString : arr) {
            System.out.println(arrString);
        }
        
        System.out.println("-----------While Loop--------------");
        int count=0;
        while (count < 10) {            
            System.out.println(count);
            count++;
        }
        
        System.out.println("-----------DoWhile Loop--------------");
        int count_one=0;
        do {            
            System.out.println(count_one);
            count_one++;
        } while (count_one < 10);
    }
}
