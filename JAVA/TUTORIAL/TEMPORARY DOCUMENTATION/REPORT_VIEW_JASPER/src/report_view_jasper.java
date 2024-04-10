
import java.io.File;
import java.net.URISyntaxException;
import java.sql.Connection;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRReport;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.engine.xml.JasperDesignFactory;
import net.sf.jasperreports.swing.JRDesignViewer;
import java.sql.*;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author rylle
 */
public class report_view_jasper {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws JRException, URISyntaxException, SQLException {
        // TODO code application logic here
        
        File file = new File(ClassLoader.getSystemResource("\\Blank_A4.jrxml").toURI());
        
        JasperDesign xml_load = JRXmlLoader.load(file);
        
        JRDesignQuery query = new JRDesignQuery();
        java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jasper","root","");
        String query_string = "SELECT * FROM `jasper_tbl`";
        query.setText(query_string);
        
        JasperReport compileReport = JasperCompileManager.compileReport(xml_load);
        JasperPrint fill = JasperFillManager.fillReport(compileReport, null, conn);
        
        JasperViewer.viewReport(fill);
    }
}
