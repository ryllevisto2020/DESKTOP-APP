/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package json.array.object;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author rylle
 */
public class JSONARRAYOBJECT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JSONException {
        // TODO code application logic here
        JSONObject create_obj =new JSONObject();
        create_obj.put("name", "visto");
        create_obj.put("age", 21);
        
        System.err.println(create_obj);
        System.err.println(create_obj.get("name"));
        System.err.println("--------------");
        
        JSONArray create_arr = new JSONArray();
        create_arr.put(create_obj);
        System.err.println(create_arr);
        System.err.println(create_arr.getJSONObject(0));
        System.err.println(create_arr.getJSONObject(0).getString("name"));
    }
    
}
