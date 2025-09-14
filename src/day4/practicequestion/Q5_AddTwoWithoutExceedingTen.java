package day4.practicequestion;

// Write a Java program that starts with a number n, adds 2 repeatedly using a do…while loop, and prints each value, but stops before the number becomes greater than 10.

public class Q5_AddTwoWithoutExceedingTen {
    public static void main(String[] args) {
        int n = 5;

        do {
            System.out.println(n);
            n += 2;
        } while (n <= 10);
    }
}

