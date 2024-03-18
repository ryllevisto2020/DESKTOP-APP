#array 
a : int = []
a.append(1) # adding element
#a.remove(1) # remove element
print(a)

#object
b : int = {}
b['a']= 1
print(b)

#array object method 1
c : int = [{}]
c[0]['a'] = 1
print(c)

#array object method 2
d : int = []
d.append({'a': 1, 'b': 2})
print(d)

#List() Class
p1 = list()
p1.append({'a': 1, 'b': 2})
print(p1[0]['a'])

#Tuple() Class
p2 = tuple(p1)
print(p2)

#Dict() Class
p3 = dict()
p3["a"] = 1
p3["b"] = 2
print(p3)