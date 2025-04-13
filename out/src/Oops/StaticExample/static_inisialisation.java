package Oops.StaticExample;

public class static_inisialisation {
    public static void main(String[] args) {
        //Without create object
        // System.out.println(b);


        //with create object
        static_inisialisation obj1 = new static_inisialisation();
        System.out.println(static_inisialisation.a +" "+ static_inisialisation.b);
        static_inisialisation.b +=3;
    }

    static int a = 5;
    static int b;

    static{
        System.out.println("I am static block");
        b = a*5;
    }

}


