Imports System

Module Program
    Sub Main(args As String())
        Dim visto As New student("visto")
        Console.WriteLine(visto.NewProperty)

        Dim visto_inherit As New student_inherit("visto_inherit")
        Console.WriteLine(visto_inherit.NewProperty)

    End Sub
End Module
Class student
    Private name As String
    Public Property NewProperty() As String
        Get
            Return name
        End Get
        Set(ByVal value As String)
            name = value
        End Set
    End Property
    Sub New(ByVal name_ As String)
        NewProperty = name_
    End Sub
End Class

Class student_inherit
    Inherits student
    Public Sub New(name_ As String)
        MyBase.New(name_)
    End Sub
End Class
