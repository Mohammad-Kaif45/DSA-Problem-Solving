package com.array.string;

import java.util.Arrays;

public class ProductOfArrayExceptItself {
    public static int[] productOfArray(int[] nums){
        int product = 1;
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for(int i = 1; i < nums.length; i++){
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            ans[i] = ans[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }
        return ans;
    }
    // Brute Force approach which is not acceptable on leetcode
    public static int[] product(int[] nums){
        int product = 1;
        for (int j : nums) {
            product = product * j;
        }
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = product / nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,3,5};
        System.out.println(Arrays.toString(productOfArray(nums)));
    }
}
