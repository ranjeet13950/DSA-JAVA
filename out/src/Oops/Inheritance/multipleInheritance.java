package Oops.Inheritance;

public class multipleInheritance {
    public static void main(String[] args) {
        Animal sp = new Animal();
        sp.leg = 2;
        sp.hand = 2;
        sp.eye = 2;

        System.out.println(sp.leg);

    }
}

class species{
    int leg;
}
class human extends species{
    int eye;
}
class Animal extends human{
    int hand;
}
