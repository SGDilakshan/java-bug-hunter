package week2.assignment;

/*
Find how many times a particular number appears in an array.
int arr[] = {2, 4, 2, 6, 2, 9, 6};
Example: 2 appears 3 times, 6 appears 2 times
*/

public class Q03_CountNumberOccurrences {
    public static void main(String[] args) {
        int arr[] = {2, 4, 2, 6, 2, 9, 6};
        int numToCount = 6;
        int count = 0;

        for (int num : arr){
            if (num == numToCount){
                count++;
            }
        }
        System.out.println(numToCount+" appears "+count+" times");

    }
}
