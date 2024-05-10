def search(arr,target):
    if(len(arr)==1):
        if(arr[0]==target):
            return True 
        else:
            return False
    if(arr[0]==target):
        return True
    arr=arr[1:]
    
    return search(arr,target)
arr=[3,2,1,8,9]
target=0
res=search(arr,target)
if res:
    print("Yes")
else:
    print("No")