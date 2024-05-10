public class DiceCombinationSum{
    public static void main(String[] args) {
        sum("", 4);
    }
    public static void sum(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            sum(p+i,target-i);
        }
    }
}