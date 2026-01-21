package com.array.string;

import java.util.Arrays;
import java.util.Stack;

public class Daily_Temperatures {
    public static int[] dailyTemperatures(int[] temp){
        int n = temp.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]){
                int previoudDay = stack.pop();
                ans[previoudDay] = i - previoudDay;
            }
            stack.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] temp = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temp)));
    }
}
