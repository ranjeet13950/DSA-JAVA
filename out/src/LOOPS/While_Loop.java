package LOOPS;

import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        //PRINT EVEN NUMBER
//        int i =1;
//        while(i<=n){
//            if(i%2==0)
//                System.out.println(i);
//            i++;
//        }


        //PRINT FACTOR NUMBER
        int i =1;
        while(i<=n){
            if (n%i==0){
                System.out.print(i+",");
            }
            i++;
        }
    }
}
