package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        int n = fibo(50);
        System.out.println(n);

//        for (int i = 0; i< n; i++){
//            System.out.print(fibo(i ) + " ");  // 0 1 1 2 3
//        }
    }

    static int fibo(int n){
        if (n == 0 || n==1){
           return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
