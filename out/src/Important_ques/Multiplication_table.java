package Important_ques;

import java.util.Scanner;

public class Multiplication_table {
    public static void table(int num){
        for (int i=1; i<=10; i++){
            int mul = num*i;
            System.out.println(num +"*"+ i + " = " + mul );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        table(n);

    }
}
