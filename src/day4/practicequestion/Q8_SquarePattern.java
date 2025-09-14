package day4.practicequestion;

// Write a Java program to print a 4×4 square of asterisks (*).

public class Q8_SquarePattern {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
