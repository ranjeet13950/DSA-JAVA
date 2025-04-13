package Binary_Search;

public class AgnosticBS {
    public static void main(String[] args) {
        int arr[] = {1,2,8,4,5,3,6};
        int ans = agnostic(arr,3);
        System.out.println(ans);
    }

    static int agnostic(int arr[], int target){
        int start = arr[0];
        int end = arr.length-1;

        boolean isAsc = arr[start] > arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                }else{
                    end = mid-1;
                }
            }
            else{
                if (arr[mid] > target) {
                    start = mid + 1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
