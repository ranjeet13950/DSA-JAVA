package Arrays;

public class stock_sell_buy {
    public static void main(String[] args) {
        int arr[] = {5,2,6,1,4,5};
       int stk = stock(arr);
        System.out.println(stk);

    }

    public static int stock(int arr[]){
        int maxprofit = 0;
        int min = arr[0];

        for (int i = 0; i<arr.length; i++){
            min = Math.min(arr[i],min);
            int profit = arr[i] - min;
            maxprofit = Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}
