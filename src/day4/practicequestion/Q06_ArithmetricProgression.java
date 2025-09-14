package day4.practicequestion;

// Print the first 10 terms of an Arithmetic Progression (AP) starting from 5 with a common difference of 3

public class Q06_ArithmetricProgression {
    public static void main(String[] args) {
        int firstTerm = 5;
        int difference = 3;

        System.out.println("First 10 terms of the AP are:");

        for (int i = 0; i < 10 ; i++) {
            System.out.print(firstTerm + " ");
            firstTerm += difference;
        }
    }
}
