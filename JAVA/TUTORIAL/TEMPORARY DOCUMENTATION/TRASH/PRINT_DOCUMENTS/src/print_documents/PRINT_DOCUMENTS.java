/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package print_documents;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import javax.print.PrintService;
import javax.print.attribute.Attribute;
import javax.print.attribute.DocAttribute;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintJobAttribute;
import javax.print.attribute.PrintRequestAttributeSet;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;
import org.apache.pdfbox.printing.PDFPrintable;

/**
 *
 * @author rylle
 */
public class PRINT_DOCUMENTS {

    /**
     * @param args the command line arguments
     * @throws java.awt.print.PrinterException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws PrinterException, IOException {
        // TODO code application logic here
        
        //DISPLAY ALL AVAILABLE PRINTER
        PrintService[] services = PrinterJob.lookupPrintServices();
        int index = 0;
        for (PrintService service : services) {
            System.err.println(index+": "+service.toString());
            index++;
        }
        
        //OPEN PDF
        File file = new File("E:\\PROJECT MANAGEMENT PROJECT\\Business Case Final.pdf");
        PDDocument doc = Loader.loadPDF(file);
        PDFPrintable printable = new PDFPrintable(doc);
        
        //SET PRINTER PROPERTIES
        PrinterJob PJ = PrinterJob.getPrinterJob();
        PJ.setPrintService(services[0]);
        
        //SET PDF PRINTABLE
        PJ.setPrintable(printable);
        
        //START TO PRINT
        PJ.print();
        
        //PRINT DIALOG
    }
    
}
