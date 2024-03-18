/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionclass;
import java.util.*;
import java.net.HttpCookie;
/**
 *
 * @author rylle
 */
public class CollectionClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String arr[] = {"1","2"};
        for (String string : arr) {
            System.err.println(string);
        }
        String arr_ph1[] = new String[2];
        arr_ph1[0] = "hello";
        arr_ph1[1] = "world";
        for (String string : arr_ph1) {
            System.err.println(string);
        }
        
        ArrayList arraylist = new ArrayList();
        arraylist.add("hello World");
        System.err.println(arraylist);
        
        Dictionary<String,String> dict;
        dict = new Hashtable<>();
        dict.put("Name", "visto");
        System.err.println(dict);
        
        List<String> list = new ArrayList<>();
        list.add("visto");
        System.err.println(list);
    }
}
