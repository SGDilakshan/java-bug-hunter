package day3.practicequestion;

// Check Positive, Negative, or Zero Using Ternary Operator

import java.util.Scanner;

public class Q5_CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        String result = (num > 0) ? "Positive" :
                (num < 0) ? "Negative" : "Zero";

        System.out.println("The number is: " + result);

    }
}
