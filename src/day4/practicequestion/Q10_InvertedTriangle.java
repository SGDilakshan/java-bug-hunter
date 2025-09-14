package day4.practicequestion;

// Write a Java program to print an inverted right-angled triangle of asterisks with 4 rows.

public class Q10_InvertedTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
