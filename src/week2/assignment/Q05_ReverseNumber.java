package week2.assignment;

/*
Reverse a Number using While Loop
Given a number, reverse its digits.
int n = 12345;
output: 54321
*/

public class Q05_ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reversed number: " + reversed);
    }
}
