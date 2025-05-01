package pattern;

public class Alphabet {
    public static void main(String[] args) {
        alpha(5);
    }

    public static void alpha(int n){
        char ch = 'A';
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(ch +" ");
                ch++;
            }
            System.out.println();
        }
    }
}
