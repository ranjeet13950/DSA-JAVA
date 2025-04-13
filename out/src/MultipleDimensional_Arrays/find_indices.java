package MultipleDimensional_Arrays;

import java.util.Scanner;

public class find_indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter cols: ");
        int cols = sc.nextInt();

        int matrix [][] = new int [rows][cols];

        System.out.println("Enter rows and cols nummbers: ");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number to find indices: ");
        int target = sc.nextInt();

       int [] indices = findindices(matrix,rows,cols,target);

       if (indices[0] != -1){
           System.out.println("Found the indices rows "+indices[0] +" cols "+indices[1]);
       }else{
           System.out.println("Not Found ");
       }


    }

    static int[] findindices(int matrix[][],int rows, int cols, int target){
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
                if (matrix[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int []{-1,-1};
    }
}
