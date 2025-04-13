package BasicQuestion;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //To check Prime or Not
//        System.out.println("Enter number to check number is prime or not: ");
//        int num = sc.nextInt();
//
//        if (prime(num)){
//            System.out.println(i + " is prime number");
//        }else{
//            System.out.println(num + " is not prime number");
//        }

        //To find All Prime number take input from user...
        System.out.println("Enter stating point: ");
        int start = sc.nextInt();

        System.out.println("Enter ending point: ");
        int end = sc.nextInt();

        System.out.println("Your all prime numbers between "+ start +" to "+end+" is: ");
        for (int i = start; i<=end; i++){
            if (prime(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean prime(int num){
        if (num<=1){
            return false;
        }
        for (int i = 2; i<=Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
