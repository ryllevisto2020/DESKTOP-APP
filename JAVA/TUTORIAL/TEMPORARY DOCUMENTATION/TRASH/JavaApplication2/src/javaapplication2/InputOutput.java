/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author rylle
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("-----------Scanner--------------");
        Scanner scan = new Scanner(System.in);
        System.out.print("Name:");
        String name = scan.nextLine();
        System.out.println("Name:"+name);
        
        System.out.println("-----------BufferedReader--------------");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Name:");
        String name_one = reader.readLine();
        System.out.println("Name:"+name_one);
    }
    
}
