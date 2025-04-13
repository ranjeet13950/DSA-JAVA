package NumbersProgram;

public class reverse_number {
    public static void main(String[] args) {
        int n = 45612;
        System.out.println(rev(n));
    }
    static int rev(int n){
        int reverse = 0;

        while (n != 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return reverse;
    }
}
