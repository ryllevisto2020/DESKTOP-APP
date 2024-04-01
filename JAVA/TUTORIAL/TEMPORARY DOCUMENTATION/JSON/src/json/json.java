/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author rylle
 */
public class json {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws JSONException, ParseException {
        // TODO code application logic here
        
        /* Create Json Array */
        JSONArray json_array = new JSONArray();
        
        /* Add Data to Json Array */
        json_array.put("Hello");
        json_array.put("world");
        
        /* Get Data from Json Array */
        System.err.println(json_array);
        System.err.println(json_array.get(0));
        
        
        /* Create Json Object */
        JSONObject json_object = new JSONObject();
        
        /* Add Data to Json Object */
        json_object.put("Name", "Visto");
        
        /* Get Data from Json Object */
        System.err.println(json_object);
        System.err.println(json_object.get("Name"));
        
        
        /*------------------------------------------------*/
        
        
        /* Create Json Array and Object */
        JSONArray subject = new JSONArray();
        JSONObject student = new JSONObject();
        
        /* Add Data to Json Array */
        subject.put("English");
        subject.put("CC101");
        
        /* Add Data to Json Object */
        student.put("Name", "Visto");
        student.put("Id", "19016804");
        student.put("Course", "BSIT");
        student.put("Subject", subject);
        
        /* Get Data from Json Object*/
        System.err.println(student);
        System.err.println(student.get("Id"));
        System.err.println(student.getJSONArray("Subject"));
        
        /* Get Data from Json Array */
        JSONArray getSubject = student.getJSONArray("Subject");
        System.err.println(getSubject.get(0));
        
        
        /*------------------------------------------------*/
        
        
        /* Json to String(Vice Versa) */
        String json_string = "{\"name\":\"Visto\"}";
        JSONParser parse_string = new JSONParser();
        System.err.println(parse_string.parse(json_string));
    }
}
