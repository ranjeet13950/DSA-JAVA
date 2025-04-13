package stack;

import java.util.ArrayList;


public class practice {

    static class stack{
        static ArrayList <Integer> list = new ArrayList<>();

        // isempty
        static boolean isempty(){
            return list.size() == 0;
        }

        //push
        static void push(int data){
            list.add(data);
        }

        //pop
        static int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        static int peek(){
            return list.get(list.size()-1);
        }

    }
    public static void main(String[] args) {
        stack s1 = new stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        while (!s1.isempty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
