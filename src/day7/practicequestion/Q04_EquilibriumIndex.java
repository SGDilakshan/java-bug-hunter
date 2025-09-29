package day7.practicequestion;

// Write a Java program to find the equilibrium index of an array (where the sum of elements on the left and right of the index are equal).

public class Q04_EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {3, 5,4, 7, 8, 2,3, 6, 8};
        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            int LSum = 0, RSum = 0;

            // Sum of elements to the left of i
            for (int j = 0; j < i; j++) {
                LSum += arr[j];
            }

            // Sum of elements to the right of i
            for (int k = i + 1; k < arr.length; k++) {
                RSum += arr[k];
            }

            if (LSum == RSum) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
