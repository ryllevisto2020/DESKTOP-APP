  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.sql.*;
/**
 *
 * @author rylle
 */
public class CRUD{

    /**
     * @param args the command line arguments
     */
    public static Connection a;
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        a = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
        String sql_query = "INSERT INTO `java_tbl` (`id`, `java_username`, `java_password`, `java_name`) VALUES (NULL, 'adawd', 'ad', 'adawd');";
        Statement sql_stmnt = a.createStatement();
        sql_stmnt.execute(sql_query);
        sql_stmnt.close();
        
        String sql_select = "SELECT * FROM `java_tbl`";
        Statement sql_stmnt_select = a.createStatement();
        ResultSet sql_rs_select = sql_stmnt_select.executeQuery(sql_select);
        while (sql_rs_select.next()) {            
            System.err.println(sql_rs_select.getString("java_username"));
        }
    }
    
}
