package Arrays;

public class string_Search {
    public static void main(String[] args) {
        String str = "Ranjeet";
        char target = 'n';
        boolean ans = search(str,target);
        System.out.println(ans);
    }

    static boolean search(String str, char target){
        if (str.length()==0){
            return false;
        }

        for (int i = 0; i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    // For return Index
    static int prac(String str, char target){
        if (str.length() == 0){
            return -1;
        }
        for (int i = 0; i<str.length(); i++){
            if (target == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
