public class ArraySorted{
    public static boolean sorted(int[] arr){
        return helper(arr,0);
    }
    public static boolean helper(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && helper(arr,index+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(sorted(arr));
    }
}