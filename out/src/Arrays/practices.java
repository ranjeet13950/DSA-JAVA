package Arrays;
import java.util.*;

public class practices {

    public static Node head;
    public static int size;
    public static Node tail;

    public void addfirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int remove(){
        int val = head.data;
        head = head.next;
        head.next.prev = null;
        return val;
    }


    public static void main(String args[]) {
        practices ll = new practices();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.print();
        ll.remove();
        ll.print();
    }
}

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

