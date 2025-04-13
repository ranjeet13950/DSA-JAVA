package String;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        String name = "Ranjeet";
        System.out.println(name);
        String name1 = new String("Kumar");
        System.out.println(name1);

        char str[] = {'a','b','c'};
        System.out.println(str);

        //Find length
        String fullname = "Ranjeet";
        System.out.println(fullname.length());

        //Concatenation
        String firstname = "Ankit";
        String lastname = "Raj";
        System.out.println(firstname + " "+lastname);

        //Get character at a specific index
        String str2 = "hello";
        System.out.println(str2.charAt(1)); //Output: e


        //User Input
//        Scanner sc = new Scanner(System.in);
//        String name3 = sc.nextLine();
//        System.out.println(name3);

        //call charidx method
        String str3 = "Ranjeet";
        charidx(str3); //output: R a n j e e t
    }

    static void charidx(String str){
        for (int i = 0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
}
