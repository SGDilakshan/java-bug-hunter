package day4.practicequestion;

// Write a Java program to print numbers from 1 to 5, but skip the number 3 using the continue statement.

public class Q14_ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
