package Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int arr[] ={2,4,6,8,10,12,14,16};
        int target = 10;

        int result = linearsearch(arr,target);
        if (result != -1){
            System.out.println("Array index is found: "+ result);
        }else{
            System.out.println("Array index is not found");
        }
    }

    static int linearsearch(int arr[],int target){
        //try {

          //  System.out.println("successfully execute");

            for (int i = 0; i <arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
//        }catch (IndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }
        return -1;
    }
}
