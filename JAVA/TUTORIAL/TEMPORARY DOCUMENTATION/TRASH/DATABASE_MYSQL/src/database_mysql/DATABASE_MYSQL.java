/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database_mysql;
import java.sql.*;
import java.util.Random;
import java.util.stream.IntStream;
/**
 *
 * @author rylle
 */
public class DATABASE_MYSQL {
private static Connection conn;
    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        //CREATE CONNECTION FOR YOUR DATABASE 
        String database = "java";
        String username = "root";
        String password = "";
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+database,username,password);
        } catch (SQLException e) {
            System.err.println(e);
        }
        
        //CREATE RANDOM DATA
        Random random_data = new Random();
        int user = random_data.nextInt(0, 100);
        int pass = random_data.nextInt(0, 100);
        
        //INSERT DATA TO TABLE
        String insert_query = "INSERT INTO `java_tbl` (`id`, `user`, `pass`) VALUES (NULL, '"+user+"', '"+pass+"')";
        Statement insert_stmnt = conn.createStatement();
        insert_stmnt.execute(insert_query);
        
        //SELECT DATA TO TABLE
        String select_query = "SELECT * FROM `java_tbl`";
        Statement select_stmnt = conn.createStatement();
        ResultSet select_rs = select_stmnt.executeQuery(select_query);
        while (select_rs.next()) {            
            System.err.println(select_rs.getString("id")+":"+select_rs.getString("user")+":"+select_rs.getString("pass"));
        }
        
        //UPDATE DATA TO TABLE
        int update_pass = random_data.nextInt(0,100);
        String update_query = "UPDATE `java_tbl` SET `pass` = '"+update_pass+"' WHERE `java_tbl`.`id` = 1";
        Statement update_stmnt = conn.createStatement();
        update_stmnt.execute(update_query);
        
        //DELETE DATA TO TABLE
        String delete_query = "DELETE FROM `java_tbl` WHERE `java_tbl`.`id` = 17";
        Statement delete_stmnt = conn.createStatement();
        delete_stmnt.execute(delete_query);
    }
    
}
