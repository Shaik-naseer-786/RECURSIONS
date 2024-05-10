# def fun(arr):
#     if(len(arr)==1):
#         return arr[0]
#     else:

#         min_num=fun(arr[1:])

#         if(arr[0]<min_num):
#             return arr[0]
#         else:
#             return min_num

# arr=[2,3,1,4,5]
# print(fun(arr))    

def maxArr(arr):
  if(len(arr)==1):
    return arr[0]
    
  else:
    max_num=maxArr(arr[1:])
    
    if(arr[0] > max_num):
      return arr[0]
    else:
      max_num
      

arr=[1,2,3,4]
print(maxArr(arr))
          