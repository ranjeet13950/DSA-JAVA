package Linked_List;

public class Doubly_Linked_list {
    public static void main(String[] args) {
        Doubly_Linked_list dll = new Doubly_Linked_list();
        dll.firstnode(3);
        dll.firstnode(2);
        dll.firstnode(1);
        dll.removeFirst();       //Remove the First Node
        dll.print();
    }



    public class Node{
        int data;
        Node next;
        Node prev;


        public Node (int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void firstnode(int data){
        Node newnode = new Node(data);
        size++;
        if(head == null){
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public int removeFirst(){

        if (head == null){
            return Integer.MIN_VALUE;
        }
        if (size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size --;
        return  val;

    }

    //print
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }


}
