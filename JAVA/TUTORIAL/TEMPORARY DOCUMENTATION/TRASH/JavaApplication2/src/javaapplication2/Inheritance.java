/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author rylle
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animalss dog = new Animalss();
        dog.set_name("Robert");
        dog.set_breed("Bulldog");
        dog.display();
        
        dog.set_name("Robert");
        dog.set_breed("Bulldog");
        dog.display();
    }
    
}
class Animalss extends Information{
    @Override
    public void set_name(String _set_name) {
        super.set_name(_set_name); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void set_breed(String _set_breed) {
        super.set_breed(_set_breed); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void display() {
        super.display(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
class Information{
    private int id;
    private int count;
    private String name;
    private String breed;
    
    public void set_name(String _set_name){
        name = _set_name;
    }
    
    public void set_breed(String _set_breed){
        breed = _set_breed;
    }
    
    public void display(){
        id = count++;
        System.out.print("Id:"+ id
                +"\nName:"+ name
                +"\nBreed:"+ breed+"\n\n");
    }
}
