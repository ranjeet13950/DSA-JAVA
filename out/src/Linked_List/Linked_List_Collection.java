package Linked_List;
import java.util.LinkedList;

public class Linked_List_Collection {
    public static void main(String[] args) {
        //CREATE
        LinkedList<Integer> ll = new LinkedList<>();

        //ADD
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);


        //REMOVE
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
