/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package functions;
import java.sql.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.logging.Logger;
/**
 *
 * @author rylle
 */
public class database {
    
    //Connection
    private static Connection conn;

    public database(String url,String user,String pass) throws SQLException {
        conn = DriverManager.getConnection(url,user,pass);
    }
    
    //LOGIN FORM
    public boolean authenticate_login(String user,String pass) throws SQLException{
        login login = new login();
        String select_query = "SELECT * FROM `library_management_account` WHERE `user_username` LIKE '"+user+"' AND `user_password` LIKE '"+pass+"'|| `user_email` LIKE '"+user+"' AND `user_password` LIKE '"+pass+"';";
        Statement select_statement = conn.createStatement();
        ResultSet select_result = select_statement.executeQuery(select_query);
        boolean status = select_result.next();
        try {
            login.setName(select_result.getString("user_name"));
        } catch (SQLException e) {
            //System.err.println(e);
        }
        select_result.close();
        select_statement.close();
        conn.close();
        return status;
    }
    
    //DASHBOARD FORM
    public int count_members() throws SQLException{
       int count_data = 0;
       String count_query = "SELECT COUNT(*) FROM `library_management_members`;";
       Statement count_statement = conn.createStatement();
       ResultSet count_result = count_statement.executeQuery(count_query);
       boolean status = count_result.next();
        try {
            count_data = count_result.getInt("COUNT(*)");
        } catch (SQLException e) {
        }
        count_result.close();
        count_statement.close();
       return count_data;
    }
    
    public int count_book() throws SQLException{
        int count_data = 0;
        String count_query = "SELECT COUNT(*) FROM `library_management_books`;";
        Statement count_statement = conn.createStatement();
        ResultSet count_result = count_statement.executeQuery(count_query);
        boolean status = count_result.next();
        try {
           count_data = count_result.getInt("COUNT(*)");
        } catch (SQLException e) {
        }
        count_result.close();
        count_statement.close();
        return count_data;
    }
    
    public int count_borrow() throws SQLException{
        int count_data = 0;
        String count_query = "SELECT COUNT(*) FROM `library_management_borrow`;";
        Statement count_statement = conn.createStatement();
        ResultSet count_result = count_statement.executeQuery(count_query);
        boolean status = count_result.next();
        try {
           count_data = count_result.getInt("COUNT(*)");
        } catch (SQLException e) {
        }
        count_result.close();
        count_statement.close();
        return count_data;
    }
    
    public int count_returned(String date) throws SQLException{
        int count_data = 0;
        String count_query = "SELECT COUNT(*) FROM `library_management_returned` WHERE returned_date LIKE '"+date+"';";
        Statement count_statement = conn.createStatement();
        ResultSet count_result = count_statement.executeQuery(count_query);
        boolean status = count_result.next();
        try {
           count_data = count_result.getInt("COUNT(*)");
        } catch (SQLException e) {
        }
        count_result.close();
        count_statement.close();
        return count_data;
    }
    
    public ArrayList logs() throws SQLException{
        ArrayList<Object> list = new ArrayList<>();
        String logs_query = "SELECT * FROM `library_management_logs`";
        Statement logs_statement = conn.createStatement();
        ResultSet logs_result = logs_statement.executeQuery(logs_query);
        while (logs_result.next()) {            
            list.add(new Object[]{logs_result.getString("logs_date_time"),logs_result.getString("logs_description"),logs_result.getString("logs_incharge")});
        }
        return list;
    }
}
