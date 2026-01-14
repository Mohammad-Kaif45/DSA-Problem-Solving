package com.array.string;

public class ContainerWithMostWater {

    public static int maxArea(int[] nums){
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int max = 0;
        while(right > left){
            int width = right - left;
            int minHeight = Math.min(nums[left],nums[right]);
            int area = width * minHeight;
            max = Math.max(area,max);
            if(nums[left] < nums[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Container with most water (max area is ) : " + maxArea(height));
    }
}
