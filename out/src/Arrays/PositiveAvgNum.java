package Arrays;

public class PositiveAvgNum {
    public static void main(String[] args) {
        int arr[] = {1,2,-3,3,-5};
        posAvgNum(arr);
    }

    static void posAvgNum(int arr[]){
        int sum = 0;
        int count = 0;

        for (int i = 0; i<arr.length; i++){
            if(arr[i]>0){
                sum = sum+arr[i];
                count++;
            }

        }
        int avg = sum/count;
        System.out.println(avg);
    }
}
