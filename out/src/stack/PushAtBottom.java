package stack;
import java.util.Stack;

public class PushAtBottom {
    public static void pushonBottom(Stack<Integer>s,int data){

        if (s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushonBottom(s, data);
        s.push(top);
    }


    public static void main(String[] args) {
        Stack <Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        pushonBottom(s1,4);
        while (!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
}
