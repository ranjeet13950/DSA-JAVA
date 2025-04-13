package Backtracking;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        perm(str,"");

    }

    public static void perm(String str, String ans){
        //Base Case
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }

        //Recursion
        for (int i = 0; i<str.length(); i++){
            char curr = str.charAt(i);
            //"abcde" = ab + de = abde (c is deleted)
            String newStr = str.substring(0,i) + str.substring(i+1);
            perm(newStr,ans+curr);
        }
    }
}
