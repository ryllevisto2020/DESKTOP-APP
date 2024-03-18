/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package PRINT_DOCUMENTS_REPORT_VIEWER;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import javax.print.PrintService;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPrintable;

/**
 *
 * @author rylle
 */
public class print_documents_report_viewer {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException, PrinterException {
        // TODO code application logic here
        
        /* Get All Printer Availabe */
        PrintService[] lookupPrintServices = PrinterJob.lookupPrintServices();
        int index = 0;
        for (PrintService lookupPrintService : lookupPrintServices) {
            System.err.println(index+":"+lookupPrintService);
            index++;
        }
        
        /* Create Job */
        PrinterJob print = PrinterJob.getPrinterJob();
        
        /* Set Printable Documents */
        PDDocument document = Loader.loadPDF(new File("docs.pdf"));
        PDFPrintable doc_print = new PDFPrintable(document);
        print.setPrintable(doc_print);
        
        /* Set Printer Properties */
        print.setPrintService(lookupPrintServices[3]);
        
        /* Print Document */
        print.print();
    }
}
