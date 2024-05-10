import java.util.ArrayList;
import java.util.List;

public class combinationsum {
    public static void main(String[] args) {
       int[] candidates={2,3,5,7};
       List<List<Integer>> ans=combinationSum(candidates, 7);
       for(List<Integer> i:ans){
        System.out.println(i.toString());
       } 
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        helper(candidates, target, 0, new ArrayList<>(),result);
        return result;
    }
    public static void helper(int[] candidates,int target,int start,List<Integer> temp,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(target-candidates[i]>=0){
                temp.add(candidates[i]);
                helper(candidates, target-candidates[i], i, temp, result);
                temp.remove(temp.size()-1);
            }
        }
    }
}
