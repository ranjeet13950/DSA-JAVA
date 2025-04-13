package LOOPS;

import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        //FACTOR PRINT
        int sum=0;
        for (int i=1;i<=n;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);


    }
}
