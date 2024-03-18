/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fundamentals_and_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author rylle
 */
public class FUNDAMENTALS_AND_BASIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //COLLECTION
        System.err.println("---COLLECTION---");
        Integer array[] = new Integer[1];
        array[0]=1;
        System.err.println("Basic Array: "+array[0]);
        
        ArrayList<String> array_list = new ArrayList<>();
        array_list.add("Array 1");
        array_list.add("Array 2");
        System.err.println("ArrayList<E>: "+array_list);
        
        Dictionary<String,String> dictionary = new Hashtable<>();
        dictionary.put("Key 1","Value 1");
        dictionary.put("Key 2", "Value 2");
        System.err.println("Dictionary<K,V>: "+dictionary);
        
        Map<String,String> map =new HashMap<>();
        map.put("Key 1", "Value 1");
        map.put("Key 2","Value 2");
        System.err.println("Map<K,V>: "+map);
        
        //LOOP
        System.err.println("---LOOP---");
        for (int i = 0; i < 2; i++) {
            System.err.println("For Loop: "+i);
        }
        
        int i=0;
        while ( i < 2) {            
            System.err.println("While Loop: "+i);
            i++;
        }
        
        int i_=0;
        do {            
            System.err.println("Do While Loop: "+i_);
            i_++;
        } while (i_ < 2);
        
        //USER INPUT AND OUTPUT
        System.err.println("---USER INPUT AND OUTPUT---");
        Scanner input_scanner = new Scanner(System.in);
        System.err.print("Enter Your Name: ");
        String name_scanner = input_scanner.next();
        System.err.println("Scanner: "+name_scanner);
        
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        System.err.print("Enter your Name: ");
        String name_br = BR.readLine(); // Bufferedreader Can't Read integer so we need to Parse/Convert the String to Int Data Type
        System.err.println("BufferedReader: "+name_br);
        
        //CONDITIONAL
        System.err.println("---CONDITIONAL---");
        Boolean status = true;
        if (status) {
            System.err.println("If "+status);
        }
        
        Boolean status_ = false;
        if(status_){
            
        }else{
            System.err.println("Else: "+status_);
        }
        
        int choice = 1;
        switch (choice) {
            case 1 -> System.err.println("Switch: "+choice);
            default -> throw new AssertionError();
        }
        
        //FUNCTION OR METHOD
        System.err.println("---FUNCTION OR METHOD---");
        function();
        String message = "THIS IS MESSAGE";
        function_params(message);
        
        //RETURN OBJECT/CLASS/DATA TYPES
        System.err.println("---RETURN OBJECT/CLASS/DATA TYPES---");
        System.err.println(return_string());
        System.err.println(return_arraylist());
        
        //CLASS AND OBJECT
        System.err.println("---CLASS AND OBJECT---");
        class_object c_object = new class_object();
        c_object.function_from_class();
        
        String message_ = "THIS IS MESSAGE FROM CLASS CONSTRUCTOR";
        class_object_constructor c_obj_construct = new class_object_constructor(message_);
        
        class_object_inheritance c_obj_inherit = new class_object_inheritance();
        c_obj_inherit.function_from_class_inherit();
        c_obj_inherit.function_from_class();
        
    } 
    //FUNCTION OR METHOD
    public static void function(){
        System.err.println("THIS IS FUNCTION");
    }
    public static void function_params(String _message){
        System.err.println(_message);
    }
    
    //RETURN OBJECT/CLASS/DATA TYPES
    public static String return_string(){
        return "THIS IS RETURN STRING";
    }
    public static ArrayList return_arraylist(){
        ArrayList<String> array_list = new ArrayList<>();
        array_list.add("Array 1");
        array_list.add("Array 2");
        return array_list;
    }
}
//CLASS AND OBJECT
class class_object{
    public void function_from_class(){
        System.err.println("THIS IS FUNCTION FROM CLASS");
    }
}
class class_object_constructor{
    public class_object_constructor(String _message){
        System.err.println(_message);
    }
}
class class_object_inheritance extends class_object{
    public void function_from_class_inherit(){
        System.err.println("THIS IS FUNCTION FROM INHERITANCE");
    }
}

