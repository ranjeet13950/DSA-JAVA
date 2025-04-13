package LOOPS;

public class Patterns {
    public static void main(String[] args) {
        pattern(4);
    }


//          PATTERN 1
//            *
//            * *
//            * * *
//            * * * *
//    static void pattern(int n){
//        for (int i = 1; i<=n;i++){
//            for (int j=1;j<=i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }


    //PATTERN 2
//            * * * *
//            * * * *
//            * * * *
//            * * * *
//    static void pattern (int n){
//        for (int i = 1; i<=n; i++){
//            for (int j = 1; j<=n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }


//    PATTERN 3
//            * * * *
//            * * *
//            * *
//            *
//    static void pattern(int n){
//        for (int i=1; i<=n; i++){
//            for (int j=0;j<= n-i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

//        1
//        1 2
//        1 2 3
//        1 2 3 4
    static void pattern(int n){
        for (int i=1; i<=n; i++){
            for (int j = 1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

}
