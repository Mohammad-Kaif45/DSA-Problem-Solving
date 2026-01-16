package com.array.string;

import java.util.Arrays;

public class MaxAreaOfSquareHole {
    public static int maxArea(int n,int m,int[] hBars,int[] vBars){
        int height = getMaxGap(hBars);
        int width = getMaxGap(vBars);
        int side = Math.min(height,width);
        return side * side;
    }

    public static int getMaxGap(int[] bars){
        Arrays.sort(bars);
        int maxCount = 1;
        int currentCount = 1;
        for(int i = 1;i < bars.length; i++){
            if(bars[i] == bars[i - 1] + 1){
                currentCount++;
            } else {
                currentCount = 1;
            }
            maxCount = Math.max(maxCount,currentCount);
        }
        return maxCount + 1;
    }
    public static void main(String[] args) {
        int n = 6, m = 7;
        int[] hBars = {2};
        int[] vBars = {4};
        System.out.println(maxArea(n,m,hBars,vBars));
    }
}
