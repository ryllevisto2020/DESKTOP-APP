#class and objects
class name:
    def set_name(self, _fname:str):
        self.fname = _fname
    def get_name(self):
        return self.fname
    
p1 = name()
p1.set_name("visto")
#print(p1.get_name())

#inheritance
class section(name):
    def set_name(self, _fname: str):
        #return super().set_name(_fname)
        self.fname = _fname
    
    def get_name(self):
        return self.fname
    
    def set_section(self,_section : str):
        self.section = _section
    
    def get_section(self):
        return self.section
    
p2 = section()
p2.set_name("visto")
p2.set_section("BSIT-3104")
#print(p2.get_name()+":"+p2.get_section())
        
#construct
class name_construct():
    def __init__(self,_name,_section):
        self.name = _name 
        self.section = _section
    def get_all(self):
        p3 = list()
        p3.append({"name":self.name,"section":self.section})
        return p3

def main():
    p4 = name_construct("visto","BSIT-3104")
    list : list = p4.get_all()[0]['name']
    print(list)
    ans = input("Please enter: ")
    if ans == "yes":
        print("yes")
if __name__=="__main__":
        main()
    # end main