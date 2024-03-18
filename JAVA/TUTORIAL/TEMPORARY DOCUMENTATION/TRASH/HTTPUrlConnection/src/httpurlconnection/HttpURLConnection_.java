/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package httpurlconnection;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author rylle
 */
public class HttpURLConnection_ {
private static HttpURLConnection connection;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO code application logic here
        
        //1st Initialize (URL Class)
        URL url = new URL("https://jsonplaceholder.typicode.com/posts"); //=> URL(<url website>)
        
        //2nd Initialize (HttpURLConnection Class)
        connection = (HttpsURLConnection) url.openConnection();
        
        //3rd Initialize all Properties of Request
        connection.setRequestMethod("POST"); //=> set Request Method (GET,POST,etc...)
        connection.setRequestProperty("Content-Type", "application/json"); //=> set Request Header
        connection.setDoInput(true); //=> receive Response Body Data
        connection.setDoOutput(true); //=> send Request Body Data
        
        //4th Send Request Body Data
        try(OutputStreamWriter OSW = new OutputStreamWriter(connection.getOutputStream())) {
            String data = "{\"name\":\"visto\",\"code\":1}"; //=> Request Body Data in JSON-String Format
            OSW.write(data); //=> send Request Body Data via Http Request
        } catch (Exception e) {
        }
        
        //5th Receive Response Body Data
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))){
            String line;
            String response = "";
            while((line=reader.readLine())!=null){
                response += line+"\n";
            }
            System.err.println(response);
        }
        //6th Close connection
        connection.disconnect();
    }
    
}
