package stack;

import java.util.Stack;

public class reveerseAStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Original Stack: "+s);
        reverse(s);
        System.out.println("Reversed Stack: "+s);
    }
    static void PushAtBottom(Stack<Integer>s, int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(s,data);
        s.push(top);
    }
    static void reverse(Stack<Integer>s){
        if (s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        PushAtBottom(s,top);
    }
}
