package day1.practicequestion;

// Largest Element in an Array

public class Q3_LargestArrayElement {
    public static void main(String[] args) {
        int[] arr = {1,244,3,4,5,10};
        int largest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Largest element is: " + largest);

    }
}
