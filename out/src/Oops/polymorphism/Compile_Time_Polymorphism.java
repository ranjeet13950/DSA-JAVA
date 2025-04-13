package Oops.polymorphism;

public class Compile_Time_Polymorphism {
    public static void main(String[] args) {
        calculator c1 = new calculator();
        c1.num = 5;

        c1.sum(2,5);
        c1.sum(2,3,4);
        c1.sum(2.5f,4.6f);
    }
}

class calculator{
    int num;

    //Here is same parameter but either different type or different number.
    // Method overloading because same method name that's called is compile time polymorphism and static.
    void sum(int a, int b){
        int result = a+b;
        System.out.println("sum on two number: "+result);
    }
    void sum(int a, int b, int c){
        int result = a+b+c;
        System.out.println("Sum with three number: "+result);
    }
    void sum(float a, float b){
        float result = a+b;
        System.out.println("Sum with float value: "+ result);
    }
}
