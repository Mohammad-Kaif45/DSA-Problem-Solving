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
        List<List<Integer>> result = new ArrayList<>(set);
        return result;
    }

    // Optimal Approach

    public static List<List<Integer>> triplet(int[] arr) {
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i < n; i++) {
            if(i != 0 && arr[i] == arr[i - 1]) continue;
            int j = i + 1;
            int k = n - 1;
            while(j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if(sum < 0) {
                    j++;
                }else if(sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }
        return ans;
    } // Time complexity :  O(NlogN)+O(N2)
    public static void main(String[] args) {
        int[] nums = {-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};
        //List<List<Integer>> ans = threeSum(nums);
        List<List<Integer>> ans = triplet(nums);
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
