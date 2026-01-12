package com.array.string;
import java.util.*;

public class ThreeSum {
    // Brute Force
    public static List<List<Integer>> threeSum(int[] nums){
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j + 1;k < n; k++){
                    if (nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                        temp.sort(null);
                        set.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> rersult = new ArrayList<>(set);
        return rersult;
    }
    public static void main(String[] args) {
        int[] nums = {-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};
        List<List<Integer>> ans = threeSum(nums);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
