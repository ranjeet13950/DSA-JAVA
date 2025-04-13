package String;

public class subString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(substr(str,0,5)) ;


        //Method for print substring
        System.out.println(str.substring(0,5));

    }

    static String substr(String str, int si, int ei){
        String substring="";
        for (int i = si; i < ei; i++){
            substring += str.charAt(i);
        }
        return substring;
    }
}
