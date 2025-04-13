package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(10);
        sort(list);
    }

    static void sort(ArrayList<Integer>list){
        System.out.println("Before Sorting "+list);

        //This is a functions to sorting any list in Ascending order
        Collections.sort(list);
        System.out.println("After Sorting: "+list);

        //Descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order: "+list);
    }
}
