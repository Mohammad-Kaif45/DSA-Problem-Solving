package com.array.string;

public class SearchInRotatedArray {

    // Time : O(n)
    public static int findIndex(int[] nums,int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target) return i;
        }
        return -1;
    }

    // Time : O(logn)
    public static int findPosition(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid;
            if(nums[mid] >= nums[left]){
                if(nums[left] <= target && target <= nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(findIndex(nums,target));
        System.out.println(findPosition(nums,target));
    }
}
