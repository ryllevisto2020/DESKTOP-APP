Imports System
Imports System.ComponentModel
Imports System.IO


Module Program
    Sub Main(args As String())
        'FILE HANDLING 

        'CREATING/OPENING/WRITING/READING/etc... USING FILEINFO
        Dim create_file As New FileInfo("test.txt")

        'CHECK FILE IF EXIST
        Dim isExist As Boolean = create_file.Exists()
        If isExist Then
            'TRUE

            'WRITE DATA TO FILE USING FILESTREAM
            Dim file_writer As FileStream = create_file.OpenWrite()
            Dim data_string As String = "Hello World! using FileStream"
            For index = 0 To data_string.Length - 1
                Dim data_bytes As Byte() = BitConverter.GetBytes(CChar(data_string(index)))
                file_writer.WriteByte(data_bytes(0))
            Next
            file_writer.Close()

            'WRITE DATA TO FILE USING STREAMWRITER
            'Dim stream_writer As StreamWriter = create_file.CreateText()
            'stream_writer.Write("Hello World! using StreamWriter")
            'stream_writer.Close()

            'READ DATA FROM FILE USING STREAMREADER
            Dim stream_reader As StreamReader = create_file.OpenText()
            Console.WriteLine(stream_reader.ReadToEnd())
            stream_reader.Close()

            'GET DIRECTORY NAME
            Dim directory As DirectoryInfo = create_file.Directory()
            Console.WriteLine("Directory Full Path: " + directory.FullName)
            Console.WriteLine("Name of File: " + create_file.Name)
            Console.WriteLine("File Extension: " + create_file.Extension)
        Else
            'FALSE
            create_file.Create().Close()
        End If


    End Sub
End Module
