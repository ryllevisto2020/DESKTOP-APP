Imports System
Imports System.Linq.Expressions

Module Program
    Sub Main(args As String())
        Dim t As Boolean
        t = True
        If t Then
            Console.WriteLine("true")
        End If

        Dim t_ As Boolean
        t_ = False
        If t_ Then

        Else
            Console.WriteLine("false")
        End If

        Dim s As Integer
        s = 1
        Select Case s
            Case 1
                Console.WriteLine("Case 1")
            Case 2
                Console.WriteLine("Case 2")
            Case Else
                Console.WriteLine("Case Else")
        End Select
    End Sub
End Module
