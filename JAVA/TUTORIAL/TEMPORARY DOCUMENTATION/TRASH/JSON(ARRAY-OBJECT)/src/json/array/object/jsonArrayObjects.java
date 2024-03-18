/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package json.array.object;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import org.json.*;
/**
 *
 * @author rylle
 */
public class jsonArrayObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JSONException, MalformedURLException, IOException {
        // TODO code application logic here
        
        URL host = new URL("https://jsonplaceholder.typicode.com/posts");
        HttpURLConnection connection = (HttpURLConnection) host.openConnection();
        System.out.println(connection.getRequestMethod());
    }
    
}
class valueObject{
    private String name;
    public void set_name(String _name){
        name = _name;
    }
    public String get_name(){
        return name;
    }
}