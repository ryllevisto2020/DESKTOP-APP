/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servicesdependencyinjection;
import servicesdependencyinjection.Services.*;
/**
 *
 * @author rylle
 */
public class ServicesDependencyInjection {

    /**
     * @param args the command line arguments
     */
    private static SampleServices sampleServices;
    public ServicesDependencyInjection(SampleServices _SampleServices){
        sampleServices = _SampleServices;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        sampleServices.this_function();
    }
    
}
