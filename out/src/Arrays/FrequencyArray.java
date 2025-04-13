package Arrays;

public class FrequencyArray {
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        frequency(arr);
    }
    static void frequency(int arr[]){            //Time complexity: O(N*N)
        int n = arr.length;
        boolean visited[] = new boolean[n];

        for (int i = 0; i<n; i++){
            if (visited[i] == true){
                continue;
            }
            int count = 1;
            for (int j = i+1; j<n; j++){
                if (arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("Number "+arr[i] + " " +"Frequency "+ count);
        }
    }
}
