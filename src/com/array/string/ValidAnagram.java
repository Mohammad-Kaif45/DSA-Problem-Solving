package com.array.string;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {

    // Brute
    public static String sort(String str){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
    public static boolean isAnagram(String s,String t){
        if(s.length() != t.length()) return false;
        s = sort(s);
        t = sort(t);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != t.charAt(i)){
                return false;
            }
        }
        return true;
    }
    // Optimal
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public static boolean validAnagram(String str1,String str2){
        int n = str1.length();
        int m = str2.length();
        if(n != m) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(str1.charAt(i),map.getOrDefault(str1.charAt(i),0) + 1);
        }

        for(int j = 0; j < m; j++){
            if(!map.containsKey(str2.charAt(j))) return false;
            map.put(str2.charAt(j), map.getOrDefault(str2.charAt(j),0) - 1);
            if(map.get(str2.charAt(j)) < 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "cat";
        String str2 = "tat";
        System.out.println(validAnagram(str1,str2));
        System.out.println(isAnagram(str1,str2));
    }
}
