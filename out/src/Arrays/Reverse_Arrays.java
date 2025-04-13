package Arrays;

public class Reverse_Arrays {
    public static void main(String[] args) {
        int arr[]={50,2,3,4,5,6,8};
        reverse(arr);
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void reverse(int[] arr){
       int first = 0;
       int last = arr.length-1;

       while(first<last){
           int temp = arr[first];
           arr[first] = arr[last];
           arr[last] = temp;

           first++;
           last--;
       }
    }
}
