package com.array.string;

public class StringToInteger {

    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public static int myAtoi(String s) {
        int i = 0, n = s.length();
        int sign = 1;
        int num = 0;
        // 1. Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        // 2. Check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        // 3. Convert digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            // 4. Handle overflow
            if (num > Integer.MAX_VALUE / 10 ||
                    (num == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            i++;
        }
        // 5. Return result
        return sign * num;
    }
    public static void main(String[] args) {
        String str = "  -45";
        System.out.println(myAtoi(str));
    }
}
