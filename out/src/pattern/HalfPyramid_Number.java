package pattern;

public class HalfPyramid_Number {
    public static void main(String[] args) {
        halfPyra(5);
    }
    public static void halfPyra(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
