package week2.assignment;

/*
Check whether a number is a palindrome (reads the same forwards and backwards).
int n = 1221; // output: Palindrome
*/

public class Q08_PalindromeNumberCheck {
    public static void main(String[] args) {
        int n = 1221;
        int originalNumber = n;
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10;
        }

        if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a Palindrome.");
        } else {
            System.out.println(originalNumber + " is not a Palindrome.");
        }
    }
}
