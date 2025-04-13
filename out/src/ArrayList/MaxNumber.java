package ArrayList;

import java.util.ArrayList;

public class MaxNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(8);
        list.add(5);

        Al(list);
    }

    static void Al(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<list.size();i++){
            if (max<list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("Max number is: "+ max);
    }
}
