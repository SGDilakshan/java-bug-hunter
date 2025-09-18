package day5.practicequestion;

// Write a Java program to print the following 0-1 triangle pattern for 5 rows (starting with 0)

public class Q05_ZeroOneTriangleReversed {
    public static void main(String[] args) {
            for (int i=1; i<=5; i++) {
                for (int j=1; j<=i; j++) {
                    if ((i+j)%2==0) {
                        System.out.print(0);
                    }else{
                        System.out.print(1);
                    }
                }
                System.out.println();
            }
    }
}
