/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package httpurlconnection;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author rylle
 */
public class HTTPUrlConnection {

    private static HttpURLConnection url_connection;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException, JSONException{
        // TODO code application logic here
        URL url = new URL("https://jsonplaceholder.typicode.com/posts");
       url_connection =(HttpsURLConnection) url.openConnection();
       
       /*url_connection.setRequestMethod("GET");
       url_connection.setRequestProperty("Content-Type", "application/json");
       url_connection.setRequestProperty("User-Agent", "Mozilla/5.0");
       url_connection.connect();
       var response =  url_connection.getResponseCode();
       System.err.println(response);
       var content = new BufferedReader(new InputStreamReader(url_connection.getInputStream()));
       String data = "";
       String line;
       while ((line=content.readLine())!=null) {
           data += line+'\n';
       }
       System.err.println(data);
       url_connection.disconnect();*/
       
       
       /*url_connection.setConnectTimeout(5000);
       url_connection.setRequestProperty("Content-Type", "application/json");
       url_connection.setDoOutput(true);
       url_connection.setDoInput(true);
       url_connection.setRequestMethod("POST");
       
       JSONObject obj = new JSONObject();
       obj.put( "id_post",2);
       obj.put("user_post", "Goodbye World");
       
        try(OutputStreamWriter os = new OutputStreamWriter(url_connection.getOutputStream())){
           os.write(obj.toString()); 
        }
        
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(url_connection.getInputStream()))){
            String line;
            String response = "";
            while((line=reader.readLine())!=null){
                response += line+"\n";
            }
            System.err.println(response);
        }
        url_connection.disconnect();*/
       
       
       url_connection.setConnectTimeout(5000);
       url_connection.setRequestProperty("Content-Type", "application/json");
       url_connection.setDoInput(true);
       
       try(BufferedReader reader = new BufferedReader(new InputStreamReader(url_connection.getInputStream()))){
            String line;
            String response = "";
            while((line=reader.readLine())!=null){
                response += line+"\n";
            }
            System.err.println(response);
        }
       
       url_connection.disconnect();
    }
    
}
