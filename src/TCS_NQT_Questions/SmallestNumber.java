package TCS_NQT_Questions;
public class SmallestNumber {
    public static int find(int[] nums){
        int n = nums.length;
        int min = nums[0];
        for(int i = 1; i < n; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,4,5,0,-1};
        int result = find(nums);
        System.out.println("Minimum element is : " + result);
    }

}
