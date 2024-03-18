/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pointofsalesystem.Services;

/**
 *
 * @author rylle
 */
public class LoginValidation {
    private String username;
    private String password;
    public LoginValidation(String uname,String pass){
        username = uname;
        password = pass;
    }
    public Boolean validate(){
        return username.equals("admin")&&password.equals("admin");
    }
}
