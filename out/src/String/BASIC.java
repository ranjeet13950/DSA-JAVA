package String;

import org.w3c.dom.ls.LSOutput;

public class BASIC {
    public static void main(String[] args) {

//        String str = "Ranjeet";
//        String str2 = "Ranjeet";
//        System.out.println(str == str2); // true
//
//
//        String str3 = new String ("kumar");
//        String str4 = new String ("kumar");
//        System.out.println(str3 == str4); //false
//
//
//        //Ways os comparison
//        String str5 = "Ankit";
//        String str6 = new String("Ankit");
//        System.out.println(str5==str6); //Return 'FALSE' , Compares the references of the object.
//        System.out.println(str5.equals(str6)); //Return 'TRUE' , Compares the contents(Values) of the object.
//


        //IMMUTABLE AND MUTABLE
        StringBuffer sb = new StringBuffer("Raneet");
        sb.append("kumar");
        System.out.println(sb);


        //String
        String sb1 = new String("Ranjeet");
        sb1 = sb1.concat("kumar");
        System.out.println(sb1);

    }



}
