public class LinearSearch {
    public static boolean search(int[] arr,int target){
        return helper(arr,target,0);
    }
    public static boolean helper(int[] arr,int target,int index){
        if(arr.length==index){
            return false;
        }
        return arr[index]==target || helper(arr,target,index+1);
    }
    // return index value
    public static int findindex(int[] arr,int target){
        return helperIndex(arr,target,0);
    }
    public static int helperIndex(int[] arr,int target,int index){
        if(arr.length==index){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return helperIndex(arr, target, index+1);
    }
    public static void main(String[] args) {
        int[] arr={3,2,1,8,9};
        System.out.println(search(arr, 9));
        System.out.println(findindex(arr, 9));
    }
}
