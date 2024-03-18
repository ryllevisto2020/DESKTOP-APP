/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package json;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import org.json.*;
/**
 *
 * @author rylle
 */
public class JSON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JSONException, FileNotFoundException {
        // TODO code application logic here
        
        //CREATE JSON OBJECT
        JSONObject json_object = new JSONObject();
        json_object.put("key", "value");
        System.err.println(json_object);
        System.err.println(json_object.getString("key"));
        
        System.err.println("--------------");
        
        //CREATE JSON ARRAY
        JSONArray json_array = new JSONArray();
        json_array.put(0,"value");
        System.err.println(json_array);
        System.err.println(json_array.get(0));
    }
    
}