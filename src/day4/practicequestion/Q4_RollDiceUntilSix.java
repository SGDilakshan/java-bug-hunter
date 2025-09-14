package day4.practicequestion;

// Write a Java program to simulate rolling a dice until you get a 6. Display each number rolled.

public class Q4_RollDiceUntilSix {
    public static void main(String[] args) {
        int dice;

        do {
            dice = (int)(Math.random() * 6) + 1;
            System.out.println(dice);
        } while (dice != 6);
    }
}
