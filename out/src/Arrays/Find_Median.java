package Arrays;

public class Find_Median {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(prac(arr));
    }
    static int prac(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while (start<end) {
            int mid = start + (end - start) / 2;
            return arr[mid];
        }
        return -1;
    }
}
