package day4.practicequestion;

// Write a Java program to find and display the sum of the first n natural numbers (assign the value of n in the code).

public class Q03_SumOfFirstNNumbers {
    public static void main(String[] args) {
        int n = 9;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
