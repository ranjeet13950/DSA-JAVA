package stack;

import java.util.Stack;

public class Next_Greater {
    public static void main(String[] args) {
        int arr[] = {5,6,3,8,9,1};


        Stack<Integer>s = new Stack<>();
        int nxtgr[] = new int [arr.length];

        for (int i = arr.length-1; i>=0; i--){
            while (!s.isEmpty() && arr[s.peek()]<= arr[i]){
                s.pop();
            }
            if (s.isEmpty()){
                nxtgr[i] = -1;
            }else{
                nxtgr[i] = arr[s.peek()];
            }
            s.push(i);
        }


        //print
        for (int i = 0; i< nxtgr.length; i++){
            System.out.print(nxtgr[i]+" ");
        }
        System.out.println();
    }
}
