package Oops.StaticExample;

public class Human {
    String name;
    int age;
    double salary;
    boolean married;
    static long population;

    public Human(String name, int age,double salary,boolean married){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;

        Human.population += 1;
    }


}
