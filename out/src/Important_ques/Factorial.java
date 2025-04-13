package Important_ques;

import java.util.Scanner;

public class Factorial {

    public static void fact(int num){
        int fact = 1;
        for (int i =1; i<=num; i++){
            fact= fact*i;
        }
        System.out.println(fact);
        System.out.println("Factor of "+num+" is: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        fact(n);


    }
}
