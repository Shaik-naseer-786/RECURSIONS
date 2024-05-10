import java.util.ArrayList;
import java.util.List;

public class ContinuousArray {
    public static void main(String[] args) {
       int[] arr={0,1,1,0,1,1,1,0};
       List<List<Integer>> res=sub(arr);
       System.out.println(res.toString()); 
       int maxLength = findMaxLength(res);
       System.out.println(maxLength);
    }
    public static List<List<Integer>> sub(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++){
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
    public static int findMaxLength(List<List<Integer>> lists) {
        int maxLength = 0;
        for (List<Integer> list : lists) {
            int count0 = 0;
            int count1 = 0;
            for (int num : list) {
                if (num == 0) {
                    count0++;
                } else {
                    count1++;
                }
            }
            if (count0 == count1) {
                maxLength = Math.max(maxLength, list.size());
            }
        }
        return maxLength;
    }
}
