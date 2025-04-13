package Arrays;
import java.util.*;

public class Remove_Duplicates_Array {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,4,5,6,5};
        int dup = duplicate(arr);
        for (int i = 0; i<dup; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static int duplicate(int arr[]){
        Arrays.sort(arr);
       int i = 0;
       for (int j = 0; j<arr.length; j++){
           if (arr[i] != arr[j]){
               i++;
               arr[i] = arr[j];
           }
       }
       return i+1;
    }
}
