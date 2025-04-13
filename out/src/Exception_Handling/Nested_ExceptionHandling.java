package Exception_Handling;

public class Nested_ExceptionHandling {
    public static void main(String[] args) {
        nestedExc();
    }

    static void nestedExc(){
        try {
            int result = 10 / 0;

            try {
                String str = null;
                str.length();
            } catch (NullPointerException e) {
                System.err.println("Out of index" + e.getMessage());
            }
        } catch (ArithmeticException e) {
                System.err.println("Not divisible by zero" + e.getMessage());
        }
        finally {
            System.out.println("code are successfully executed");
        }

    }
}
