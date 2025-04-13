package Exception_Handling;

import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter your number2: ");
        int n2 = sc.nextInt();
        try{
            int result =  n1/n2;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("Not divided ZERO");
        }
    }
}
