/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author rylle
 */
public class InterfaceClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InterfaceTest_class itc = new InterfaceTest_class();
        itc.run();
        System.err.println(InterfaceTest.message);
        ////////////////////////////////////////
        System.err.println("////////////////////////////////////////");
        AbstractTest_class atc = new AbstractTest_class();
        atc.run_abstract();
        atc.run();
    }
    
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
interface InterfaceTest{
    String message="interface static final variable"; // default public/private static final
    void run(); //
}
 class InterfaceTest_class implements InterfaceTest{

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
abstract class AbstractTest{
    public static final  String message="abstract static final variable";
    abstract void run();
}
class AbstractTest_class extends AbstractTest{

    @Override
    void run() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        message = "awd";
    }
    
}
