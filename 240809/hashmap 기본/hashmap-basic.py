def add(k, v, hashmap):
    hashmap[k] = v
    return hashmap

def remove(k, hashmap):
    hashmap.pop(k)
    return hashmap

def find(k, hashmap):
    return hashmap.get(k)
    


n = int(input())
dct = dict()
k = 0
v = 0

for _ in range(n):
    ipt = list(map(str, input().split()))
    if len(ipt) == 2:
        cmd, k = ipt
        k = int(k)
    else:
        cmd, k, v = ipt
        k = int(k)
        v = int(v)

    if cmd == "add":
        dct = add(k, v, dct)
    elif cmd == "find":
        print(find(k, dct))
    elif cmd == "remove":
        dct = remove(k, dct)