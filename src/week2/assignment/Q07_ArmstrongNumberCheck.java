package week2.assignment;

/*
Check if a number is an Armstrong number.
int n = 153; // 1³ + 5³ + 3³ = 153 → Armstrong
*/
public class Q07_ArmstrongNumberCheck {
    public static void main(String[] args) {
        int n = 153;
        int originalNumber = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
