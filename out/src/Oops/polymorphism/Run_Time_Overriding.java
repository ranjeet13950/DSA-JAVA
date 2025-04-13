package Oops.polymorphism;

public class Run_Time_Overriding {
    public static void main(String[] args) {
        cat c1 = new cat();
        c1.eat();

        tiger t1 = new tiger();
        t1.eat();
    }
}

class tiger{
    void eat(){
        System.out.println("Eat chicken.");
    }
}
class cat extends tiger{
    void eat(){
        System.out.println("Drinking milk.");
    }
}
