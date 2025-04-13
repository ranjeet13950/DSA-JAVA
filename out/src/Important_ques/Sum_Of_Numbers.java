package Important_ques;

import java.util.Scanner;

public class Sum_Of_Numbers {

    public static void SumNum(int num){
        int sum = 0;
        for (int i = 0; i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Sum of "+n+" number is: ");
        SumNum(n);
    }
}
