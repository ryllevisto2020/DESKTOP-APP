Imports System.Windows.Forms.VisualStyles.VisualStyleElement.ProgressBar

Public Class Form3
    Private Property count As Integer
    Sub New()

        ' This call is required by the designer.
        InitializeComponent()
        count = 0
        ProgressBar1.Minimum = 1
        ProgressBar1.Maximum = 100
        'Me.BackColor = Color.FromArgb(0, 0, 0, 0)
        ' Add any initialization after the InitializeComponent() call.

    End Sub
    Private Sub Form3_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Timer1.Enabled = True
        Timer1.Start()
    End Sub

    Private Sub Timer1_Tick(sender As Object, e As EventArgs) Handles Timer1.Tick
        count = count + 1
        ProgressBar1.Value = count
        If ProgressBar1.Value.Equals(ProgressBar1.Maximum) Then
            Timer1.Stop()
            If My.Settings.Configuration_Status Then
                Dim form1 As New Form1
                form1.Show()
                Me.Close()
            Else
                Dim form2 As New Form2
                MsgBox("Configuration of Application is Required!", MsgBoxStyle.Exclamation, "Configuration Notice!")
                form2.Show()
                Me.Close()
            End If
        End If
    End Sub
End Class