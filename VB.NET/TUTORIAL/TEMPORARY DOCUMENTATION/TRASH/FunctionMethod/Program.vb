Imports System

Module Program
    Sub Main(args As String())
        function_()
        Console.WriteLine(function_params("Visto"))
    End Sub
    Sub function_()
        Console.WriteLine("hello World")
    End Sub
    Function function_params(ByVal name As String)
        Return name
    End Function
End Module
