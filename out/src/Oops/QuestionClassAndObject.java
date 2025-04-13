package Oops;

import java.util.Scanner;

public class QuestionClassAndObject {
    public static void main(String[] args) {
        float area;
        Area ar = new Area();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of Height: ");
         ar.height = sc.nextFloat();

        System.out.println("Enter the value of Width: ");
        ar.width = sc.nextFloat();

        area = ar.calarea(); //initialize the area
        System.out.println("Area = "+area);

    }
}

class Area{
    float height;
    float width;

//    public void calarea(){
//        System.out.println("Area = "+height*width);
//    }

    //WITH RETURN VALUE
    public float calarea(){
        return height*width;
    }
}
