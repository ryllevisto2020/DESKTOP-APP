
import com.itextpdf.text.DocWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author rylle
 */
public class documents_pdf {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException, DocumentException {
        // TODO code application logic here
        
        Document docs= new Document();
        File file = new File("test.pdf");
        FileOutputStream fos = new FileOutputStream(file);
        PdfWriter writer = PdfWriter.getInstance(docs, fos);
        
        writer.open();
        docs.open();
        
        Paragraph para = new Paragraph("awd");
        para.setAlignment(Paragraph.ALIGN_CENTER);
        docs.add(para);
        
        docs.close();
        writer.close();
    }
}
