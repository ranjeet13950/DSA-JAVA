package Linked_List;

public class Practice {

    public static Node head;
    public static int size;
    public static Node tail;

    public void insertFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public int deletefirst(){
        if (head == null){
            return Integer.MIN_VALUE;
        }else {
            int val = head.data;
            head = head.next;
            head.prev = null;
            return val;
        }
    }

    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("Null");
    }



    public static void main(String[] args) {
        Practice dll = new Practice();
        dll.insertFirst(1);
        dll.insertFirst(2);
        dll.insertFirst(3);
        dll.print();
        dll.deletefirst();
        dll.print();
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


