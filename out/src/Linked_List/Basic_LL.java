package Linked_List;

public class Basic_LL {
   private Node head;
   private Node tail;
   private int size;
   public Basic_LL() {
       this.size = 0;
   }
    private class Node{

        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
   public void insertfirst(int val){
       Node node = new Node(val);
       node.next = head;
       head = node;

       if(tail == null){
           tail = head;
       }
       size++;
   }

   public void lastinsert(int val){
       if (tail == null){
           insertfirst(val);
           return;
       }
       Node node = new Node(val);
           tail.next = node;
           tail = node;
           size++;
   }

   public void display(){
       Node temp = head;
       while (temp != null){
           System.out.print(temp.value+"->");
           temp = temp.next;
       }
       System.out.println("null");
   }

   public int findmiddle(){
       Node slow = head;
       Node fast = head;

       while (fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }
       return slow.value;

   }


    public static void main(String[] args) {

       Basic_LL ll = new Basic_LL();
       ll.insertfirst(3);
       ll.insertfirst(2);
        ll.insertfirst(4);
        ll.insertfirst(8);
        ll.lastinsert(99);//Last insert
        System.out.println("middle Node     "+ll.findmiddle());
        ll.display();
    }
}

