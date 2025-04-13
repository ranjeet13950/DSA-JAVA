package Arrays;

public class SubArrays {
    public static void main(String[] args) {
        int arr[] ={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        sub_arr(arr);

    }
    static void sub_arr(int arr[]){
        //For print SubArray
//        for (int i = 0; i<arr.length;i++){
//            for (int j = i; j<arr.length; j++){
//                for (int k = i; k<=j;k++){
//                    System.out.print(arr[k]+" ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }


        //For print Max sumArray Sum

        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            for (int j = i; j<arr.length;j++){
                int currsum = 0;
                for (int k = i; k <=j; k++){
                    currsum+=arr[k];
                }
               // System.out.println(currsum);//Print Sum of all Subarray
                //Print Max Sub Arrays
                if (currsum>maxsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Max Sum: "+maxsum);
    }
}
