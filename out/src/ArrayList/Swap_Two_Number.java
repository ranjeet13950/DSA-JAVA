package ArrayList;

import java.util.ArrayList;

public class Swap_Two_Number {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(10);

        int idx1 = 1, idx2 = 3;
        System.out.println("Before Swapping: "+list);
        swap(list,idx1,idx2);
        System.out.println("After Swapping: "+list);

    }

    static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1 , list.get(idx2));
        list.set(idx2 , temp);
    }
}


//          Method
//        Collections.swap(list, 0,1);
//        System.out.println(list);
