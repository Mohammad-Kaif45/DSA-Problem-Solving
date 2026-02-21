package TCS_NQT_Questions;

import java.util.Arrays;

public class LeftRotatae {
    public static void rotate(int[] nums){
        int n = nums.length;
        int temp = nums[0];
        for(int i = 1; i < n; i++){
            nums[i - 1] = nums[i];
        }
        nums[n - 1] = temp;
        System.out.print("[ ");
        for(int i = 0; i < n; i++){

            System.out.print(nums[i] + ",");

        }
        System.out.print("]");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        rotate(nums);

    }
}
