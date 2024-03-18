Imports System

Module Program
    Sub Main(args As String())
        'Variables'
        Dim name As String
        'Varialbes Initialize'
        name = "visto"

        'Array'
        Dim num(2) As Integer
        num(0) = 1
        num(1) = 2
        'Array Initialize'
        Dim num_ = New Integer() {1, 2}

        'List'
        Dim list As New List(Of String)
        list.Add("visto")

        'Dictionary'
        Dim dict As New Dictionary(Of String, List(Of String))
        dict.Add("1", list)

        Dim test_class As New test_class("visto")
    End Sub
End Module

Class test_class
    'Encapsulation'
    Private _name As String
    Public Property name As String
        Get
            Return _name
        End Get
        Set
            _name = Value
        End Set
    End Property
    'Constructor'
    Sub New(ByVal name As String)
        _name = name
    End Sub
End Class