package Recursion;


public class printnums {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){
        //Base Condition
        if (n == 5){
            System.out.println(5);
            return;
        }

        System.out.println(n);
        //recursive call
        print(n +1);
    }
}
