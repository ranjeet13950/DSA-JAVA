package Arrays;

public class Binary_search {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,3,3,3,3,3,4,4,4,5,5,5};

        int result = binarysearch(arr,3);
        System.out.println(result);
    }
    static int binarysearch(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        int result = -1;

        while (start<=end){
            int mid = start + (end-start)/2;

            if (arr[mid]==key){
                result = mid;
                end = mid-1;
            }
            if (arr[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return result;

    }
}
