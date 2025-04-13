package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {

        int arr[] = {1,2,3,1,2,3,4};
        List<Integer> duplicates = finddup(arr);
        System.out.println(duplicates);

    }

    public static List<Integer> finddup(int arr[]){
        Arrays.sort(arr);

        ArrayList<Integer> duplicate = new ArrayList<>();

        for (int i = 0; i<arr.length-1; i++){
            if (arr[i] == arr[i+1]){
                duplicate.add(arr[i]);
            }
        }
        return duplicate;
    }
}
