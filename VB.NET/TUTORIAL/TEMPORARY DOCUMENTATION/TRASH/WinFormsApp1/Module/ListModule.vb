Imports MySqlConnector

Public Class ListModule
    Private Property _listModel As New ListModel(vbEmpty, vbEmpty, vbEmpty, vbEmpty)
    Private Property connection As New MySqlConnection
    Private Property reader As MySqlDataReader
    Private Property cmd As New MySqlCommand
    Private Property statement As String
    Sub New()
        connection.ConnectionString = "Server=localhost;Database=java;Uid=root;Pwd=;"
    End Sub
    Public Function list_Get() As List(Of ListModel)
        connection.Open()
        statement = "SELECT * FROM `java_items`"
        cmd = connection.CreateCommand
        cmd.CommandText = statement
        reader = cmd.ExecuteReader
        While (reader.Read)
            MsgBox(reader.GetInt32(0))
        End While
        Dim _list As New List(Of ListModel)
        _list.Add(New ListModel(1, "adw", 2, 1.0))
        _list.Add(New ListModel(1, "adw", 3, 1.0))
        _list.Add(New ListModel(1, "adw", 4, 1.0))
        _list.Add(New ListModel(1, "adw", 5, 1.0))
        Return _list
    End Function
End Class
