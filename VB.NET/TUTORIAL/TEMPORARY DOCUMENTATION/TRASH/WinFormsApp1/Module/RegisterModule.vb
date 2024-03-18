Imports System.Text
Imports System.Windows.Forms.VisualStyles.VisualStyleElement
Imports MySqlConnector

Public Class RegisterModule
    Private Property _registerModel As New RegisterModel
    Private Property connection As New MySqlConnection
    Private Property reader As MySqlDataReader
    Private Property cmd As New MySqlCommand
    Private Property _errorModel As New ErrorModel(vbEmpty, vbEmpty, vbEmpty)
    Private Property statement As String
    Sub New(username As String, password As String, name As String)
        connection.ConnectionString = "Server=localhost;Database=java;Uid=root;Pwd=;"
        With _registerModel
            .name = name
            .username = username
            .password = password
        End With
    End Sub
    Private Sub Account_Register()
        connection.Open()
        With _registerModel
            statement = "INSERT INTO `java_account` (`id`, `java_username`, `java_password`, `java_name`) VALUES (NULL, '" + .username + "', '" + .password + "', '" + .name + "');"
        End With
        cmd = connection.CreateCommand
        cmd.CommandText = statement
        cmd.ExecuteNonQuery()
        MsgBox("Account Successfully Added!", MsgBoxStyle.Information, "Registration Success")
        cmd.Dispose()
        connection.Close()
    End Sub

    <Obsolete>
    Public Sub Account_Validation()
        Dim error_ As New List(Of ErrorModel)
        With _registerModel
            If .name.Equals("") Then
                error_.Add(New ErrorModel("failed", "Name is Invalid", "Empty Name"))
            End If

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
            Account_Exist()
        End If
    End Sub
    Private Sub Account_Exist()
        connection.Open()
        With _registerModel
            statement = "SELECT * FROM `java_account` WHERE `java_username` LIKE '" + .username + "'"
        End With
        cmd = connection.CreateCommand
        cmd.CommandText = statement
        reader = cmd.ExecuteReader
        If reader.HasRows Then
            MsgBox("Account is Not Available!", MsgBoxStyle.Critical, "Registration")
        Else
            cmd.Dispose()
            connection.Close()
            Account_Register()
        End If
        cmd.Dispose()
        connection.Close()
    End Sub
End Class
