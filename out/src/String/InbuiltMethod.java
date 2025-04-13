package String;

public class InbuiltMethod {
    public static void main(String[] args) {
        String str = "I love You";


        //Change to capital letter
        System.out.println(str.toUpperCase());   //I LOVE YOU

        //To lower length
        System.out.println(str.toLowerCase());   // i love you

        //Find length
        System.out.println(str.length());  // 10

        //for retrieve value through index
        System.out.println(str.charAt(2)); // l

        //Find Index
        System.out.println(str.indexOf("l")); //2

        //Sub string
        System.out.println(str.substring(2,6)); //love


    }
}
