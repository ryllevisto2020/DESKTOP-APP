/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.MediaSizeName;

/**
 *
 * @author rylle
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DocFlavor flavor = DocFlavor.INPUT_STREAM.POSTSCRIPT;
   PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
   aset.add(MediaSizeName.ISO_A4);
   PrintService[] pservices =
                 PrintServiceLookup.lookupPrintServices(flavor, aset);
   if (pservices.length > 0) {
       DocPrintJob pj = pservices[0].createPrintJob();
       try {
           FileInputStream fis = new FileInputStream("test.ps");
           Doc doc = new SimpleDoc(fis, flavor, null);
           pj.print(doc, aset);
        } catch (FileNotFoundException fe) {
            System.err.println(fe);
        } catch (PrintException e) {
            System.err.println(e);
        }
   }
    }
    
}
