Imports System
Imports System.IO
Imports System.Text


Module Program
    Sub Main(args As String())

        'Create, Read Data , Write Data , Copy , Delete , Move Files

        'CREATE FILES
        'Create File Initializer
        Dim file As New FileInfo("test.txt")
        'Check for existing
        Console.WriteLine(file.Exists)
        'Create File and Close
        file.Create().Close()

        '----------------------------------------------------------------------------------------------------------------------------'

        'WRITE DATA
        'Write Data to File
        Dim file_open As Stream = file.Open(FileMode.Open)
        Dim data As String = "hello world"
        'Convert Data Types to Bytes/Bytes Array
        Dim data_bytes As Byte() = Encoding.ASCII.GetBytes(data)
        file_open.Write(data_bytes, 0, data_bytes.Length)
        file_open.Close()

        '----------------------------------------------------------------------------------------------------------------------------'

        'READ DATA
        'Read Data from File
        Dim file_read As Stream = file.Open(FileMode.Open)
        Dim length As Integer = file_read.Length
        Dim data_read As Byte() = New Byte(length) {}
        For i As Integer = 0 To length - 1
            data_read(i) = file_read.ReadByte
        Next
        'Convert Bytes/Bytes Array to Data Types
        Console.WriteLine(Encoding.ASCII.GetString(data_read))
        file_read.Close()

        '----------------------------------------------------------------------------------------------------------------------------'

        'COPY FILES
        'Create File Initializer
        Dim file_copy As New FileInfo("test_copy.txt")
        'Check for existing
        Console.WriteLine(file_copy.Exists)
        'Create File and Close
        file_copy.Create().Close()

        'Open Source File
        Dim file_source As New FileInfo("test.txt")
        Dim file_source_open As Stream = file_source.Open(FileMode.Open)
        Dim file_source_length As Integer = file_source_open.Length
        Dim file_source_data_bytes As Byte() = New Byte(file_source_length) {}
        For i As Integer = 0 To file_source_length - 1
            file_source_data_bytes(i) = file_source_open.ReadByte
        Next
        file_source_open.Close()

        'Open Destination File
        Dim file_copy_open As Stream = file_copy.Open(FileMode.Open)
        file_copy_open.Write(file_source_data_bytes, 0, file_source_data_bytes.Length - 1)
        file_copy_open.Close()

        '----------------------------------------------------------------------------------------------------------------------------'


    End Sub
End Module
