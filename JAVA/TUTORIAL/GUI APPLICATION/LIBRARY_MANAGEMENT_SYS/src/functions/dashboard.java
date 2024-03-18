/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package functions;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rylle
 */
public class dashboard {
    private static database db;

    public dashboard() throws SQLException {
        db = new database("jdbc:mysql://localhost:3306/java", "root", "");
    }
    
    public int count_members(){
        try {
            return db.count_members();
        } catch (SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int count_totalBooks(){
        try {
            return db.count_book();
        } catch (SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int count_totalBorrow(){
        try {
            return db.count_borrow();
        } catch (SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int count_totalReturned(String date){
        try {
            return db.count_returned(date);
        } catch (SQLException ex) {
            Logger.getLogger(dashboard.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public ArrayList logs() throws SQLException{
        return db.logs();
    }
}
