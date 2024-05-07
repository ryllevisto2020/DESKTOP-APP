Imports System
Imports System.Net
Imports System.Net.NetworkInformation
Imports System.Net.Sockets
Imports System.Text

Module Program
    Sub Main(args As String())
        Dim address() As Byte = New Byte() {192, 168, 0, 254}
        Dim locapIpAddress As New IPAddress(address)
        Dim server As New TcpListener(locapIpAddress, 2030)
        server.Start(1)
        Dim client As TcpClient = server.AcceptTcpClient()
        Dim client_stream As NetworkStream = client.GetStream
        Dim a As String = New String("visto")

        client_stream.Write(ASCIIEncoding.ASCII.GetBytes(a), 0, ASCIIEncoding.ASCII.GetBytes(a).Length)
        Console.WriteLine("send")
        Dim d() As Byte = New Byte(22) {}
        Console.WriteLine(client_stream.Read(d, 0, d.Length))
        Console.WriteLine(ASCIIEncoding.UTF8.GetString(d))
    End Sub

    Function C() As Task(Of String)
        Return Task.FromResult("awd")
    End Function

End Module
