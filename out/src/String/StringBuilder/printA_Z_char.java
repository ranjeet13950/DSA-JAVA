package String.StringBuilder;

public class printA_Z_char {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch<='z';ch++){
            sb.append(ch);                  // .append(" "); this is for spaces
        }
        System.out.print(sb);
    }
}
