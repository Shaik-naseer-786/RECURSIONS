import java.util.HashMap;

public class CountinuosArray2 {
    public static int findMaxLength(int[] nums) {
        int maxLength=0;
        int count=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0, -1);
        for(int i=0;i<nums.length;i++){
            count+=nums[i]==0?-1:1;
            if(mp.containsKey(count)){
                maxLength=Math.max(maxLength,i-mp.get(count));
            }
            else{
                mp.put(count, i);
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] nums={0,1,0,1};
        System.out.println(findMaxLength(nums));
    }
}
