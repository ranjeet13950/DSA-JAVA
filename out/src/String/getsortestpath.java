package String;

public class getsortestpath {
    public static void main(String[] args) {
        String path = "wneenesennn"; //W = west, N = North, S = South, E = East
        System.out.println(sortPath(path));
    }

    static float sortPath(String path){
        int x = 0;
        int y = 0;

        for (int i = 0; i<path.length(); i++){
            char dir = path.charAt(i);

            if (dir == 'n'){
                y++;
            }
            else if (dir == 's'){
                y--;
            }
            else if(dir == 'w'){
                x--;
            }
            else{
                x++;
            }
        }
        int x2 = x*x;
        int y2 = y*y;

        return (float)(Math.sqrt(x2 + y2));  //Formula: sqrt((x2-x1)square + (y2-y1)square)
    }
}
