package Oops.Inheritance;

public class inheritance {
   double l;
   double h;
   double w;

     inheritance (){
       this.l = 1;
       this.h = 2;
       this.w = 3;
   }

     inheritance(double side){
       this.l = side;
       this.h = side;
       this.w = side;
   }

   inheritance(double l, double h, double w){
       this.h = h;
       this.l = l;
       this.w = w;
   }


   //copy constructor
   inheritance(inheritance old){
         this.l = old.l;
         this.h = old.h;
         this.w = old.w;
   }
}


//Inherit data from parent class
class inheritbox extends inheritance{

    double wieght;

    public inheritbox(){
        this.wieght = -1;
    }
    public inheritbox(double l, double h, double w){
        super(l, h, w);
    }

}
