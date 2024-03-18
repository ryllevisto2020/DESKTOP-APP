/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author rylle
 */
public class list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-----------Array List--------------");
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        
        System.out.println("-----------Dictionary--------------");
        Dictionary<String,Integer> dict = new Hashtable<>();
        dict.put("Number", 1);
        System.out.println(dict.get("Number"));
        
        System.out.println("-----------Map--------------");
        Map<String,Integer> map = new Hashtable<>();
        map.put("Number", 1);
        System.out.println(map.get("Number"));
        
        System.out.println("-----------HashMap--------------");
        HashMap<String,Integer> hash = new HashMap<>();
        hash.put("Number",1);
        System.out.println(hash.get("Number"));
        
        System.out.println("-----------HashTable--------------");
        Hashtable<String,Integer> hashtable = new Hashtable<>();
        hashtable.put("Number", 1);
        System.out.println(hashtable.get("Number"));
        
        System.out.println("-----------LinkedHashMap--------------");
        LinkedHashMap<String,Integer> linkedhash = new LinkedHashMap<>();
        linkedhash.put("Number", 1);
        System.out.println(linkedhash.get("Number"));
    }
    
}
