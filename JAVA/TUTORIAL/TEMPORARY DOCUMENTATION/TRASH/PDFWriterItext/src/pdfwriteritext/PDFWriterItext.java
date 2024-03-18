/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pdfwriteritext;
import com.itextpdf.awt.*;
import com.itextpdf.testutils.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.xmp.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
/**
 *
 * @author rylle
 */
public class PDFWriterItext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        // TODO code application logic here
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));

        //Simple Paragraph
        document.open();
        //document.add(new Paragraph("Hello World"));
        //document.close();
        //writer.close();
        
        //Creating Table
        PdfPTable table = new PdfPTable(1);
        //table.setWidthPercentage(100);
        //table.setSpacingBefore(1000f);
        //table.setSpacingAfter(10f);
        //float[] width = {1f};
        //table.setWidths(width);
        
        Paragraph para = new Paragraph();
        Font font = new Font();
        font.setSize(15);
        para.setFont(font);
        
        para.add("SAM'S CLUB");
        para.add("\nCLUB MANAGERS ROBY MAYS"
                + "\n(573)469 - 0917"
                + "\n849 SIONERIDGE PKWAY JEFFRESON CITY,MO"
                + "\n04/11/2 10:19 6126 06505 001 762\n\n");
        
        PdfPCell cell = new PdfPCell(para);
        cell.setBorderColor(BaseColor.WHITE);
        cell.setPaddingLeft(10);
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        
        table.addCell(cell);
        //////////////////////////////////////////////////////
        PdfPTable table1 = new PdfPTable(4);
        table1.setWidthPercentage(100);
        float[] width = {1f,1f,1f,1f};
        table1.setWidths(width);
        
        PdfPCell cell1 = new PdfPCell(new Paragraph("Qty"));
        cell1.setBorderColor(BaseColor.BLACK);
        cell1.setPaddingLeft(10);
        cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell1.setVerticalAlignment(Element.ALIGN_MIDDLE);
        
        PdfPCell cell2 = new PdfPCell(new Paragraph("Product"));
        cell2.setBorderColor(BaseColor.BLACK);
        cell2.setPaddingLeft(10);
        cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
        
        PdfPCell cell3 = new PdfPCell(new Paragraph("Price"));
        cell3.setBorderColor(BaseColor.BLACK);
        cell3.setPaddingLeft(10);
        cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
        
        PdfPCell cell4 = new PdfPCell(new Paragraph("Total"));
        cell4.setBorderColor(BaseColor.BLACK);
        cell4.setPaddingLeft(10);
        cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell4.setVerticalAlignment(Element.ALIGN_MIDDLE);
        
        table1.addCell(cell1);
        table1.addCell(cell2);
        table1.addCell(cell3);
        table1.addCell(cell4);
        ///////////////////////////////////////////////////////
        PdfPTable table2 =  new PdfPTable(1);
        table2.setWidthPercentage(100);
        float[] widths = {1f};
        table2.setWidths(widths);
        
        //PdfPCell test = new PdfPCell(new Paragraph("test"));
        //test.setBorderColor(BaseColor.BLACK);
        //test.setPaddingLeft(10);
        //test.setHorizontalAlignment(Element.ALIGN_CENTER);
        //test.setVerticalAlignment(Element.ALIGN_MIDDLE);
        
        //PdfPCell test1 = new PdfPCell(new Paragraph("test"));
        //test1.setBorderColor(BaseColor.BLACK);
        //test1.setPaddingLeft(10);
        //test1.setHorizontalAlignment(Element.ALIGN_CENTER);
        //test1.setVerticalAlignment(Element.ALIGN_MIDDLE);
        
        //table2.addCell(test);
        //table2.addCell(test1);
        
        for (int i = 0; i < 10; i++) {
            PdfPCell test = new PdfPCell(new Paragraph((String.valueOf(i))));
            test.setBorderColor(BaseColor.BLACK);
            test.setPaddingLeft(10);
            test.setHorizontalAlignment(Element.ALIGN_CENTER);
            test.setVerticalAlignment(Element.ALIGN_MIDDLE);
            table2.addCell(test);
        }
        ///////////////////////////////////////////////////////
        document.add(table);
        document.add(table1);
        document.add(table2);
        document.close();
        writer.close();
    }
    
}
