/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop;

/**
 *
 * @author rylle
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //Create Object using person class
        person student_ph1 = new person();
        student_ph1.set_name("visto");
        System.out.println(student_ph1.get_name());
        
        person_encapsulation student_ph1_encap = new person_encapsulation();
        student_ph1_encap.set_name("visto");
        System.out.println(student_ph1_encap.get_name());
        
        person_constructor student_ph1_construct = new person_constructor("visto");
        System.out.println(student_ph1_construct.get_name());
    }
    
}
class person{
    String name;
    
    //Create functions
    void set_name(String _set_name){
        name = _set_name;
    }
    String get_name(){
        return name;
    }
}

class person_encapsulation{
    //All variables is have private access modifier
    private String name;

    //Create functions
    void set_name(String _set_name){
        name = _set_name;
    }
    String get_name(){
        return name;
    }
}

class person_constructor{
    private String name;
    
    public person_constructor(String _set_name){
        name = _set_name;
    }
    String get_name(){
        return name;
    }
}