package day1.practicequestion;

import java.util.Scanner;

public class Q1_SwapVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();

        System.out.println("\nBefore swapping:");
        System.out.println("First integer: " + a);
        System.out.println("Second integer: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("First integer: " + a);
        System.out.println("Second integer: " + b);
    }
}
