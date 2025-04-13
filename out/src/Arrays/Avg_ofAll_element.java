package Arrays;

public class Avg_ofAll_element {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        System.out.println(average(arr));
    }

    static double average(int arr[]){

        int sum = 0;

        for (int i = 0; i<arr.length; i++){
            sum +=arr[i];
        }
        return (double) sum/arr.length;
    }
}
