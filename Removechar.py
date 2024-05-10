def fun(s,ans,index):
    if(len(s)==index):
        return ans 
    if(s[index]!='apple'):
        
        ans+=s[index]
    return fun(s,ans,index+1)

s="naseeapplersalma"
ans=""
print(fun(s,ans,0))
    