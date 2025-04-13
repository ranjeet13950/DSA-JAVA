//package NumbersProgram;
//import java.util.*;
//
//public class fibonnaci_series {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter first number: ");
//        int start = sc.nextInt();
//        System.out.println("Enter Second number: ");
//        int n = sc.nextInt();
//
//        if(n<2){
//            System.out.println("lesser 2: ");
//            return;
//        }
//        System.out.println("You fibonacci series is: "+start +" "+ n);
//        printFibonacciSeries(start,n);
//        sc.close();
//    }
//
//    // Method to print the Fibonacci series
//    public static void printFibonacciSeries(int start, int n) {
//        int first_num = start;
//        int second_num = start+1;
//        for (int i = 3; i<=n; i++){
//            int next = first_num + second_num;
//            first_num = second_num;
//            second_num = next;
//        }
//        System.out.println();
//
//    }
//}


package NumbersProgram;
import java.util.Scanner;

public class fibonnaci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int start = sc.nextInt();
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Number of terms should be at least 2.");
            return;
        }

        System.out.println("Your Fibonacci series is: ");
        printFibonacciSeries(start, n);
        sc.close();
    }

    // Method to print the Fibonacci series
    public static void printFibonacciSeries(int start, int n) {
        int first_num = start;
        int second_num = start + 1;
        System.out.print(first_num + ", " + second_num);

        for (int i = 3; i <= n; i++) {
            int next = first_num + second_num;
            System.out.print(", " + next);
            first_num = second_num;
            second_num = next;
        }
        System.out.println(); // Move to the next line after printing the series
    }
}

