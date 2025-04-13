package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Multi_DimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int [][] arr = new int [3][3];
        System.out.println(arr.length);


        for (int row = 0; row<arr.length; row++){
            for (int cols = 0; cols<arr[row].length; cols++){
                arr[row][cols] = sc.nextInt();
            }
        }

        //output
//        for (int row = 0; row<arr.length; row++){
//            for (int cols = 0; cols<arr[row].length; cols++){
//                System.out.print(arr[row][cols]+" ");
//            }
//            System.out.println();
//        }

        //another way
//        for (int row = 0; row<arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //For Each loop
        for (int [] a:arr){
            System.out.println(Arrays.toString(a));
        }



    }
}
