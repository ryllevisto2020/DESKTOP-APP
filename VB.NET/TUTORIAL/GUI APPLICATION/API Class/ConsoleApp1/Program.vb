Imports System
Imports System.IO
Imports file_handling_api.file
Module Program
    Sub Main(args As String())
        Dim file_handling As New file_handling_api.file

        file_handling.copy("E:\PROJECT - SCRATCH\PRACTICE CODE\FAQ.txt", "E:\PROJECT - SCRATCH\PRACTICE CODE", "this is copy.txt")
    End Sub
End Module
