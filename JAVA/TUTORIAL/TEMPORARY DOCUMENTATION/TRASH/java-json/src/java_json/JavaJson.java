/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_json;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author rylle
 */
public class JavaJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JSONException {
        // TODO code application logic here
        
        //Creating Object
        //1st Initialize (JSONObject Class)
        JSONObject json_object = new JSONObject();
        json_object.put("name", "visto");  //=> put data with key and value => .put(<key = status>,<value = connected>)
        json_object.put("section", "BSIT-3104"); 
        System.err.println(json_object);
        System.err.println(json_object.getString("name")); //=> extract data => .get<String/int/boolean/etc..>(<key = status>)
        
        System.err.println("====================================");
        
        //Create Array
        //1st Initialize (JSONArray Class)
        JSONArray json_array = new JSONArray();
        json_array.put(0,"visto"); //=> put data with index and value => .put(<index = 0>,<value = connected>)
        json_array.put(1,"BSIT-3104");
        System.err.println(json_array);
        System.err.println(json_array.get(0)); //=> extract data => .get(<index = 0>)
        
        System.err.println("====================================");
        
        //Combination of Object and Array
        JSONArray arr_json = new JSONArray();
        for (int i = 0; i < name.values().length; i++) {
            int id = i+1;
            JSONObject arr_Object = new JSONObject();
            arr_Object.put("name", name.values()[i]);
            arr_Object.put("id", id);
            arr_json.put(i, arr_Object);
        }
        System.err.println(arr_json+"\n");
        
        JSONArray arr_get_json = new JSONArray(arr_json.toString());
        for (int i = 0; i < arr_get_json.length(); i++) {
            Object object = arr_get_json.get(i);
            System.err.println(object);
            
            JSONObject obj_get_json = new JSONObject(object.toString());
            System.err.println("Name:"+obj_get_json.get("name")+" and "+"ID:"+obj_get_json.get("id")+"\n");
        }
    }
}
    
class data{
    private String name;
    private int id;

    public data(String _name,int _id) {
        this.id = _id;
        this.name = _name;
    }
    public String get_name(){
        return name;
    }
    public int get_id(){
        return id;
    }
}
enum name{
    visto,claire
}