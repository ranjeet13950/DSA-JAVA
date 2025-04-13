package Arrays;
import java.util.Arrays;

public class SecondLargest_Small {
    public static void main(String[] args) {
        int arr[] ={1,8,5,3,4,2};
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {

    // Time complexity O(n)
        //Space complexity O(1)



        int n = arr.length;
        int largest = -1;
        int second_largest = -1;

        //find largest
        for(int i = 0; i<n; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        //find second largest
        for(int i = 0; i<n; i++){
            if(arr[i]>second_largest && arr[i] != largest){
                second_largest = arr[i];
            }
        }
        return second_largest;
    }












    public static void largeSmall(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);

        //BRUTE FORCE APPROACH
        if (n == 0 || n == 1){
            System.out.print("-1");
            return;
        }

        int small = arr[1];
        System.out.println("Second smallest: "+small);

        int large = arr[n-2];
        System.out.println("Second largest: "+large);


        //BETTER APPROACH

//        int small = Integer.MAX_VALUE;
//        int second_small = Integer.MAX_VALUE;
//
//        int large = Integer.MIN_VALUE;
//        int second_large = Integer.MIN_VALUE;
//
//        for (int i = 0; i < n; i++){
//            small = Math.min(small, arr[i]);
//            large = Math.max(large, arr[i]);
//        }
//
//        for (int i = 0; i<n; i++){
//            if (arr[i]<second_small && arr[i] != small){
//                second_small =  arr[i];
//            }
//            if (arr[i]>second_large && arr[i] != large){
//                second_large = arr[i];
//            }
//        }
//        System.out.println("Second Largest: "+second_large);
//        System.out.println("Second Smallest: "+second_small);

    }
}
