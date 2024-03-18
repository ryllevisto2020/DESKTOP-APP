/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CREATE_DOCUMENTS;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 *
 * @author rylle
 */
public class create_documents {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException, DocumentException {
        // TODO code application logic here
        
        /*
        
        1. Import itextpdf packages and pdfbox packages
        https://howtodoinjava.com/java/library/read-generate-pdf-java-itext/
        
        */
        
        /* Create Documents */
        Document docs = new Document();
        
        /* Create PdfWriter and Output Stream */
        OutputStream os = new FileOutputStream("docs.pdf");
        PdfWriter writer = PdfWriter.getInstance(docs,os);
        
        /* Open Documents and Writer*/
        docs.open();
        writer.open();
        
        /* Create Font */
        Font font = new Font();
        font.setFamily(Font.FontFamily.COURIER.toString());
        font.setSize(50);
        font.setStyle(Font.BOLD);
        
        /* Create Paragraph */
        Paragraph para = new Paragraph();
        para.setFont(font);
        para.add("Hello World");
        para.setAlignment(Paragraph.ALIGN_CENTER);
        
        /* Add Paragraph to Documents */
        docs.add(para);
        
        /* Close Documents and Writer */
        docs.close();
        writer.close();
    }
}
