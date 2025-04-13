package String;

public class LastStringLength {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(len(str));
    }

    public static int len(String str){
        int count = 0;
        for (int i = str.length()-1; i>0; i--){
            char ch = str.charAt(i);
           if (ch != ' '){
               count++;
           }else{
               break;
           }

        }
        return count;
    }
}
