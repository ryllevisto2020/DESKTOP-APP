/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rylle
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        login Obj_login = new login("","");
        print Obj_print = new print();
        
        Obj_print.out("Username:");
        String user = (String) Obj_print.in_string();
        Obj_print.out("Password:");
        String pass = (String) Obj_print.in_string();
        Obj_login.login(user, pass);
        Obj_login.validate_creds();
        
        ArrayList<String> te = new ArrayList<>();
        te.add("Claire");
        te.add("Rylle");
        
        Obj_print.out(te.get(0));
    }
    
}
class login{
    private String username;
    private String password;

    public login(String _username,String _password) {
        username = _username;
        password = _password;
    }
    
    public void login(String _username,String _password){
        username = _username;
        password = _password;
    }
    
    public void validate_creds(){
        print print = new print();
        if("admin".equals(username)&&"admin".equals(password)){
            print.out("Login Success!");
        }else{
            print.out("Login Failed!");
        }
    }
}
class print{
    public void out(Object obj){
        System.out.print(obj);
    }
    public Object in_string(){
        Scanner Obj_scanner = new Scanner(System.in);
        return Obj_scanner.nextLine();
    }
}