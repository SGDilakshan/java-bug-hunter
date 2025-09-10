package day1.practicequestion;

// Sum of all Elements in an Array

public class Q2_ArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array: " + sum);
    }
}
