Public Class ErrorModel
    Private _status As String
    Private _message As String
    Private _info As String

    Public Property status As String
        Get
            Return _status
        End Get
        Set
            _status = Value
        End Set
    End Property

    Public Property message As String
        Get
            Return _message
        End Get
        Set
            _message = Value
        End Set
    End Property

    Public Property info As String
        Get
            Return _info
        End Get
        Set
            _info = Value
        End Set
    End Property
    Sub New(status_ As String, message_ As String, info_ As String)
        status = status_
        message = message_
        info = info_
    End Sub
End Class
