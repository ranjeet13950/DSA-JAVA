package Arrays;

public class minimum_number {
    public static void main(String[] args) {
        int arr[]={1,8,7,2,9,3,0};
        System.out.println(minsearch(arr));
    }
    static int minsearch(int arr[]){
       int min = arr[0];
       for (int i = 0; i<arr.length; i++){
           if (arr[i]<min){
               min = arr[i];
           }
       }
       return min;
    }
}
