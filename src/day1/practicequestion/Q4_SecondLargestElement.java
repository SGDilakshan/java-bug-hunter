package day1.practicequestion;

// Second Largest Element in an Array

public class Q4_SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {-5, 19, 22, -37, 1};
        int largest = Integer.MIN_VALUE; // Integer.MIN_VALUE is the smallest possible int in Java (−2,147,483,648)
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second largest element: " + secondLargest);
    }
}
