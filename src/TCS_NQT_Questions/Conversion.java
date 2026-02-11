package TCS_NQT_Questions;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bitCount = (int)(Math.log(n) / Math.log(2)) + 1;
        int mask = (1 << bitCount) - 1; // left shift of (n << m) = n * 2^m
        System.out.println(n ^ mask); // Xor 
    }
}
