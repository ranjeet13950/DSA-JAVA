package String;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println(str);

//        String str1 = "moom";
//        System.out.println(pal(str1));

//        String path = "WNEENESENNN";
//        System.out.println(pal(path));

//        String str = "Hello world";
//        System.out.println(substr(str,0,5));

        String fruits[] ={"banana","mango","chiku"};
        System.out.println(pal(fruits));

    }

    public static String  pal(String veges[]){
        String largest = veges[0];
        for (int i = 1; i<veges.length; i++){
            if (largest.compareTo(veges[i])<0){
                largest = veges[i];
            }
        }
        return largest;

    }


    public static String substr(String str,int si,int ei){
        String substr = "";
        for (int i = si; i<ei; i++){
            substr +=str.charAt(i);
        }
        return substr;
    }
}
