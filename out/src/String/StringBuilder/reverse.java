package String.StringBuilder;

public class reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ranjeet");
        System.out.println(rev(sb));
    }
    static StringBuilder rev(StringBuilder sb){
        StringBuilder reversed = new StringBuilder();
        for (int i = sb.length()-1; i>=0; i--){
            reversed.append(sb.charAt(i));
        }
        return reversed;
    }
}
