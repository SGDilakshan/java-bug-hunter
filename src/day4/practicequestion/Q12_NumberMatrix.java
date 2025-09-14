package day4.practicequestion;

// Write a Java program to print numbers from 1 to 25 in a 5×5 grid.

public class Q12_NumberMatrix {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(sum+" ");
                sum ++;
            }
            System.out.println();
        }
    }
}
