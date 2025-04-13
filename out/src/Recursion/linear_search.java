package Recursion;

public class linear_search {
    public static void main(String[] args) {
        int arr[] = {5,7,4,8,96,4,4,5};
        int target = 4;
        System.out.println(ls(arr,target,0));
        System.out.println(findindex(arr,target,0));
        System.out.println(findlastindex(arr,target,0));
    }

    static boolean ls(int arr[], int target,int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || ls(arr,target,index+1);
    }


    //Return Index
    public static int findindex(int arr[], int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else {
            return findindex(arr,target,index+1);
        }
    }

//from last
    public static int findlastindex(int arr[], int target, int index){
        if (index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else {
            return findindex(arr,target,index-1);
        }
    }
}
