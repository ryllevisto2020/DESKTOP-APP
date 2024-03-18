/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication22;

import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import javax.print.PrintService;
import javax.print.attribute.Attribute;
import javax.print.attribute.standard.*;
import javax.print.attribute.DocAttribute;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttribute;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.JobName;
import javax.print.attribute.standard.MediaSizeName;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.Orientation;
import org.apache.pdfbox.printing.PDFPageable;
import org.apache.pdfbox.printing.PDFPrintable;

/**
 *
 * @author rylle
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, PrinterException {
        // TODO code application logic here
        
        //first Call out the file using File Class
        File file = new File("E:\\PROJECT MANAGEMENT PROJECT\\Business Case Final.pdf");
        
        //Load the file in PDF Documents
        PDDocument doc = Loader.loadPDF(file);
        
        //
        PDFPageable pageable = new PDFPageable(doc, Orientation.PORTRAIT);
        
        //Get the number of pages 
        System.err.println(pageable.getNumberOfPages());
        
        //
        PDFPrintable printable = new PDFPrintable(doc);
        
        //Check all Printer Available
        PrintService[] service = PrinterJob.lookupPrintServices();
        PrinterJob job = PrinterJob.getPrinterJob();
        
        //Show the page dialog using PageFormat or PrintRequestAttributeSet
        //PageFormat Method
        PageFormat format = new PageFormat();
        format.setOrientation(PageFormat.PORTRAIT);
        Paper paper = new Paper();
        paper.setImageableArea(0, 0,100, 100);
        format.setPaper(paper);
        //job.pageDialog(format);
        
        //PrintRequestAttributeSet Method
        PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
        pras.add(MediaSizeName.ISO_A4);
        pras.add( new JobName("Visto", Locale.ITALY));
        //job.pageDialog(pras);
        
        //Initialize the Printable Documents
        job.setPrintable(printable);
        
        //Start Printing
        job.print();
    }
    
}
