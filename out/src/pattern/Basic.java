package pattern;

public class Basic {
    public static void main(String[] args) {
        pattern3(4);
    }

    static void pattern(int n){
        for (int i = 0; i<=n; i++){
            for (int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
          for (int i = 0; i<=n; i++){
              for (int j =n; j>=i;j--){   //Second Approach -> for(int j = 0; j<n-i+1; j++);
                  System.out.print("* ");
              }
              System.out.println();
          }
    }

    static void pattern2(int n){
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        char ch = 'A';
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(ch + " e");
                ch++;
            }
            System.out.println();
        }
    }
}
