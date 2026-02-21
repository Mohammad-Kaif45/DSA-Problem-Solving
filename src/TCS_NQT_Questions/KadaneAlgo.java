package TCS_NQT_Questions;

public class KadaneAlgo {
    public static long maxSum(int[] arr){
        int n = arr.length;
        long max = Long.MIN_VALUE;
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSum(arr));
    }
}
