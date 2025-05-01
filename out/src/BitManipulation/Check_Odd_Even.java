package BitManipulation;

public class Check_Odd_Even {
    public static void main(String[] args) {
      oddEven(12);
    }

    static boolean oddEven(int n){
        //int bitmask = 1;
        if((n & 1) == 1){
            System.out.println("This is odd number.");
            return true;
        }else{
            System.out.println("This is even number.");
            return false;
        }
    }
}
