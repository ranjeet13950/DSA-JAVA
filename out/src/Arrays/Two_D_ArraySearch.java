package Arrays;

import java.util.Arrays;

public class Two_D_ArraySearch {
    public static void main(String[] args) {
        int arr[][] = {
                {1,5,8,9},
                {4,55,7},
                {44,77,33}
        };
        int target = 77;
        int[] ans = TwoDArray(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] TwoDArray(int arr[][],int target){

        for (int row = 0; row<arr.length;row++){
            for (int cols=0;cols<arr[row].length;cols++){
                if (arr[row][cols]==target){
                    return new int[]{row,cols};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
