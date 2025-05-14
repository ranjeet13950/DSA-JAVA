package Queue;

public class Implementation_Linked_list {
    public static void main(String[] args) {
        Queue1 q1 = new Queue1();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        while (!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
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

class Queue1{
    public static Node head = null;
    public static Node tail = null;

    public boolean isEmpty(){
        return head == null && tail == null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!");
            return -1;
        }
        //single Element
        int front = head.data;
        if (head == tail){
            tail = head = null;
        }else{
            head = head.next;
        }
        return front;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!");
            return -1;
        }
        return head.data;
    }

}
