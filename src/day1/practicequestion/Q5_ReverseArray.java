package day1.practicequestion;

// Reverse an Array in Place

public class Q5_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 12, 23, 564, 5};

        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Reverse in place
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.print("\nReversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
