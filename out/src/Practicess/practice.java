package Practicess;
import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int arr[] = {1,2, 0, 3};
        System.out.println(prac(arr));

    }

    public static int prac(int arr[]){
        int total_sum = 0;
        int left_sum = 0;
       for (int i = 0; i<arr.length; i++){
           total_sum = total_sum+arr[i];
       }

       for (int i = 0; i<arr.length; i++){
           total_sum -= arr[i];

           if (total_sum == left_sum){
               return i;
           }

           left_sum += arr[i];
       }
       return -1;
    }
}
