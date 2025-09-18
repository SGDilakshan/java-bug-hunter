package day5.practicequestion;

// Write a Java program to print the following pyramid of * (stars) with 3 rows

public class Q06_StarPyramid {
    public static void main(String[] args) {
        for (int i=1; i<=3; i++) {
            for (int j=2; j>=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
