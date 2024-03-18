/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author rylle
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animals_Interface dog = new Animals_Interface();
        dog.set_name("Robert");
        dog.set_breed("Bulldog");
        dog.display();
        
        dog.set_name("Robert");
        dog.set_breed("Bulldog");
        dog.display();
    }
    
}
interface Animalsss{
    void set_name(String _set_name);
    void set_breed(String _set_breed);
    void display();
}

class Animals_Interface implements Animalsss{
    private int id;
    private int count;
    private String name;
    private String breed;
    @Override
    public void set_name(String _set_name) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        name = _set_name;
    }

    @Override
    public void set_breed(String _set_breed) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        breed = _set_breed;
    }

    @Override
    public void display() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        id = count++;
        System.out.print("Id:"+ id
                +"\nName:"+ name
                +"\nBreed:"+ breed+"\n\n");
    }
    
}