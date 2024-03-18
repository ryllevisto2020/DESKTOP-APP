Imports System
Imports System.Collections.Specialized
Imports System.IO
Imports System.Net
Imports System.Net.Http
Imports System.Runtime.InteropServices.JavaScript
Imports System.Text
Imports Newtonsoft.Json
Imports Newtonsoft.Json.Linq

Module Program
    <Obsolete>
    Sub Main(args As String())
        Dim web_client As WebClient = New WebClient()

        'Send Http Post Data Request
        Dim post_data As New NameValueCollection
        post_data.Add("id_post", 2)
        post_data.Add("user_post", "Goodbye World")
        web_client.UploadValues("http://localhost:3000/post", "POST", post_data)

        'Set Request headers
        web_client.Headers.Set("Request-headers", "true")
        'Get All Request Headers
        Console.WriteLine(web_client.Headers)

        Dim data As Stream = web_client.OpenRead("http://localhost:3000/post")
        Dim reader As StreamReader = New StreamReader(data)
        Dim line As String = ""
        line = reader.ReadLine()
        Dim all_data As New StringBuilder
        Try
            While line.Length > 0
                all_data.Append(line + vbNewLine)
                'Console.WriteLine(line)
                line = reader.ReadLine()
            End While

        Catch ex As Exception
        End Try
        Dim data_json = JsonConvert.DeserializeObject(all_data.ToString)
        Console.WriteLine(data_json(0))
        'Set Response Headers
        web_client.ResponseHeaders.Set("Response-headers", "true")
        'Get All Response Headers
        Console.WriteLine(web_client.ResponseHeaders)
    End Sub
End Module
Class a


End Class
