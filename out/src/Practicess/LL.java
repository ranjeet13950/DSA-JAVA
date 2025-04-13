package Practicess;

public class LL {

    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    private void add(int data){

        Node newnode = new Node(data);
        if (head == null){
            head = tail = newnode;
        }
        newnode.next = head;
        head = newnode;
        size++;
    }

    private void lastnode(int data){

        Node newnode = new Node(data);
        if (tail == null){
            head = tail = newnode;
        }
        tail.next = newnode;
        tail = newnode;
        size++;
    }

    //Add value at particular index
    private void insertidx(int data, int index){

        Node temp = head;
        for (int i = 1; i<index; i++){
            temp = temp.next;
        }

        Node newnode = new Node(data, temp.next);
        temp.next = newnode;
        size++;
    }

    private void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Delete first Node
    private int deletefirst(){
        if (head == null){
            head = tail = null;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //Delete data from last Node
    private int removelast(){

        if (head == null){
            System.out.println("List is empty.");
            return -1;
        }
        else if (size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //search
    public int search(int key){
        if (head == null){
            System.out.println("list is empty.");
        }
        Node temp = head;
        int i = 0;
        while (temp != null){
            if (temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }



    public static void main(String[] args) {
        LL l1 = new LL();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(5);
        l1.add(6);
        l1.lastnode(4);
       // l1.insertidx(50,3); //Insert Index
        // l1.deletefirst();

        l1.print();
        System.out.println("Found the key index at "+l1.search(3));

        l1.removelast();

    }

}
