package Arrays;

public class SmallestNumber {
    public static void main(String[] args) {
        int arr[] = {-1,2,0,4};
        int sml = smallest(arr);
        System.out.println(sml);
    }
    static int smallest(int arr[]){
        int min = arr[0];
        int n = arr.length;
        for (int i = 0; i<n;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
