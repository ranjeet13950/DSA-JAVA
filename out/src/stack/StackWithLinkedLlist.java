package stack;

public class StackWithLinkedLlist {

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }


    }
    static class Stack{
        static Node head = null;

        //Empty
       public static boolean isempty(){
            return head == null;
       }

       //push
        public static void push(int data){
           Node newnode = new Node(data);
           if (isempty()){
               head = newnode;
               return;
           }
           newnode.next = head;
           head = newnode;
        }

        //pop
        public static int pop(){

           if (isempty()){
               return -1;
           }
           int top = head.data;
           head = head.next;
           return top;
        }

        //peek
        public static int peek(){
           if (isempty()){
               return -1;
           }
           return head.data;
        }

    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        while (!s1.isempty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }

}
