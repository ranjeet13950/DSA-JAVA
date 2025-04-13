package Linked_List;

public class firstLinkedList {
//    public static class Node{
//        int data;
//        Node next;
//
//        //Constructor
//        public Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//    }
//    public static Node head;
//    public static Node tail;
//
//    //For find list size
//    public static int size;
//
//    public void addFirst(int data){
//        //step1. create new node
//        Node newNode = new Node(data);
//
//        size++;   //list increasing count the size
//        if (head == null){
//            head = tail = newNode;
//            return;
//        }
//        //step2. newNode = head
//        newNode.next = head;
//
//        //step3. head = newNode
//        head = newNode;
//    }
//
//    public void lastNode(int data){
//        Node newNode = new Node(data);
//
//        size++; //list increasing in last node for count the size
//        if (tail == null){
//            head = tail = newNode;
//            return;
//        }
//        tail.next = newNode;
//        tail = newNode;
//    }
//
//    public void print(){
//        Node temp = head;
//        while (temp != null){
//            System.out.print(temp.data + "->");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//
//    //INSERT DATA AT PARTICULAR INDEX
//    public void add(int data, int idx){
//        if (idx == 0){
//            addFirst(data);
//            return;
//        }
//        Node newNode = new Node(data);
//
//        size++; //List count the size
//        Node temp = head;
//        int i = 0;
//
//        while(i < idx-1){
//            temp = temp.next;
//            i++;
//        }
//
//        newNode.next = temp.next;
//        temp.next = newNode;
//    }
//
//    //Remove data from head
//    public int removeFirst(){
//        if(size == 0){
//            System.out.println("Linked list is null.");
//            return Integer.MAX_VALUE;
//        }
//        else if(size == 1){
//            int val = head.data;
//            head = tail = null;
//            size = 0;
//            return val;
//        }
//
//        int val = head.data;
//        head = head.next;
//        size--;
//        return val;
//    }
//
//    //Remove data from tail
//    public int removetail(){
//        if (size == 0){
//            System.out.println("list is empty.");
//            return Integer.MIN_VALUE;
//        }
//        else if(size == 1){
//            int val = head.data;
//            head = tail = null;
//            size = 0;
//            return val;
//        }
//        Node prev = head;
//        for (int i = 0; i<size-2;i++){
//            prev = prev.next;
//        }
//        int val = prev.next.data;
//        prev.next = null;
//        tail = prev;
//        size--;
//        return val;
//    }
//
//    //Delete node
//    public void deletenode(Node node){
//        if (node == null ||  node.next == null){
//            return;
//        }
//        node.data = node.next;
//        node.next = node.next.next;
//    }
//    //search
//    public int itrsearch(int key){
//        Node temp = head;
//        int i = 0;
//        while(temp != null){
//            if (temp.data == key){    //Find key
//                return i;
//            }
//            temp = temp.next;
//            i++;
//        }
//        return -1;            //Not found key
//
//    }
//
//
//    //Recursive Search
//    public int helper(Node head, int key){
//        if (head == null){
//            return -1;
//        }
//        if (head.data == key){
//            return 0;
//        }
//        int idx = helper(head.next,key);
//        if (idx == -1){
//            return -1;
//        }
//        return idx+1;
//    }
//    public int recsearch(int key){
//        return helper(head,key);
//    }



    //Reverse
//    public void reverse(){
//        Node prev = null;
//        Node curr = tail = head;
//        Node Next;
//
//        while(curr != null){
//            Next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = Next;
//        }
//        head = prev;
//    }




    public static void main(String[] args) {
        firstLinkedList l1 = new firstLinkedList();

//        l1.addFirst(2);
//        l1.addFirst(1);
//        l1.lastNode(3);
//        l1.lastNode(4);
//
//        //Insert value at index
//        l1.add(9,2);
//        l1.print();
//
//        System.out.println(l1.size);  //print the size of list
//
//       // For remove data from head
//        l1.removeFirst();
//        l1.print();
//
//       // for remove data from tail
//        l1.removetail();
//        l1.print();
//
//        System.out.println(l1.size);  //print the size of list
//
//
//        //Find key
//        System.out.println("found key");
//        System.out.println(l1.itrsearch(3));
//
//         //Recursion search
//        System.out.println(l1.recsearch(3));


        //Reverse the linked list
//        l1.reverse();
//
//        //Print
//        l1.print();
//
//        //l1.deletenode(1);
//        l1.print();
    }
}
