package Arrays;

public class LongestSubarrayWithkey {
    public static void main(String[] args) {
        int arr [] = {10, 5, 2, 7, 1, -10};
        System.out.println(subarr(arr,15));
    }
    static int subarr(int arr[], int k){
        int maxlen = 0;
        for (int i = 0; i<arr.length; i++){
            int sum = 0;
            for (int j = i; j<arr.length; j++){
                sum+=arr[j];
                if (sum == k){
                    maxlen = Math.max(maxlen,j-i+1);
                }
            }
        }
        return maxlen;
    }
}
