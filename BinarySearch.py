# def search(arr,target):
#   l=0
#   r=len(arr)-1
  
#   while(l<=r):
#     mid=l+r//2
    
#     if(arr[mid]==target):
#       return mid
#     elif(arr[mid]<target):
#       l=mid+1 
#     else:
#       r=mid-1
#   return 0    
  
  
  
# arr=[1,2,3,4,5,8]
# target=8
# print(search(arr,target))

def search(arr,target,l,r):
  if(l<=r):
    mid=(l+r)//2
    
    if(arr[mid]==target):
      return mid
    elif(arr[mid]<target):
      return search(arr,target,mid+1,r)
    else:
      return search(arr,target,l,mid-1)
  else:
    return -1
arr=list(map(int,input().split()))
target=int(input())

print(search(arr,target,0,len(arr)-1))