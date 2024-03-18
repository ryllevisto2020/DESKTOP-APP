Imports System.Configuration
Imports System.IO
Imports System.Net.Configuration
Imports System.Windows.Forms.VisualStyles.VisualStyleElement.StartPanel
Imports MaterialSkin
Public Class Form1
    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles MyBase.Load

        'Dim SkinManager As MaterialSkinManager = MaterialSkinManager.Instance
        'SkinManager.AddFormToManage(Me)
        'SkinManager.Theme = MaterialSkinManager.Themes.LIGHT
        ''SkinManager.ColorScheme = New ColorScheme(Primary.BlueGrey800, Primary.BlueGrey900, Primary.BlueGrey500, Accent.LightBlue200, TextShade.WHITE)
        ''Me.BackColor = System.Drawing.Color.FromArgb(10, 34, 57)
        Dim title As String
        title = My.Settings.Title
        Me.Text = title + " | POS v1.0"
        My.Settings.Title = "Default"
        My.Settings.Save()
        Dim i As Image
        i = Image.FromFile(Path.GetFullPath(AppDomain.CurrentDomain.BaseDirectory + "Resources\logo_MAGNUS-removebg-preview.png"))
        PictureBox1.Image = i
    End Sub

    Private Sub IconButton1_Click(sender As Object, e As EventArgs) Handles IconButton1.Click
    End Sub
End Class
