import java.util.ArrayList;

public class LinearSearch2{
    public static ArrayList<Integer> search(int[] arr,int target,int index,ArrayList<Integer> ans){
        
        if(arr.length==index){
            return ans;

        }
        if(arr[index]==target){
            ans.add(index);
        }
        
            search(arr, target, index+1, ans);
        
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={3,2,1,4,1,8,9};
        ArrayList<Integer> list=new ArrayList<>();
        search(arr, 1, 0, list);
        System.out.println(list.toString());
    }
}