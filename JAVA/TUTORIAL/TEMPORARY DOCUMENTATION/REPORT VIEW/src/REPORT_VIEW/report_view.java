/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package REPORT_VIEW;

import java.io.File;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author rylle
 */
public class report_view {

    /** 
    * @param args the command line arguments
     */
    public static void main(String args[]) throws JRException, SQLException, ClassNotFoundException {
        // TODO code application logic here
        
        /* Load Mysql Class */
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        /* Create Connection */
        java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jasper","root","");
        
        /* Create Sql Query */
        String sql_query = "SELECT * FROM `jasper_tbl`";
        
        /* Create File */
        File file = new File("E:\\PROJECT - SCRATCH\\PRACTICE CODE\\2 DESKTOP APP AND CLI APP\\JAVA\\TUTORIAL\\TEMPORARY DOCUMENTATION\\REPORT VIEW\\src\\REPORT_VIEW\\Blank_A4.jrxml");
        
        /* Create Jasper Design Query */
        JRDesignQuery jasper_query = new JRDesignQuery();
        jasper_query.setText(sql_query);
        
        /* Create Jasper Design */
        JasperDesign design = JRXmlLoader.load(file);
        design.setQuery(jasper_query);
        
        /* Create Jasper Report*/
        JasperReport report = JasperCompileManager.compileReport(design);
        
        /* Create Jasper Print */
        JasperPrint print = JasperFillManager.fillReport(report,null,con);
        
        /* Create Jasper Viewer */
        JasperViewer.viewReport(print);
    }
}
