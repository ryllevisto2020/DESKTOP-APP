Public Class ListModel
    Private _id As Integer
    Private _name As String
    Private _qty As Integer
    Private _price As Single

    Public Property id As Integer
        Get
            Return _id
        End Get
        Set
            _id = Value
        End Set
    End Property

    Public Property name As String
        Get
            Return _name
        End Get
        Set
            _name = Value
        End Set
    End Property

    Public Property qty As Integer
        Get
            Return _qty
        End Get
        Set
            _qty = Value
        End Set
    End Property

    Public Property price As Single
        Get
            Return _price
        End Get
        Set
            _price = Value
        End Set
    End Property
    Sub New(_id As Integer, _name As String, _qty As Integer, _price As Single)
        id = _id
        name = _name
        qty = _qty
        price = _price
    End Sub
End Class
