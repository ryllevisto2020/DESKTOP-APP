<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form2
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
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
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Dim ListViewItem1 As ListViewItem = New ListViewItem(New String() {"test", "test", "test", "test"}, -1)
        Button1 = New Button()
        ListView1 = New ListView()
        ColumnHeader1 = New ColumnHeader()
        ColumnHeader2 = New ColumnHeader()
        ColumnHeader3 = New ColumnHeader()
        ColumnHeader4 = New ColumnHeader()
        SuspendLayout()
        ' 
        ' Button1
        ' 
        Button1.Location = New Point(16, 415)
        Button1.Name = "Button1"
        Button1.Size = New Size(75, 23)
        Button1.TabIndex = 0
        Button1.Text = "Logout"
        Button1.UseVisualStyleBackColor = True
        ' 
        ' ListView1
        ' 
        ListView1.Columns.AddRange(New ColumnHeader() {ColumnHeader1, ColumnHeader2, ColumnHeader3, ColumnHeader4})
        ListView1.Items.AddRange(New ListViewItem() {ListViewItem1})
        ListView1.Location = New Point(109, 12)
        ListView1.Name = "ListView1"
        ListView1.Size = New Size(679, 426)
        ListView1.TabIndex = 1
        ListView1.UseCompatibleStateImageBehavior = False
        ListView1.View = View.Details
        ' 
        ' ColumnHeader1
        ' 
        ColumnHeader1.Text = "Id"
        ColumnHeader1.Width = 168
        ' 
        ' ColumnHeader2
        ' 
        ColumnHeader2.Text = "Name"
        ColumnHeader2.Width = 168
        ' 
        ' ColumnHeader3
        ' 
        ColumnHeader3.Text = "Qty"
        ColumnHeader3.Width = 168
        ' 
        ' ColumnHeader4
        ' 
        ColumnHeader4.Text = "Price"
        ColumnHeader4.Width = 168
        ' 
        ' Form2
        ' 
        AutoScaleDimensions = New SizeF(7.0F, 15.0F)
        AutoScaleMode = AutoScaleMode.Font
        ClientSize = New Size(800, 450)
        Controls.Add(ListView1)
        Controls.Add(Button1)
        FormBorderStyle = FormBorderStyle.FixedDialog
        MaximizeBox = False
        MinimizeBox = False
        Name = "Form2"
        StartPosition = FormStartPosition.CenterScreen
        Text = "Form2"
        ResumeLayout(False)
    End Sub

    Friend WithEvents Button1 As Button
    Friend WithEvents ListView1 As ListView
    Friend WithEvents ColumnHeader1 As ColumnHeader
    Friend WithEvents ColumnHeader2 As ColumnHeader
    Friend WithEvents ColumnHeader3 As ColumnHeader
    Friend WithEvents ColumnHeader4 As ColumnHeader
End Class
