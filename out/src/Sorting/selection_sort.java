package Sorting;

public class selection_sort {
    public static void main(String[] args) {
        int arr[] = {1,5,4,8,6,9};
        secondMethod(arr);
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

    //Second approach//
    static void secondMethod(int arr[]){
        for (int i = 0; i<arr.length-1; i++){
            for (int j = i+1; j>0; j--){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }
}
