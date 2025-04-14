package Two_D_Array;

public class Searching {
    public static void main(String[] args) {
        int matrix[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(search(matrix,5));
    }

    static boolean search(int matrix[][], int target){
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix.length; j++){
                if (matrix[i][j] == target){
                    System.out.println("Fount the target at index ("+i+" "+j+")");
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }
}
