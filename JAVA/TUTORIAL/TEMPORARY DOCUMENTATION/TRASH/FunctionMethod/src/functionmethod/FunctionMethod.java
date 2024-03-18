/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package functionmethod;

/**
 *
 * @author rylle
 */
public class FunctionMethod {

    /**
     * @param args the command line arguments
     */
    public static void this_function_method(){
        System.err.println("This is Function/Method");
    }
    public static void this_function_parameter(String sample){
        System.err.println("This is value from paramter:"+sample);
    }
    public static Object return_string(){//public static <Object,String,Integer,Bool and etc...>
        return "return any Object";
    }
    public static void main(String[] args) {
        // TODO code application logic here
        this_function_method();
        this_function_parameter("visto");
        System.err.println(return_string());
    }
    
}
