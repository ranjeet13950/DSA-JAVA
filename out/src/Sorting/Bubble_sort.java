package Sorting;
import java.util.*;

public class Bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter numbers for sorting: ");
        for (int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        bubblesort(arr);
        printarr(arr);

    }
    static void bubblesort(int arr[]){
        for (int i = 0; i<arr.length-1; i++){
            for (int j = 0; j<arr.length-1-i; j++){
                if (arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void printarr(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
