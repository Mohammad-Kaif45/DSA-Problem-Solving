package com.array;

public class Palindrom {

    // For numbers
    public static boolean isPalindrom(int n){
        int result;
        int originalNum = n;
        int reverse = 0;
        while( n != 0){
            result = n % 10;
            reverse = reverse * 10 + result;
            n = n / 10;
        }
        return originalNum == reverse;
    }

    // For Strings
    public static boolean check(String str){
        String result = "";
        for(int i = str.length() - 1; i >= 0; i--){
            result = result + str.charAt(i);
        }
        return result.equals(str);
    }

    // For paragraphs
    public static boolean para(String s){
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int left = 0;
        int right = clean.length() - 1;
        while (left < right){
            if (clean.charAt(left) != clean.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPalindrom(n));
        String str = "naman";
        System.out.println(check(str));
        String s = "A man, a plan, a canal: Panama";
        System.out.println(para(s));
    }
}
