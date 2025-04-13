package Arrays;
import java.util.Arrays;

public class Ascending_Descending {
    public static void main(String[] args) {
        int arr[] = {8, 7, 1, 6, 5, 9};
        ascDesc(arr);
    }

    static void ascDesc(int arr[]){
//        int s = 0;
//        int e = arr.length;
//        Arrays.sort(arr);
//        int mid = (s+e)/2;
//
//        for (int i = 0;i<mid; i++){
//            System.out.print(arr[i] + " ");
//        }
//
//        for (int j = arr.length-1;j>mid-1;j--){
//            System.out.print(arr[j] + " ");
//        }



        //Second Method
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i<n/2; i++){
            System.out.print(arr[i] + " ");
        }
        for (int j = n-1; j>n/2-1; j--){
            System.out.print(arr[j]+" ");
        }

    }
}
