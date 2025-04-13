package Linked_List;

public class cycle_linked_list {
   public static class Node{
       int data;
       Node next;

       public Node(int data){
           this.data = data;
           this.next = null;
       }
   }
   public static Node head;
   public static Node tail;

   public static boolean iscycle(){
       Node slow = head;
       Node fast = head;

       while (fast != null && fast.next != null) {
           slow = slow.next; // +1
           fast = fast.next.next;  // +2

           if (slow == fast) {
               return true;
           }

       }
       return false;
   }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head; // true



        System.out.println(iscycle());
    }
}
