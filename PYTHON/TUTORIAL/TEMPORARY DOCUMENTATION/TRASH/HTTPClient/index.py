import http.client
import json
host = "jsonplaceholder.typicode.com"
conn = http.client.HTTPSConnection(host)
conn.request("GET", "/posts", headers={"Host": host,"Content-Type": "application/json"})
res = conn.getresponse()
print(res)