Imports System
Imports System.IO
Imports System.Net
Imports System.Net.Http
Imports System.Net.Http.Headers

Module Program

    Sub Main(args As String())

        ' Create Web Client '
        Dim web_client As New WebClient()

        ' Create Stream '
        Dim web_stream As Stream = web_client.OpenRead("https://jsonplaceholder.typicode.com/posts")

        ' Create Stream Reader '
        Dim web_stream_reader As StreamReader = New StreamReader(web_stream)
        Console.WriteLine(web_stream_reader.ReadToEnd)

        ' Close Stream Reader '
        web_stream_reader.Close()

        ' Close Stream '
        web_stream.Close()


        Dim web_request As WebRequest = WebRequest.Create("https://jsonplaceholder.typicode.com/posts")
        web_request.Method = "POST"


        Dim web_response As HttpWebResponse = web_request.GetResponse
        Console.WriteLine(web_response.Method)

    End Sub
End Module
