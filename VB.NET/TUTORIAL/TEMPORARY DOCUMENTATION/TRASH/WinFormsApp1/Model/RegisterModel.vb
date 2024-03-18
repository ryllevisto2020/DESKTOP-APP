Public Class RegisterModel
    Private _username As String
    Private _password As String
    Private _name As String
    Public Property name As String
        Get
            Return _name
        End Get
        Set
            _name = Value
        End Set
    End Property

    Public Property username As String
        Get
            Return _username
        End Get
        Set
            _username = Value
        End Set
    End Property
    Public Property password As String
        Get
            Return _password
        End Get
        Set
            _password = Value
        End Set
    End Property
End Class
