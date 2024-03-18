/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author rylle
 */
public class ClassAndObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //New object Instance
        Animals dog = new Animals();
        dog.set_id();
        dog.set_name("Robert");
        dog.set_breed("Poodle");
        dog.display();
        
         dog.set_id();
        dog.set_name("PaoPao");
        dog.set_breed("Bulldog");
        dog.display();
        
        //New object Instance
        Animals_constructor cat = new Animals_constructor("Glaze", "Persian");
        cat.display();
        
        
    }
    
}

//Don't Have any constructor
class Animals{//Base Class or Parent Class
    
    //Access Modifier
    private int id;
    private String name;
    private String breed;
    private int count = 0;
    //functions or Methods
    public void set_name(String _set_name){
        name = _set_name;
    }
    
    public void set_breed(String _set_breed){
        breed = _set_breed;
    }
    
    public void set_id(){
        id = count++;
    }
    
    public void display(){
        System.out.print("Id:"+ id
                +"\nName:"+ name
                +"\nBreed:"+ breed+"\n\n");
    }
}

//Have Constructor
class Animals_constructor{
    
    //Access Modifier
    private int id;
    private String name;
    private String breed;
    private int count = 0;
    
    //Constructor
    public Animals_constructor(String _set_name,String _set_breed) {
        id = count++;
        name = _set_name;
        breed = _set_breed;
    }
    
    public void display(){
        System.out.print("Id:"+ id
                +"\nName:"+ name
                +"\nBreed:"+ breed+"\n\n");
    }
}