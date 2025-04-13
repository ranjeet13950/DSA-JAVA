package stack;

import java.util.Stack;

public class practices {
    public static void main(String[] args) {
//        Stack1 s1 = new Stack1();
//        s1.push(1);
//        s1.push(2);
//        s1.push(3);
//        while(!s1.isEmpty()){
//            System.out.println(s1.peek());
//            s1.pop();
//        }

        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        pushAttheBottom(s1,4);
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
    public static void pushAttheBottom(Stack<Integer>s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAttheBottom(s,data);
        s.push(top);
    }
}
class Stack1{
    static Node head;
    static int size;

    public static boolean isEmpty(){
        return head == null;
    }

    public static void push(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public static int pop(){
        if (isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek(){
        return head.data;
    }


    public static void pushAttheBottom(Stack<Integer>s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAttheBottom(s,data);
        s.push(top);
    }
}


class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
