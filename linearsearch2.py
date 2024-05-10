def fun(arr,target,index,l1):
    if(len(arr)==index):
        return l1
    if(arr[index]==target):
        l1.append(index)
    
    fun(arr,target,index+1,l1)
    return l1
arr=[3,2,1,18,1,9]
l1=[]
print(fun(arr,1,0,l1))
    