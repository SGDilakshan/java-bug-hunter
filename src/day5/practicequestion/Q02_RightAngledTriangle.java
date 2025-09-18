package day5.practicequestion;

// Write a Java program to print a right-angled triangle pattern of * (stars) with 5 rows.

public class Q02_RightAngledTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
