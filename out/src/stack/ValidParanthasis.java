package stack;

import java.util.Stack;

public class ValidParanthasis {
    public static void main(String[] args) {
        String str = ")))";
        System.out.println(validpara(str));
    }
    public static boolean valid(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if ((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if (s.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public static boolean validpara(String str){
        int round = 0, curly = 0, square = 0;

        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if (ch == '('){
                round++;
            } else if (ch == ')') {
                round--;
            } else if (ch == '{') {
                curly++;
            } else if (ch == '}') {
                curly--;
            } else if (ch == '[') {
                square++;
            } else if (ch == ']') {
                square--;
            }

            if (round < 0 || curly < 0 || square < 0){
                return false;
            }
        }
        return round == 0 && curly == 0 && square == 0;
    }
}
