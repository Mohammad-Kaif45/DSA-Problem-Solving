package com.array.string;

import java.util.HashSet;

// Given a string s, find the length of the longest substring without duplicate characters.
public class LongestSubstring {
    public static int longestSubstring(String str){
        int n = str.length();
        int left = 0;
        int maxLen = 0;

        HashSet<Character> set = new HashSet<>();
        for(int right = 0; right < str.length(); right++){
            char ch = str.charAt(right);

            while (set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("Longest Substring without repeating characters : " + longestSubstring(str));
    }
}
