package Arrays;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3,3,3,4,4,4};
       int newlen = removeDuplicates(arr);
        for (int i = 0; i<newlen;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int removedup(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        int j = 0;
        for (int i = 0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];
        return j;
    }



    public static int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int j =1;
        for(int i =1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }



}




