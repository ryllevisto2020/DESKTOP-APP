Imports System
Imports MySqlConnector
Module Program
    Sub Main(args As String())
        'DATABASE MYSQL
        Dim connection As New MySqlConnection
        Dim reader As MySqlDataReader
        Dim cmd As New MySqlCommand

        'CREATE CONNECTION STRING
        connection.ConnectionString = "Server=localhost;Database=visual_basic;Uid=root;Pwd=;"

        'VIEW ALL DATA
        Try
            'OPEN connection
            connection.Open()

            'CREATE SQL QUERY/COMMAND
            cmd = connection.CreateCommand()
            cmd.CommandText = "SELECT * FROM `visual_basic_tbl`"

            'CREATE READER
            reader = cmd.ExecuteReader()

            'READ ALL DATA
            While reader.Read()
                Console.WriteLine(reader.GetInt32("id").ToString())
                Console.WriteLine(reader.GetString("user").ToString())
                Console.WriteLine(reader.GetString("pass").ToString())
            End While

            'CLOSE ALL CONNECTION
            reader.Close()
            connection.Close()
        Catch ex As Exception
            Console.WriteLine("CONNECTION IS FAILED!")
        End Try

        'INSERT DATA
        Try
            'OPEN CONNECTION
            connection.Open()

            'CREATE SQL QUERY/COMMAND
            cmd = connection.CreateCommand()
            cmd.CommandText = "INSERT INTO `visual_basic_tbl` (`id`, `user`, `pass`) VALUES (NULL, 'ad', 'ad')"

            'CREATE READER
            reader = cmd.ExecuteReader()

            'CLOSE ALL CONNECTION
            reader.Close()
            connection.Close()
        Catch ex As Exception
            Console.WriteLine("CONNECTION IS FAILED!")
        End Try

        'DELETE DATA
        Try
            'OPEN CONNECTION
            connection.Open()

            'CREATE SQL QUERY/COMMAND
            'cmd = connection.CreateCommand()
            'cmd.CommandText = "DELETE FROM `visual_basic_tbl` WHERE `visual_basic_tbl`.`id` = 2"

            'CREATE READER
            'reader = cmd.ExecuteReader()

            'CLOSE ALL CONNECTION
            'reader.Close()
            connection.Close()
        Catch ex As Exception
            Console.WriteLine("CONNECTION IS FAILED!")
        End Try

        'UPDATE DATA
        Try
            'OPEN CONNECTION
            connection.Open()

            'CREATE SQL QUERY/COMMANd
            cmd = connection.CreateCommand()
            cmd.CommandText = "UPDATE `visual_basic_tbl` SET `user` = 'admin', `pass` = 'admin' WHERE `visual_basic_tbl`.`id` = 5"

            'CREATE READER
            reader = cmd.ExecuteReader()

            'CLOSE ALL CONNECTION
            reader.Close()
            connection.Close()
        Catch ex As Exception
            Console.WriteLine("CONNECTION IS FAILED!")
        End Try
    End Sub
End Module
