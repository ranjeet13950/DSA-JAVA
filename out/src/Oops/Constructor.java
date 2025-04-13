package Oops;

public class Constructor {
    public static void main(String[] args) {


        //Call parametrized Constructor
        Student s1 = new Student("Ranjeet",10);
        s1.displayname();

        //Call Default Constructor
//        Student s1 = new Student();
//        s1.displayname();


        //Empty argument
//        Student s2 = new Student();
//        s2.displayname();


        System.out.println();

        Student kunal = new Student();
        //Copy constructor
        Student random = new Student(kunal);
        System.out.println(random.name);
        System.out.println(random.rollno);
        System.out.println(random.marks);

    }
}
class Student{
    String name;
    int rollno;
    float marks;

    //Using Method
    public void displayname(){
        System.out.println("name: "+name);
        System.out.println("RollNO: "+rollno);
    }





    //Empty arguments
//    Student(){
//        this.name = "chutiya";
//        this.rollno = 121;
//    }

    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }


    //Default Constructor
    Student(){
        name = "sonu";
        rollno = 90;
        marks = 456;
    }
    //Copy Constructor
    Student(Student other){
        this.name = other.name;
        this.rollno = other.rollno;
        this.marks = other.marks;
    }
}
