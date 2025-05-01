package BitManipulation;

public class AddTwoNumber {
    public static void main(String[] args) {
        System.out.println(add(3,5));
    }
    static int add(int a, int b){
        while ( b!= 0){
           int carry = a & b;
           a = a^b;
           b = carry << 1;
        }
        return a;
    }
}
