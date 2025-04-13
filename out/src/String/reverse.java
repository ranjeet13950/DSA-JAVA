package String;

public class reverse {
    public static void main(String[] args) {
        String str = "ranjeet";
        System.out.println(rev(str));
        reversed(str);
    }
    public static String rev(String str){
       String reversed = "";
       for (int i = str.length()-1;i>=0;i--){
           reversed += str.charAt(i);
       }
       return reversed;
    }

    //Second Method

    public static void reversed(String str){
        for (int i = str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
