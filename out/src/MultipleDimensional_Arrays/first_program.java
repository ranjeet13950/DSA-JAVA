package MultipleDimensional_Arrays;
import java.util.Scanner;

public class first_program {
    public static void main(String[] args) {
        //Declaration
        //type[][]arrayname = new type[rows][cols]
       // int [][] twoDArray = new int [2][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rows nums: ");
        int rows = sc.nextInt();
        System.out.println("Enter your cols nums: ");
        int cols = sc.nextInt();

        int matrix[][] = new int [rows][cols];

        //Loop for taking input rows and cols
        System.out.println("Enter your rows and cols numbers: ");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }


        //for output
        System.out.println("output");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<cols; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}
