package com.array.string;


import java.util.Arrays;
import java.util.HashMap;

public class ContainDuplicate {

    // Time Complexity -> O(logn) + O(n)
    // Space Complexity -> O(1)
    public static boolean contains(int[] nums){
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]) return true;
        }
        return false;
    }

    // using hashmap
    // Time Complexity -< O(n)
    public static boolean contain(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
            if(map.get(num) > 1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1};
        System.out.println(contains(nums));
        System.out.println(contain(nums));
    }
}
