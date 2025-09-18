package day5.practicequestion;

// Write a Java program to print a rectangle of * (stars) with 6 rows and 5 columns.

public class Q01_RectanglePattern {
    public static void main(String[] args) {
        for(int i=1;i<=6;i++){
            for(int j=1;j<=5;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
