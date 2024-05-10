import java.util.ArrayList;

public class LinearSearch3 {
    public static ArrayList<Integer> search(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(arr.length==index){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> l2=search(arr, target, index+1);
        list.addAll(l2);
        return list;
    }
    public static void main(String[] args) {
        int[] arr={3,2,1,18,1,9};
        ArrayList<Integer> ans=search(arr, 1, 0);
        System.out.println(ans.toString());
    }
}
