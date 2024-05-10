def fun(arr,target,index):
    l1=[]
    if(len(arr)==index):
        return l1
    if(arr[index]==target):
        l1.append(index)
        
    l2=fun(arr,target,index+1)
    
    return l1
arr=[3,2,1,18,1,9]
print(fun(arr,1,0))