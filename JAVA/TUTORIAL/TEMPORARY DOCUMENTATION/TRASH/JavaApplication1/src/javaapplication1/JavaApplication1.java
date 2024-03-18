/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 *
 * @author rylle
 */
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
public class JavaApplication1 {
    private static HttpURLConnection connection;
    /**
     * @param args the command line arguments
     * @throws java.net.MalformedURLException
     * @throws org.json.JSONException
     */
    public static void main(String[] args)  {
        
        // TODO code application logic here
        try {
            URL url =  new URL("http://restapi.adequateshop.com/api/authaccount/registration");
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setDoInput(true);
        connection.setRequestProperty("Content-Type", "application/json");
        String name="\""+url+"\"";
        String b = "{\"name\":"+name+",\"email\":\"testtest23@gmail.com\",\"password\":123456}";
        JSONObject ad = new JSONObject();
        ad.put("password", "A");
        ad.put("email", "A");
        ad.put("name", "A");
        
        
            System.err.println(b);
            //System.err.println(ad);
        //String b = ad.toString();
        try (DataOutputStream dos = new DataOutputStream(connection.getOutputStream())){
            dos.writeBytes(b);
        }
        
        
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))){
            String line;
            String a = null;
            while ((line=reader.readLine())!=null) {                
                a=line;
            }
            
            System.err.println(a);
            //System.err.println(connection.getRequestProperty("Content-type"));
            //System.err.println(connection.getResponseCode());
            JSONObject arr = new JSONObject(a);
            System.err.println(arr.getJSONObject("data").getString("Name"));
        }
        
        } catch (Exception e) {
        }
        
    }
    
    
}
class awd{
    private String name;
    public awd(String _name){
        name = _name;
    }
    public void set(String _name){
        name = _name;
    }
    public String get(){
        return name;
    }
}
class awd1{
    private String name;
    public awd1(String _name){
        name = _name;
    }
    public void set(String _name){
        name = _name;
    }
    public String get(){
        return name;
    }
}