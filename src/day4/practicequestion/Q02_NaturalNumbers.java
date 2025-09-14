package day4.practicequestion;

// Write a Java program to display all natural numbers from 1 to 20.

public class Q02_NaturalNumbers {
    public static void main(String[] args) {
        int i = 1;

        // Method 1 - while loop
        /*
        while (i <= 20) {
            System.out.println(i);
            i++;
        }
        */

        // Method 2 - do while loop
        /*
        do {
            System.out.println(i);
            i++;
        } while (i <= 20);
        */

        // Method 3 - for loop
        for (i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
