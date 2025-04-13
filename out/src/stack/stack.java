package stack;
import java.util.ArrayList;

public class stack {
    static class stackB{
        static ArrayList<Integer> list = new ArrayList<>();

        // For Empty
        public static boolean isempty(){
           return list.size() == 0;
        }

        //Push
        static void push(int data){
            list.add(data);
        }

        //pop
        static int pop(){

            if (isempty()){ //Check stack is empty
                return -1;
            }

            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        static int peek(){
            if (isempty()){    //check stack is empty
                return -1;
            }
            return list.get(list.size()-1);
        }

    }



    public static void main(String[] args) {
        stackB s1 = new stackB();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        while(!s1.isempty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }


}
