package Two_D_Array;

import java.util.Scanner;

public class implementation {
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and cols: ");
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //print
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
