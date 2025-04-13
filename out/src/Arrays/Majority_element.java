package Arrays;

public class Majority_element {
    public static void main(String[] args) {
        int arr[] = {8,8,7,7,7};
        System.out.println(majo(arr));

    }
    static int majo(int arr[]){

        for (int i = 0; i<arr.length; i++){
            int count = 0;
            for (int j = i; j<arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count > arr.length/2){
                return arr[i];
            }
        }
        return -1;
    }
}
