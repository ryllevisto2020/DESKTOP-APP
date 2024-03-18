/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 *
 * @author rylle
 */
public class JSON {
private static HttpURLConnection connection;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JSONException, MalformedURLException, IOException {
        // TODO code application logic here
        /*JSONObject details = new JSONObject();
        details.put("Name", "Visto");
        details.put("Age", 1);
        
        JSONObject obj = new JSONObject();
        obj.put("Details", details);
        
        JSONObject details1 = new JSONObject();
        details1.put("Name", "Claire");
        details1.put("Age", 2);
        
        JSONObject obj1 = new JSONObject();
        obj1.put("Details", details1);
        
        JSONArray arr = new JSONArray();
        arr.put(obj);
        arr.put(obj1);
        System.out.println(arr);
        
        JSONArray get = new JSONArray(arr.toString());
        System.out.println(get.get(0));
        
        JSONObject getObj = new JSONObject(get.get(1).toString());
        JSONObject getde = new JSONObject(getObj.get("Details").toString());
        System.err.println(getde.getInt("Age"));*/
        
        
        URL url = new URL("https://jsonplaceholder.typicode.com/posts");
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type", "application/json");
        
        try (DataOutputStream DOS = new DataOutputStream(connection.getOutputStream())){
        } catch (Exception e) {
        }
        
        try (BufferedReader BR = new BufferedReader(new InputStreamReader(connection.getInputStream()))){
            String line;
            String response = "";
            while ((line = BR.readLine())!=null) {                
                response += line+"\n";
            }
            //System.out.println(response);
            JSONArray t = new JSONArray(response);
            System.err.println(t.get(0).toString());
            
            JSONObject test1b = new JSONObject(t.get(0).toString());
            System.out.println(test1b.getString("title"));
        } catch (Exception e) {
        }
    }
    
}
