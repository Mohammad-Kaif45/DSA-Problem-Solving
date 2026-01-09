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

    // Optimal

    public static String lcp(String[] strs){
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0,prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strs = {"alower","aow","aosk"};
        System.out.println(longestCommonPrefix(strs));
        System.out.println(lcp(strs));
    }
}
