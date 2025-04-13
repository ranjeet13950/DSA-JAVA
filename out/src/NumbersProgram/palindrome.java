package NumbersProgram;

public class palindrome {
    public static void main(String[] args) {
       int n = 121 ;
        System.out.println(pal(n));
    }
    static boolean pal(int number){
        int original_n = number;
        int reverse_n = 0;

        while (number != 0){
            int digit = number % 10;
            reverse_n = reverse_n * 10 + digit;
            number /= 10;
        }
        if (original_n == reverse_n){
            return true;
        }
        else {
            return false;
        }
    }
}
