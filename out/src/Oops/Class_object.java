package Oops;

public class Class_object {
    public static void main(String[] args) {
//        person p1 = new person();
//        p1.name = "Ranjeet";
//        p1.age = 22;
//
//        person p2 = new person();
//        p2.name = "Ankit";
//        p2.age = 21;
//
//        System.out.println(p1.name);
//        System.out.println(p1.age);
//        System.out.println(p2.name);
//        System.out.println(p2.age);



        //USING METHOD
        person p1 = new person();
        p1.name ="Ranjeet";
        p1.age = 22;
        p1.displayname();
        p1.displayage();

        person p2 = new person();
        p2.name="Ankit";
        p2.age =21;
        p2.displayname();
        p2.displayage();
    }
}
class person{
    String name;
    int age;


    //Using Method
    public void displayname(){
        System.out.println("name = "+name);
    }
    public void displayage(){
        System.out.println("Age = "+age);
    }
}
