package Sorting;

public class selection_sort {
    public static void main(String[] args) {
        int arr[] = {1,5,4,8,6,9};
        selection(arr);
       for (int i = 0; i<arr.length; i++){
           System.out.print(arr[i]+ " ");
       }
    }

    static void selection(int arr[]){
        for (int i = 0; i<arr.length-1; i++){
            int minpos = i;
            for (int j= i+1; j<arr.length; j++){
                if (arr[minpos] > arr[j]){
                    minpos = j;
                }
            }

            //swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
}
