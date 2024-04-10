Imports System.IO

Public Class file
    Sub copy(ByVal src_path As String, ByVal dst_path As String, ByVal dst_name As String)
        'Src
        Dim src_file As New FileInfo(src_path)

        'Dst
        Dim dst_file As New FileInfo(dst_path + "\" + dst_name)

        ' Read src_file
        Dim src_file_stream As FileStream = src_file.Open(FileMode.Open)
        ' Get the Size/Length of src_file
        Dim src_size As Integer = src_file_stream.Length
        ' Create Data Byte/s Storage
        Dim src_data As Byte() = New Byte(src_size) {}
        ' Read and Store the Bytes 
        For i As Integer = 0 To src_size - 1
            src_data(i) = src_file_stream.ReadByte
        Next
        ' Close src_file_stream
        src_file_stream.Close()

        ' Create dst_file
        Dim dst_file_stream As FileStream = dst_file.Open(FileMode.OpenOrCreate)
        ' Write Data Byte/s to dst_file
        dst_file_stream.Write(src_data, 0, src_size)
        ' Close dst_file_stream'
        dst_file_stream.Close()
    End Sub

    Sub move(ByVal src_path As String, ByVal dst_path As String, ByVal dst_name As String)
        'Src
        Dim src_file As New FileInfo(src_path)

        'Dst
        Dim dst_file As New FileInfo(dst_path + "\" + dst_name)

        ' Read src_file
        Dim src_file_stream As FileStream = src_file.Open(FileMode.Open)
        ' Get the Size/Length of src_file
        Dim src_size As Integer = src_file_stream.Length
        ' Create Data Byte/s Storage
        Dim src_data As Byte() = New Byte(src_size) {}
        ' Read and Store the Bytes 
        For i As Integer = 0 To src_size - 1
            src_data(i) = src_file_stream.ReadByte
        Next
        ' Close src_file_stream
        src_file_stream.Close()

        ' Create dst_file
        Dim dst_file_stream As FileStream = dst_file.Open(FileMode.OpenOrCreate)
        ' Write Data Byte/s to dst_file
        dst_file_stream.Write(src_data, 0, src_size)
        ' Close dst_file_stream'
        dst_file_stream.Close()

        'Delete src_file
        src_file.Delete()
    End Sub
End Class
