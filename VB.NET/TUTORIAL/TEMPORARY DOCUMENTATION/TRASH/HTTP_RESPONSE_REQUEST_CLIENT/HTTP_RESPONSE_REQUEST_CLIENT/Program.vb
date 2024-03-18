Imports System
Imports System.IO
Imports System.Net
Imports Newtonsoft.Json

Module Program
    Sub Main(args As String())
        'HTTP REQUEST/CLIENT USING WEB CLIENT
        Dim web_client As New WebClient()
        'CREATE URL 
        Dim url As New Uri("https://jsonplaceholder.typicode.com/posts")

        'OPEN URL
        Dim stream As Stream = web_client.OpenRead(url)
        Dim stream_reader As New StreamReader(stream)

        'READ RESPONSE DATA
        'Console.WriteLine(stream_reader.ReadToEnd)

        'CONVERT RESPONSE DATA TO STRING
        Dim data_string As String
        data_string = Convert.ToString(stream_reader.ReadToEnd)

        'READ RESPONSE DATA IN STRING FORMAT/DATA TYPES
        'Console.WriteLine(data_string)

        'CONVERT STRING TO JSON FORMAT/DATA TYPES
        Dim data_json As New Object
        data_json = JsonConvert.DeserializeObject(data_string)

        'READ RESPONSE DATA IN JSON FORMAT/DATA TYPES
        'GET SPECIFIC DATA 
        Console.WriteLine(data_json(0))
        Console.WriteLine("User ID: " + data_json(0)("userId").ToString)
        Console.WriteLine("ID: " + data_json(0)("id").ToString)
        Console.WriteLine("Title: " + data_json(0)("title").ToString)
        Console.WriteLine("Body: " + data_json(0)("body").ToString)

    End Sub
End Module
