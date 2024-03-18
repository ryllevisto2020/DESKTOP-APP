/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generate_create_documents;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64;
import java.io.FileNotFoundException;
import java.io.OutputStream;

/**
 *
 * @author rylle
 */
public class GENERATE_CREATE_DOCUMENTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        // TODO code application logic here
        
        //CREATE PDF DOCUMENT
        Document doc = new Document();
        OutputStream os = new java.io.FileOutputStream("test.pdf");
        PdfWriter PW = PdfWriter.getInstance(doc,os);
        
        //CREATE PARAGRAPH
        doc.open();
        Font font = new Font();
        doc.add(new Paragraph("This is Paragraph"));
        doc.close();
        PW.close();
        
        //CREATE PDF DOCUMENT
        Document doc_ = new Document();
        OutputStream os_ = new java.io.FileOutputStream("test_.pdf");
        PdfWriter PW_ = PdfWriter.getInstance(doc_, os_);
        
        //CREATE TABLE
        doc_.open();
        PdfPCell cell = new PdfPCell(new Paragraph("This is Table and Cell"));
        PdfPTable table = new PdfPTable(1);
        
        //SET CELL PROPERTIES
        cell.setBorderColor(BaseColor.BLUE);
        cell.setPaddingLeft(10);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        
        //ADD CELL TO TABLE
        table.addCell(cell);
        
        //ADD TABLE TO DOCUMENTS
        doc_.add(table);
        doc_.close();
        PW_.close();
    }
    
}
