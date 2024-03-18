Public Class Form2
    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        Dim form1 As New Form1
        form1.Show()
        Me.Close()
    End Sub

    Private Sub Form2_Load(sender As Object, e As EventArgs) Handles MyBase.Load
        Dim _list As New List(Of ListModel)
        Dim mod_list As New ListModule
        _list = mod_list.list_Get
        For index = 0 To _list.Count - 1
            Dim listview As ListViewItem = New ListViewItem(New String() {_list(index).id, _list(index).name, _list(index).qty, _list(index).price})
            ListView1.Items.AddRange(New ListViewItem() {listview})
        Next
        MsgBox(_list(0).price)
    End Sub
End Class