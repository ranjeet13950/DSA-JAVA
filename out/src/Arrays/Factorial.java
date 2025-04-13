package Arrays;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static int fact(int n){
        int f = 1;
        for (int i = 1; i<=n; i++){
            f*=i;
        }
        return f;
    }
}
