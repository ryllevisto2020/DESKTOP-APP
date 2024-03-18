<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        TextBox1 = New TextBox()
        TextBox2 = New TextBox()
        Label1 = New Label()
        Label2 = New Label()
        Button1 = New Button()
        Button2 = New Button()
        Label3 = New Label()
        Label4 = New Label()
        TextBox3 = New TextBox()
        TextBox4 = New TextBox()
        Label5 = New Label()
        TextBox5 = New TextBox()
        SuspendLayout()
        ' 
        ' TextBox1
        ' 
        TextBox1.Location = New Point(68, 68)
        TextBox1.Name = "TextBox1"
        TextBox1.Size = New Size(175, 23)
        TextBox1.TabIndex = 0
        ' 
        ' TextBox2
        ' 
        TextBox2.Location = New Point(68, 116)
        TextBox2.Name = "TextBox2"
        TextBox2.Size = New Size(175, 23)
        TextBox2.TabIndex = 1
        ' 
        ' Label1
        ' 
        Label1.AutoSize = True
        Label1.Location = New Point(128, 50)
        Label1.Name = "Label1"
        Label1.Size = New Size(60, 15)
        Label1.TabIndex = 2
        Label1.Text = "Username"
        ' 
        ' Label2
        ' 
        Label2.AutoSize = True
        Label2.Location = New Point(128, 98)
        Label2.Name = "Label2"
        Label2.Size = New Size(57, 15)
        Label2.TabIndex = 3
        Label2.Text = "Password"
        ' 
        ' Button1
        ' 
        Button1.Location = New Point(117, 148)
        Button1.Name = "Button1"
        Button1.Size = New Size(75, 23)
        Button1.TabIndex = 4
        Button1.Text = "Login"
        Button1.UseVisualStyleBackColor = True
        ' 
        ' Button2
        ' 
        Button2.Location = New Point(343, 170)
        Button2.Name = "Button2"
        Button2.Size = New Size(75, 23)
        Button2.TabIndex = 9
        Button2.Text = "Register"
        Button2.UseVisualStyleBackColor = True
        ' 
        ' Label3
        ' 
        Label3.AutoSize = True
        Label3.Location = New Point(354, 120)
        Label3.Name = "Label3"
        Label3.Size = New Size(57, 15)
        Label3.TabIndex = 8
        Label3.Text = "Password"
        ' 
        ' Label4
        ' 
        Label4.AutoSize = True
        Label4.Location = New Point(354, 76)
        Label4.Name = "Label4"
        Label4.Size = New Size(60, 15)
        Label4.TabIndex = 7
        Label4.Text = "Username"
        ' 
        ' TextBox3
        ' 
        TextBox3.Location = New Point(294, 138)
        TextBox3.Name = "TextBox3"
        TextBox3.PasswordChar = "*"c
        TextBox3.Size = New Size(175, 23)
        TextBox3.TabIndex = 6
        ' 
        ' TextBox4
        ' 
        TextBox4.Location = New Point(294, 94)
        TextBox4.Name = "TextBox4"
        TextBox4.Size = New Size(175, 23)
        TextBox4.TabIndex = 5
        ' 
        ' Label5
        ' 
        Label5.AutoSize = True
        Label5.Location = New Point(363, 32)
        Label5.Name = "Label5"
        Label5.Size = New Size(39, 15)
        Label5.TabIndex = 11
        Label5.Text = "Name"
        ' 
        ' TextBox5
        ' 
        TextBox5.Location = New Point(294, 50)
        TextBox5.Name = "TextBox5"
        TextBox5.Size = New Size(175, 23)
        TextBox5.TabIndex = 10
        ' 
        ' Form1
        ' 
        AutoScaleDimensions = New SizeF(7F, 15F)
        AutoScaleMode = AutoScaleMode.Font
        ClientSize = New Size(565, 246)
        Controls.Add(Label5)
        Controls.Add(TextBox5)
        Controls.Add(Button2)
        Controls.Add(Label3)
        Controls.Add(Label4)
        Controls.Add(TextBox3)
        Controls.Add(TextBox4)
        Controls.Add(Button1)
        Controls.Add(Label2)
        Controls.Add(Label1)
        Controls.Add(TextBox2)
        Controls.Add(TextBox1)
        FormBorderStyle = FormBorderStyle.FixedDialog
        MaximizeBox = False
        MinimizeBox = False
        Name = "Form1"
        StartPosition = FormStartPosition.CenterScreen
        Text = "Form1"
        ResumeLayout(False)
        PerformLayout()
    End Sub

    Friend WithEvents TextBox1 As TextBox
    Friend WithEvents TextBox2 As TextBox
    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Button1 As Button
    Friend WithEvents Button2 As Button
    Friend WithEvents Label3 As Label
    Friend WithEvents Label4 As Label
    Friend WithEvents TextBox3 As TextBox
    Friend WithEvents TextBox4 As TextBox
    Friend WithEvents Label5 As Label
    Friend WithEvents TextBox5 As TextBox
End Class
