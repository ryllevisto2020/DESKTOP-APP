class error:
    def test(self,_err_code,_err_msg):
        b : str = {}
        b["err_code"] = _err_code
        b["err_msg"] = _err_msg
        return b

def main():
    err = error()
    li = list()
    li.append(err.test(1,"awd"))
    li.append(err.test(2,"awd"))
    print(li[0]['err_code'])
if __name__ == "__main__":
    main()