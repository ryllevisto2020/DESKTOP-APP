/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2.DependencyInjection;

/**
 *
 * @author rylle
 */
public class Main {

    /**
     * @param services
     */
    private final Services _services; 
    public Main(Services services){
        this._services = services;
    }
    public void print(){
        System.out.println(_services.print());
    }
    public static void main(String[] args) {
       Main main = new Main(new Services());
       main.print();
       
       Services a = new Services();
        System.err.println(a.print());
    }
}
