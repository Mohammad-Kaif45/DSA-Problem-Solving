package com.array.string;

public class BestTimeToBuyAndSell {
    public static int maxProfit(int[] nums) {
        int profit = 0;
        int buy = nums[0];
        for (int num : nums) {
            if (buy > num) {
                buy = num;
            } else if (num - buy > profit) {
                profit = num - buy;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}
