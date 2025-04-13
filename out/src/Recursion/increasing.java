package Recursion;

public class increasing {
    public static void main(String[] args) {
        inc(10);
    }
    static void inc(int n){
        if(n ==1){
            System.out.print(n +" ");
            return;
        }
        inc(n-1);
        System.out.print(n + " ");
    }
}
