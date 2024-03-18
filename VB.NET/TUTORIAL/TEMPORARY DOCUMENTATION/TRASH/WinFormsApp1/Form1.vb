Public Class Form1
    Private Sub Label1_Click(sender As Object, e As EventArgs) Handles Label1.Click

    End Sub

    <Obsolete>
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim username As String
        Dim password As String
        Dim form2 As New Form2
        username = TextBox1.Text
        password = TextBox2.Text
        Dim mod_login As New LoginModule(username, password)
        Dim bool As Boolean
        bool = mod_login.Account_Validation()
        If bool Then
            form2.Show()
            Me.Close()
        End If
    End Sub

    <Obsolete>
    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Dim name As String
        Dim username As String
        Dim password As String
        username = TextBox4.Text
        password = TextBox3.Text
        name = TextBox5.Text
        Dim mod_register As New RegisterModule(username, password, name)
        mod_register.Account_Validation()
    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub
End Class
