package String;

public class Palindrome {
    public static void main(String[] args) {
        String str = "pop";
        boolean n = palindrome(str);
        System.out.println(n);

    }
    static boolean palindrome(String str){
         int n = str.length();
         for (int i = 0; i<n/2;i++){   //Divide into two part of string
             if (str.charAt(i) != str.charAt(n-i-1)){  //Compare the indexex first part to Second part
                 return false;
             }
         }
         return true;
    }
}
