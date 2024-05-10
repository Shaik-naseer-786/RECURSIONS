def fun(nums):
    res=[0]*len(nums)
    left=1
    for i in range(0,len(nums)):
        res[i]=left 
        left*=nums[i]
    right=1
    for i in range(len(nums)-1,-1,-1):
        res[i]*=right 
        right*=nums[i]
        
    return res
nums=[1,2,3,4]
print(fun(nums))