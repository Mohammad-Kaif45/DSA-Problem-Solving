package com.array.string;

public class MinimumInRotatedSortedArray {
    public static int findMin(int[] nums){
        int min = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }

    public static int findMinimum(int[] nums){
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
        System.out.println(findMinimum(nums));
    }
}
