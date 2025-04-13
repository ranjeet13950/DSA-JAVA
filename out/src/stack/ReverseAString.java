package stack;

import java.util.Stack;

public class ReverseAString {

    public static String reverse(String str){
       Stack<Character> s1 = new Stack<>();
       int idx = 0;
       while (idx < str.length()){
           s1.push(str.charAt(idx));
           idx++;
       }

       StringBuilder result = new StringBuilder("");
       while (!s1.isEmpty()){
           char curr = s1.pop();
           result.append(curr);
       }
       return result.toString();
    }

    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(reverse(str));
    }
}
