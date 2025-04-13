package Backtracking;

public class findSubsets {
    public static void main(String[] args) {
        String str = "abc";
        findsub(str,0,"");
    }

    static void findsub(String str, int i, String ans){
        if (i == str.length()){
            if (str.length() == 0){
                System.out.println("null");
            }else {
                System.out.println(ans);
            }
            return;
        }
        findsub(str,i+1, ans+str.charAt(i));
        findsub(str,i+1,ans);
    }
}
