package week2.assignment;

/*
Find the second largest number in an array.
int arr[] = {14, 28, 19, 33, 45, 12};
*/

public class Q02_SecondLargestNumber {
    public static void main(String[] args) {
        int arr[] = {14, 28, 19, 33, 45, 12};
        int largest = arr[0];

        for(int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num != largest && num > secondLargest) {
                secondLargest = num;
            }
        }
        System.out.println("Second largest number: " + secondLargest);
    }
}
