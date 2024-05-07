Imports System
Imports System.IO

Module Program
    Sub Main(args As String())
        Dim files As File
        Dim file_stream As FileStream = files.Create("test.txt", 1024)
        file_stream.WriteByte(111)

        Dim stream_writer As BufferedStream = New BufferedStream(file_stream)
        stream_writer.WriteByte(112)
        stream_writer.Close()

    End Sub
End Module
