Imports System
Imports System.Net
Imports System.Net.Sockets
Imports System.Text

Module Program
    Sub Main(args As String())
        Dim socket As New Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp)
        Try
            socket.Bind(New IPEndPoint(New IPAddress(New Byte() {127, 0, 0, 1}), 2030))
            socket.Listen(100)
            Console.WriteLine("Waiting....")
            Dim client As Socket = socket.Accept()
            Console.WriteLine(client.RemoteEndPoint)
            While True
                Dim v As Byte() = New Byte(client.SendBufferSize()) {}
                Console.WriteLine(client.Receive(v))
                Dim data_receive As String = Encoding.ASCII.GetString(v)
                Dim splitdata As String() = data_receive.Split(",")
                Console.WriteLine("From " + splitdata(0))
            End While
        Catch ex As Exception

        End Try
    End Sub
End Module
