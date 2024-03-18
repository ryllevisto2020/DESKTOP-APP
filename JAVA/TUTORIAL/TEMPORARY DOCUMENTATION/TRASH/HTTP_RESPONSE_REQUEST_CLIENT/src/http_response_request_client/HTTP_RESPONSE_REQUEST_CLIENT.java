/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package http_response_request_client;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/**
 *
 * @author rylle
 */
public class HTTP_RESPONSE_REQUEST_CLIENT {
private static URL url;
private static HttpURLConnection http_url;
private static HttpsURLConnection https_url;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO code application logic here
        
        //CREATE URL CONNECTION
        url = new URL("https://jsonplaceholder.typicode.com/posts");
        https_url = (HttpsURLConnection) url.openConnection();
       
        //CREATE REQUEST PROPERTIES
        https_url.setRequestProperty("Content-type", "application/json"); //HEADERS
        https_url.setRequestMethod("POST"); //METHOD
        
        //CREATE RECEIVER BODY REQUEST
        https_url.setDoInput(true);
        
        //CREATE SENDER BODY REQUEST
        https_url.setDoOutput(true);
        
        //SEND BODY REQUEST
        try (PrintWriter PW = new PrintWriter(https_url.getOutputStream())){
            String data = "{\"name\":\"visto\",\"code\":1}";
            PW.write(data);
        } catch (Exception e) {
        }
        
        //RECEIVE BODY REQUEST
        try (BufferedReader BR = new BufferedReader(new InputStreamReader(https_url.getInputStream()))){
            String line;
            String response = "";
            while ((line = BR.readLine())!=null) {                
                response += line+"\n";
            }
            System.err.println(response);
        } catch (Exception e) {
        }
    }
    
}
