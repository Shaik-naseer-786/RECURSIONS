import java.util.ArrayList;
import java.util.List;

public class SubSeqArray {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> res=sub(arr);
        for(List<Integer> i:res){
            System.out.println(i.toString());
        }
        
    }
    public static List<List<Integer>> sub(int[] arr){
        List<List<Integer>> outer =new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal =new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}
