Imports System
Imports System.IO
Imports System.Net
Imports System.Net.Sockets
Imports System.Reflection.Metadata
Imports System.Text

Module Program
    Sub Main(args As String())
        Dim message As String = "hello"
        Dim bytes As Byte() = Encoding.ASCII.GetBytes(message)
        Console.WriteLine(Encoding.ASCII.GetString(bytes, 0, 1))

        Dim file As File
        Dim byt As Object = File.ReadAllBytes("C:\Users\rylle\OneDrive\Documents\Book1.xlsx")
        File.WriteAllBytes("t.xlsx", byt)
        'Dim Socket As New Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp)
        'Console.Write("Name: ")
        'Dim name As String = Console.ReadLine()
        'Try
        'Socket.Connect(New IPEndPoint(New IPAddress(New Byte() {127, 0, 0, 1}), 2030))
        'While True
        'Console.Write("Message: ")
        'Dim message As String = Console.ReadLine()
        'Dim data As String = name + "," + message
        'Socket.Send(Encoding.ASCII.GetBytes(data))
        'End While
        'Catch ex As Exception
        'Console.WriteLine("Couldn't Connect to the target Machine!")
        'End Try
    End Sub
End Module
