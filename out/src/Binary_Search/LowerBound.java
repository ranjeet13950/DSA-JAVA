package Binary_Search;

public class LowerBound {
    public static void main(String[] args) {
        int arr[] = {3, 6,9, 12,15,18};
        System.out.println(lowerBound(arr,5));
    }

    public static int lowerBound(int[] nums, int x) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        int ans = nums.length;

        while (s <= e ) {
            int mid = s + (e - s) / 2;
            if (nums[mid] >= x) {
                e = mid-1;
                ans = mid;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }
}