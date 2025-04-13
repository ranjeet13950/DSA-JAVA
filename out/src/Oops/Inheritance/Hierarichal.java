package Oops.Inheritance;

public class Hierarichal {
    public static void main(String[] args) {
        humans human = new humans();
        birds bird = new birds();

        human.breadth();
        human.walk();

        bird.breadth();
        bird.fly();

    }
}

class Animals{
    void breadth(){
        System.out.println("breadth");
    }
}
class humans extends Animals{
    void walk(){
        System.out.println("walk");
    }
}
class birds extends Animals{
    void fly(){
        System.out.println("fly");
    }
}