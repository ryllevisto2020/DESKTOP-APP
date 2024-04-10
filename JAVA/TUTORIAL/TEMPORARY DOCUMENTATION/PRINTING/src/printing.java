
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.*;
import javax.print.attribute.PrintServiceAttributeSet;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPrintable;
import org.apache.pdfbox.tools.PDFBox;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author rylle
 */
public class printing {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException, PrinterException {
        // TODO code application logic here
        
        PrintService[] lookupPrintServices = PrinterJob.lookupPrintServices();
        for (PrintService lookupPrintService : lookupPrintServices) {
            System.err.println(lookupPrintService);
        }
        
        File file = new File("E:\\PROJECT - SCRATCH\\PRACTICE CODE\\2 DESKTOP APP AND CLI APP\\JAVA\\TUTORIAL\\TEMPORARY DOCUMENTATION\\PRINTING\\proposal.pdf");
        PDDocument loadPDF = Loader.loadPDF(file);
        
        PDFPrintable printable_pdf = new PDFPrintable(loadPDF);
        
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintService(lookupPrintServices[0]);
        
        job.setPrintable(printable_pdf);
        PageFormat format = new PageFormat();
        format.setOrientation(PageFormat.LANDSCAPE);
        
        PrintRequestAttributeSet a = new HashPrintRequestAttributeSet();
        
        job.printDialog(a);
        job.print(a);
        
    }
}
