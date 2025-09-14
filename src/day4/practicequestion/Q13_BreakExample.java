package day4.practicequestion;

// Write a Java program to print numbers from 6 down to 1, but stop the loop when the number is 3 using the break statement

public class Q13_BreakExample{
    public static void main(String[] args) {
        int n = 6;
        for (int i = n; i > 0; i--) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
}


