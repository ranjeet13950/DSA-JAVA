package Arrays;

public class palindrome {
    public static void main(String[] args) {
        int arr [] = {1,0,1};
        System.out.println(ispalindrome(arr));
    }
    public static boolean ispalindrome(int arr[]){
        int n = arr.length;
        for (int i = 0; i<n/2; i++){
            if (arr[i] != arr[n - i - 1]){
                return false;
            }
        }
        return true;
    }
}
