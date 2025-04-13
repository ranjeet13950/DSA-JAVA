package Arrays;
import java.util.*;
public class RotateArray {
    public static void reverse(int[] nums,int start,int end)
    {

        while(start<=end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            end--;
            start++;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-k-1);
        reverse(nums,0,n-1);

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 3;

    }
}
