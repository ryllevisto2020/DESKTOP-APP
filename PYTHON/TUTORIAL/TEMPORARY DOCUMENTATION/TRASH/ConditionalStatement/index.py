#if else 
status : bool = True
if status:
    print("Status is True")
else:
    print("Status is False")

print("================================================")

#match switch
choice : int =3
match (choice):
    case (1):
        print("Choice is 1")
    case(2):
        print("Choice is 2")
    case(_): #default case
        print("Choice is None")