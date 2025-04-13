package Oops.StaticExample;

public class main {
    public static void main(String[] args) {
        Human ranjeet = new Human("Ranjeet",21,80000,false);
        Human ankit = new Human("Ankit",20,90000,false);

        System.out.println(ranjeet.name);
        System.out.println(ranjeet.population);
        System.out.println(ankit.population);

        greeting();


    }
    static void greeting(){
        System.out.println("rk");
    }

}
