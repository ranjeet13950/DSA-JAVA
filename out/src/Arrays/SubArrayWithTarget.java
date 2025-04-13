package Arrays;

public class SubArrayWithTarget {
    public static void main(String[] args) {
        int arr[] = {2,5,2,7,10};
        int target = 14;
        System.out.println(subarr(arr,target));
    }
    public static int subArray(int arr[],int target){
        for (int i = 0; i<arr.length; i++){
            for (int j = i; j<arr.length; j++){
                if (arr[i] + arr[j] == target){
                    return i;
                }
            }
        }
        return -1;
    }

    //Return the Length
    public static int subArrayLength(int arr[],int target){
        for (int i = 0; i<arr.length; i++){
            int sum = 0;
            for (int j = i; j<arr.length; j++){
                sum = sum+arr[j];
                if (sum == target){
                    return j - i+1;
                }
            }
        }
        return -1;
    }


    public static int subarr(int arr[], int target){
        int l = 0, r= 0, sum = 0, max = 0;
        int n = arr.length;

        while (r < n){
            sum = sum+ arr[r];

            while (sum > target){
                sum = sum- arr[l];
                l = l+1;
            }
            if (sum <= target){
                max = Math.max(max, r-l+1);
            }
            r = r+1;
        }
        return max;

    }
}
