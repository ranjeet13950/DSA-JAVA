package Recursion;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        int sum = nat(5);
        System.out.println(sum);
    }

    static int nat(int n){
        if (n == 0){
            return n;
        }

        return n + nat(n-1);
    }
}
