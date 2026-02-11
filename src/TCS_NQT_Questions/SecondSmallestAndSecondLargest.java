package TCS_NQT_Questions;

import java.util.Arrays;

// Time Complexity = nlogn because we are sorting the array to find the elements
// Brute Force Approach
public class SecondSmallestAndSecondLargest {
//    public static void getElements(int[] nums){
//        int n = nums.length;
//        if(n == 0 || n == 1){
//            System.out.println(-1 + " " + -1);
//            return;
//        }
//        Arrays.sort(nums);
//        int s_smallest = nums[1];
//        int s_largest = nums[n - 2];
//        System.out.println("Second Smallest is : " + s_smallest);
//        System.out.println("Second Largest is : " + s_largest);
//    }

    // Time complexity = O(n)
    public static void getElements(int[] nums){
        int n = nums.length;
        int small = Integer.MAX_VALUE,s_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE,s_large = Integer.MIN_VALUE;

        for (int num : nums) {
            small = Math.min(small, num);
            large = Math.max(large, num);
        }

        for (int num : nums) {
            if (num < s_small && num != small) {
                s_small = num;
            }
            if (num > s_large && num != large) {
                s_large = num;
            }
        }

        System.out.println("Second Smallest is : " + s_small);
        System.out.println("Second Largest is : " + s_large);

    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7, 7, 5}; // second smallest is : 2 and second largest is 5;
        getElements(nums);
    }
}
