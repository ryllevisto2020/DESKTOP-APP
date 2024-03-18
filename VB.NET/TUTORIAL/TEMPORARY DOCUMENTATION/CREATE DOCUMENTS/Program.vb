Imports System
Imports System.IO
Imports iText
Imports iTextSharp.text
Imports iTextSharp.text.pdf

Module Program
    Sub Main(args As String())

        'Create Documents
        Dim documents As New Document

        'Create Writer
        Dim writer As PdfWriter = PdfWriter.GetInstance(documents, New FileStream("docs.pdf", FileMode.OpenOrCreate))

        documents.Open()
        writer.Open()

        documents.Add(New Paragraph("Hello World"))

        documents.Close()
        writer.Close()
    End Sub
End Module
