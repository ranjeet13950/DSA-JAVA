package String;

public class equlalsCompare {
    public static void main(String[] args) {
        String str1 = "Apple";
        String str2 = "Apple";
        String str3 = new String("Apple");

        //This gives True
        if (str1 == str2){
            System.out.println("Both string are equal");
        }else{
            System.out.println("not equal");
        }


            //This gives false because of creating new object
        if (str2 == str3){
            System.out.println("Both string are equal");
        }else{
            System.out.println("not equal");
        }


        //Gives true
        if (str2.equals(str3)){   //Use method
            System.out.println("Both string are equal");
        }else{
            System.out.println("not equal");
        }




    }
}
