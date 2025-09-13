package day3.practicequestion;

// Write a Java program that concatenates two strings entered by the user and displays the combined string.

import java.util.Scanner;

public class Q4_StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        String result = str1 + " " + str2; // concatenation
        System.out.println("Combined string: " + result);

    }
}
