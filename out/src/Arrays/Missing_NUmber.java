package Arrays;

public class Missing_NUmber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,9};
        int missnum = missingnum(arr);
        System.out.println(missnum);
    }

    static int missingnum(int arr[]){
        int n = arr.length + 1;
        int actual_len = 0;
        int expected_length = n * (n+1)/2;

        for (int num : arr){
            actual_len += num;
        }
        return expected_length - actual_len;
    }
}
