package Arrays;

public class pairsum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 5;

        pairsum1(arr,target);

    }

    static void pairsum1(int arr[],int target){

        for (int i = 0; i<arr.length;i++){
            for (int j = i+1; j<arr.length;j++){
                if (arr[i]+arr[j]==target){
                    System.out.println("Found Pair: "+arr[i]+" "+arr[j]);
                    return;
                }
            }
        }
        System.out.println("No Pair Found");
    }
}
