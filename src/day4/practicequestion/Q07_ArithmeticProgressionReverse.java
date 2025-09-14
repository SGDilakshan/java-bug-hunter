package day4.practicequestion;

// Print the first 10 terms of an Arithmetic Progression (AP) starting from 5 with a common difference of 3 in reverse order

public class Q07_ArithmeticProgressionReverse {
    public static void main(String[] args) {
        int firstTerm = 5;
        int difference = 3;
        int n = 10; // number of terms

        System.out.println("first 10 terms of an AP starting from 5 with a common difference of 3 in reverse order: ");

        for (int i = n; i >= 1; i--) {
            int term = firstTerm + (i-1) * difference;
            System.out.print(term + " ");
        }
    }
}
