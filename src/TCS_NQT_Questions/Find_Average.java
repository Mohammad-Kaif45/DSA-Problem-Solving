package TCS_NQT_Questions;

import java.util.Scanner;

public class Find_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of test : ");
        int num = sc.nextInt();
        System.out.println("Enter marks obtained in " + num + " test : ");
        int marks = sc.nextInt();

        System.out.println("Enter how much marks have to increase : ");
        int inc = sc.nextInt();
        int totalMarks = num * marks;
        System.out.println((inc + marks)*(num + 1) - totalMarks);
    }
}
