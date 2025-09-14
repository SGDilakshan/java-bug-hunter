package day4.practicequestion;

// Write a Java program to calculate and display the sum and average of all elements in an integer array.

public class Q15_ArraySumAndAverage {
    public static void main(String[] args) {
        int[] nums = {1, 23, 45, 67, 87, 45};
        double sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        System.out.println("Sum of array elements: " + sum);

        double average = sum / (nums.length);
        System.out.println("Average of array elements: " + average);
    }
}
