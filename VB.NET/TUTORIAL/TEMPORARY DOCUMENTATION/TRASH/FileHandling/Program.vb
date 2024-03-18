Imports System
Imports System.IO


Module Program
    Sub Main(args As String())

        'FOR FILE
        Dim a As New FileInfo("test.txt")
        Dim directory As String = a.DirectoryName.ToString

        'Check if file is exist
        If a.Exists Then
            Console.WriteLine("Exist")
        Else
            Console.WriteLine("Not Exist")
            'Create file
            a.Create().Close()
            'Write data to the file
            Dim sw As New StreamWriter("test.txt")
            sw.Write("awdd")
            sw.Close()
        End If
        'Read data from file
        Dim sr As New StreamReader("test.txt")
        Console.WriteLine(sr.ReadLine)

        'FOR DIRECTORY
        Dim dir As New DirectoryInfo("test")
        'create folder
        dir.Create()

        'delete folder
        dir.Delete(True) 'true for delete if the folder is don't have any subdirectories

    End Sub
End Module
