import java.util.ArrayList;

public class UniquePathWithRestrictions {
    public static void main(String[] args) {
        int[][] arr={{0,0,0},{0,1,0},{0,0,0}};
        ArrayList<String> res=new ArrayList<>();
        // count1("",arr, 0, 0, res);
        System.out.println(count2(arr, 0, 0));
    }

    // private static void count1(String p,int[][] arr, int r, int c,ArrayList<String> res) {
    //     if(r==arr.length-1 && c==arr[0].length-1){
    //         System.out.println(p);
    //         return;
    //     }
    //     if(arr[r][c]==1){
    //         return;
    //     }
    //     if(r<arr.length-1){
    //         count1(p+"D", arr, r+1, c, res);
    //     }
    //     if(c<arr[0].length-1){
    //         count1(p+"R", arr, r, c+1, res);
    //     }
    // }
    public static int count2(int[][] arr,int r,int c){
        if(r>=arr.length-1 || c>=arr[0].length-1){
            return 0;
        }
        if(arr[r][c]==1){
            return 0;

        }
        if(r==arr.length-1 && c==arr[0].length-1){
            return 1;
        }
        int down=count2(arr, r+1, c);
        int right=count2(arr, r, c+1);
        return down+right;

    }

}
