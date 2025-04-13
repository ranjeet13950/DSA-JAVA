package Arrays;

import java.util.Scanner;

public class pushzeroesinlast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();
        System.out.println("Enter no. of arrays: ");
        int arr[] = new int[n];
        for (int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        pushlast(arr);
        System.out.println("pushing zeroes at last.");
        for (int j = 0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }

    }
    static void pushlast(int arr[]){
        int left = 0;
        for (int right = 0; right<arr.length; right++){
            if (arr[right] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
    }
}
