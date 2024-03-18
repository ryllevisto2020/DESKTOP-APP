Imports System.Text
Imports MySqlConnector

Public Class LoginModule
    Private Property _loginModel As New LoginModel
    Private Property connection As New MySqlConnection
    Private Property reader As MySqlDataReader
    Private Property cmd As New MySqlCommand
    Private Property _errorModel As New ErrorModel(vbEmpty, vbEmpty, vbEmpty)
    Private Property statement As String
    Sub New(username As String, password As String)
        connection.ConnectionString = "Server=localhost;Database=java;Uid=root;Pwd=;"
        With _loginModel
            .username = username
            .password = password
        End With
    End Sub
    Private Function Account_login() As Boolean
        Dim bool As Boolean
        Dim form2 As New Form2
        Dim form1 As Form1
        connection.Open()
        With _loginModel
            statement = "SELECT * FROM `java_account` WHERE `java_password` LIKE '" + .password + "' AND `java_username` LIKE '" + .username + "'"
        End With
        cmd = connection.CreateCommand
        cmd.CommandText = statement
        reader = cmd.ExecuteReader
        If reader.HasRows Then
            MsgBox("Account Login Success!", MsgBoxStyle.Information, "Login")
            bool = True
        Else
            MsgBox("Account Login Failed!", MsgBoxStyle.Critical, "Login")
            bool = False
        End If
        reader.Close()
        cmd.Dispose()
        connection.Close()
        Return bool
    End Function
    <Obsolete>
    Public Function Account_Validation() As Boolean
        Dim bool As Boolean
        Dim error_ As New List(Of ErrorModel)
        With _loginModel
            If .username.Equals("") Then
                error_.Add(New ErrorModel("failed", "Username is Invalid", "Empty Username"))
            End If

            If .password.Equals("") Then
                error_.Add(New ErrorModel("failed", "Password is Invalid", "Empty Password"))
            End If
        End With
        If error_.Count > 0 Then
            Dim error_message As New StringBuilder("")
            For index = 0 To error_.Count - 1
                error_message.Append(error_(index).message + vbNewLine)
            Next
            MsgBox(error_message.ToString, MsgBoxStyle.Critical, "Registration")
        Else
            bool = Account_login()
        End If
        Return bool
    End Function
    Public Function return_code() As Boolean
        Return True
    End Function
End Class
