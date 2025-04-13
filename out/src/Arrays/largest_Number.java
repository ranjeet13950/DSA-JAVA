package Arrays;

import java.util.Scanner;

public class largest_Number {
    public static void main(String[] args) {

//        int num [] = {1,5,7,2,3,9,4};
//        System.out.println("Largest values is: "+largestnum(num));



        //USER INPUT
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int num=sc.nextInt();

        int arr[] = new int[num];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i<num;i++) {
            arr[i] =sc.nextInt();
        }

        int result = largestnum(arr);
        System.out.println("Largest number is: "+result);

    }
    static int largestnum(int num[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i<num.length; i++){
           if (num[i]>largest){
               largest=num[i];
           }
        }
        return largest;
    }
}
