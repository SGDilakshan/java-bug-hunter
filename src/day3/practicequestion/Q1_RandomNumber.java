package day3.practicequestion;

// Generate a Random Number between 1 and 100

public class Q1_RandomNumber {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 100) + 1;
        System.out.println("Random number between 1 and 100: " + number);
    }
}
