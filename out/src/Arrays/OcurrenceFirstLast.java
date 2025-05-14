package Arrays;
import java.util.Arrays;

public class OcurrenceFirstLast {
    public static void main(String[] args) {
        int arr[] = {5,7,7,8,8,10};
        System.out.println(Arrays.toString((occur(arr,8))));
    }
    public static int[] occur(int arr[], int target){
        int f = -1; int l = -1;

        for (int i = 0; i<arr.length; i++){
            if (arr[i] == target){
                if (f == -1){
                    f = i;
                }
                l = i;
            }
        }
        return new int[]{f,l};
    }
}
