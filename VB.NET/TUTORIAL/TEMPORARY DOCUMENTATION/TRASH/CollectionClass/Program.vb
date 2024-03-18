Imports System

Module Program
    Sub Main(args As String())
        Dim arra As Integer() = {1, 2}
        For index = 0 To arra.Length - 1
            Console.WriteLine(arra(index))
        Next

        Dim array_list As New ArrayList
        array_list.Add("hello")
        array_list.Add("World")
        Console.WriteLine(array_list(1))

        Dim dict As New Dictionary(Of String, String)
        dict.Add("Name", "Visto")
        Console.WriteLine(dict("Name"))

        Dim hash As New Hashtable
        hash.Add("awd", "awd")
        Console.WriteLine(hash("awd"))
    End Sub
End Module
