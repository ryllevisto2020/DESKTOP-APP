Imports System.IO
Imports System.Reflection

Public Class Form2
    Dim file As FileInfo
    Dim file_exist As FileInfo
    Dim extension As String
    Dim filename As String
    Private Sub Button1_Click(sender As Object, e As EventArgs)

    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        OpenFileDialog1.Filter = "All Graphics Types|*.jpg;*.jpeg;*.png;"
        If OpenFileDialog1.ShowDialog.Equals(DialogResult.OK) Then
            TextBox1.Text = OpenFileDialog1.FileName
            file = New FileInfo(TextBox1.Text)
            extension = file.Extension
            filename = file.Name
            file_exist = New FileInfo(Path.GetFullPath(AppDomain.CurrentDomain.BaseDirectory + "\Resources\" + filename))
            If file_exist.Exists Then
                MsgBox("Image Exist! Please Try Again!", MsgBoxStyle.Critical, "Upload Logo Notice!")
                TextBox1.Text = ""
                filename = ""
            End If
        End If
    End Sub

    Private Sub Form2_Load(sender As Object, e As EventArgs) Handles MyBase.Load

    End Sub

    Private Sub Button1_Click_1(sender As Object, e As EventArgs) Handles Button1.Click
        If filename.Equals("") Then
            MsgBox("No Image! Please Try Again!", MsgBoxStyle.Critical, "Upload Logo Notice!")
        Else
            file.CopyTo(Path.GetFullPath(AppDomain.CurrentDomain.BaseDirectory + "\Resources\" + filename))
        End If
    End Sub
End Class