package Recursion;

public class Binary_Search {
    public static void main(String[] args) {
        int arr[]={1,55,77,88,99,101,105,200};
        int target = 88;
        System.out.println(BS(arr,target,0,arr.length-1));
    }

    static int BS(int arr[], int target, int s, int e){
        if (s>e){
            return -1;
        }

        int mid = s + (e - s)/2;

        if (arr[mid] == target){
            return mid;
        }

        if (arr[mid] > target){
            return BS(arr, target,s, mid-1);
        }
        else{
            return BS(arr, target, mid+1,e);
        }
    }
}
