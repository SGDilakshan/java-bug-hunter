package week1.assignment;

/*
3. The Faster Runner
Two friends, Arjun and Varun, run a race. Print who is faster.

Input Format
• Two integers time1 and time2 (in seconds)

Output Format
• "Arjun" if Arjun is faster
• "Varun" if Varun is faster
• "Tie" if both are equal

Sample Test Cases
Input 1:
12 10
Output 1:
Varun

Input 2:
15 20
Output 2:
Arjun

Input 3:
18 18
Output 3:
Tie
*/

public class Q3_FasterRunner {
    public static void main(String[] args) {
        int time1 = 18;
        int time2 = 18;

        if (time1 < time2) {
            System.out.println("Arjun"); // Arjun took less time → faster
        } else if (time2 < time1) {
            System.out.println("Varun"); // Varun took less time → faster
        } else {
            System.out.println("Tie");
        }

    }
}
