package Recursion;

public class first_occurence {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int ans = occur(arr,3,0);
        System.out.println(ans);
    }
    static int occur(int arr[],int key, int i){
        if (i == arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return occur(arr, key, i+1);
    }
}
