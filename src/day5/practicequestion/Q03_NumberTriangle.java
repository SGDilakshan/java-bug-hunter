package day5.practicequestion;

// Write a Java program to print the following number triangle pattern up to 5 rows

public class Q03_NumberTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
