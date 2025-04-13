package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class PracticeQuestion {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(8);
//        list.add(3);
//        list.add(9);


        //User input
        Scanner sc = new Scanner(System.in);

        System.out.println(maxnum(list));

    }
    static int  maxnum(ArrayList<Integer>list){
      int max = Integer.MIN_VALUE;
      for (int i = 0; i<list.size(); i++){
          if (list.get(i)>max){
              max= list.get(i);
          }
      }
      return max;
    }
}

