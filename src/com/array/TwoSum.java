package com.array;

import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {

    // Time Complexity -> O(n^2)
    // Space Complexity -> O(2)
    public static int[] twoSum(int[] nums,int target){
        int[] ans = {-1,-1};
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    // Better approach
    public static boolean Twosum(int[] nums, int target) {
        Arrays.sort(nums);   // required
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) return true;
            else if (sum < target) left++;
            else right--;
        }
        return false;
    }

    // Optimal Approach
    public static int[] twosum(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {3,8,6,9,4};

        System.out.println(Arrays.toString(twoSum(nums,15)));
        System.out.println(Arrays.toString(twosum(nums,10)));
    }
}
