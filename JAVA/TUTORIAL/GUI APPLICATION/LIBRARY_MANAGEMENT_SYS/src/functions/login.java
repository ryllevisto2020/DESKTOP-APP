/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package functions;

import form.dashboard_frm;
import form.login_frm;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author rylle
 */
public class login {
    private static String name;
    public void setName(String _name){
        name = _name;
    }
    public String getName(){
        return name;
    }
    public void click_login(String user,String pass){
        try {
            // TODO add your handling code here:
            database db = new database("jdbc:mysql://localhost:3306/java", "root", "");
            boolean authenticate = db.authenticate_login(user, pass);
            if(authenticate){
                int option = JOptionPane.showConfirmDialog(new login_frm(), "Login Success!", "Login Success", JOptionPane.PLAIN_MESSAGE);
                if(option==0){
                    dashboard_frm dashboard = new dashboard_frm();
                    new login_frm().setHide(true);
                    dashboard.show();
                    dashboard.setName(getName());
                }
            }else{
                JOptionPane.showMessageDialog(new login_frm(),"No Credentials Found!","Login Error!",JOptionPane.ERROR_MESSAGE);
                 new login_frm().setHide(false);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new login_frm(),"Message: "+ex.getMessage(),"Databse Error!",JOptionPane.ERROR_MESSAGE);
            /*if(ex.getErrorCode()==1049){
                
            }
            if(ex.getErrorCode()==1045){
                JOptionPane.showMessageDialog(new login_frm(),"Error: Credentials Error!\n"+"Message: "+ex.getMessage(),"Error!",JOptionPane.ERROR_MESSAGE);
            }
            if(ex.getErrorCode()==1146){
                JOptionPane.showMessageDialog(new login_frm(),"Error: Table Error!\n"+"Message: "+ex.getMessage(),"Error!",JOptionPane.ERROR_MESSAGE);
            }
            if(ex.getErrorCode()==1064){
                JOptionPane.showMessageDialog(new login_frm(),"Error: Syntax Error!\n"+"Message: "+ex.getMessage(),"Error!",JOptionPane.ERROR_MESSAGE);
            }*/
        }
    }
}
