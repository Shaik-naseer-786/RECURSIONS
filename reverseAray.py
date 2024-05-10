def fun(arr,l,r):
    if(l>r):
        return arr
    
    temp=arr[l]
    arr[l]=arr[r]
    arr[r]=temp 

    return fun(arr,l+1,r-1)
arr=[1,2,3,4]
l=0
r=len(arr)-1
print(fun(arr,l,r))