package pattern;

public class ButterFly {
    public static void main(String[] args) {
        butterfly(4);
    }

    public static void butterfly(int n){
        //First Half
        for (int i = 1; i<=n; i++){
            //Print Star
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //Print Space
            for (int sp = 1; sp<=2*(n-i); sp++){
                System.out.print(" ");
            }
            //Print *
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = n; i>=1; i--){
            //print *
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //print Space
            for (int sp = 1; sp<=2*(n-i); sp++){
                System.out.print(" ");
            }
            //Print *
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
