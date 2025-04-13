package Arrays;

public class between_indexes {
    public static void main(String[] args) {
        int arr[] ={4,2,1,8,1,9};
        int target = 1;
        int ans = search(arr,target,1,4);
        System.out.println(ans);
    }
    static int search(int arr[],int target,int start,int end){
        for (int i = start; i<end; i++){
            if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
