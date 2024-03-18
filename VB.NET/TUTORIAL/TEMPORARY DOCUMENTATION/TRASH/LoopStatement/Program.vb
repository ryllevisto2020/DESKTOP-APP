Imports System

Module Program
    Sub Main(args As String())
        'For Loop
        For index = 1 To 10
            Console.WriteLine(index.ToString)
        Next
        Console.WriteLine(vbNewLine)

        'For Loop with Step
        For index_step = 1 To 10 Step 2
            Console.WriteLine(index_step)
        Next
        Console.WriteLine(vbNewLine)

        'For Each Loop
        Dim array As Integer() = {1, 2, 3}
        For Each array_as As Integer In array
            Console.WriteLine(array_as)
        Next
        Console.WriteLine(vbNewLine)

        'While Loop
        Dim count As Integer = 0
        While count < 5
            count = count + 1
            Console.WriteLine(count)
        End While
        Console.WriteLine(vbNewLine)

        'Do While Loop
        Dim count_ As Integer = 0
        Do While count_ < 5
            count_ = count_ + 1
            Console.WriteLine(count_)
        Loop
        Console.WriteLine(vbNewLine)

        'Do Loop Until
        Dim count_a As Integer = 0
        Do
            count_a = count_a + 1
            Console.WriteLine(count_a)
        Loop Until count_a = 5
    End Sub
End Module
