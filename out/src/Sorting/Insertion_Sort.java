package Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
        int arr[] = {4,5,1,3,2};
        insertion(arr);
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void insertion(int arr[]){
        for (int i = 1; i< arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev]>curr){
                arr[prev +1] = arr[prev];
                prev--;
            }
            arr[prev +1] = curr;
        }
    }
}
