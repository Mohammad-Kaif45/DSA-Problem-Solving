package com.array.string;

public class LongestCommonPrefix {

    // Brute force Approach
    public static String longestCommonPrefix(String[] strs){
        int n = strs.length;
        if(strs.length == 0) return "";
        String first = strs[0];
        int len = first.length();
        for(int i = 0; i < len; i++){
            char ch = first.charAt(i);
            for(int j = 1; j < n; j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != ch){
                    return first.substring(0,i);
                }
            }
        }
        return first;
    }
    public static void main(String[] args) {
        String[] strs = {"alower","aow","aosk"};
        System.out.println(longestCommonPrefix(strs));
    }
}
