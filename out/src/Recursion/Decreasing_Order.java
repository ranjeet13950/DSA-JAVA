package Recursion;

public class Decreasing_Order {
    public static void main(String[] args) {
        dec(10);  // 10 9 8 7 6 5 4 3 2 1
    }

    static void dec(int n ){
        if (n == 1){  //Base Case
            System.out.println(n);  //print 1
            return;
        }
        System.out.print(n+" ");  // 10
        dec(n-1);   // 9 8 7 6 5 4 3 2
    }
}
