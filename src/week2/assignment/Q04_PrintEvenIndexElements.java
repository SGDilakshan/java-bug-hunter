package week2.assignment;

/*
Print only the elements stored at even index positions in an array.
int arr[] = {10, 20, 30, 40, 50, 60};
should print 10, 30, 50
*/

public class Q04_PrintEvenIndexElements {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};

        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i]);
            if (i + 2 < arr.length) { // check if this is not the last element
                System.out.print(", ");
            }
        }
    }
}
