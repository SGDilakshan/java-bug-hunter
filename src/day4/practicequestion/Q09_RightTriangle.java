package day4.practicequestion;

// Write a Java program to print a right-angled triangle of asterisks with 4 rows

public class Q09_RightTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
