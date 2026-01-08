package com.array.string;

public class ReverseString {
    public static void reverse(String str){
        StringBuilder result = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str = "kaif";
        reverse(str);
    }
}
