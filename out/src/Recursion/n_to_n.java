package Recursion;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class n_to_n {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);
//        System.out.println("Enter num: ");
//        int n = sc.nextInt();
        printnums(5);
    }

    static void printnums(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printnums(n-1);

    }

    static void printnumsrev(int n){
        if (n==0){
            return;
        }
        printnumsrev(n-1);
        System.out.println(n);
    }
}
