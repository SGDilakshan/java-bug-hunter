package week2.assignment;

/*
Count Positive, Negative, and Zero in Array
Given an array, count how many numbers are positive, how many are negative, and how many are zero.
int arr[] = {5, -3, 0, 12, -9, 0, 7};
*/

public class Q01_CountPositiveNegativeZero {
    public static void main(String[] args) {
        int arr[] = {5, -3, 0, 12, -9, 0, 7};

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Number of positive elements: " + positiveCount);
        System.out.println("Number of negative elements: " + negativeCount);
        System.out.println("Number of zero elements: " + zeroCount);
    }
}
