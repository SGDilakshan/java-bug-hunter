package Week_01;

/*
6. The Report Card
A school teacher wants to prepare a report card generator.

Input Format
• An integer marks (0–100)

Output Format
• "A" if marks >= 90
• "B" if marks >= 75 and < 90
• "C" if marks >= 50 and < 75
• "Fail" if marks < 50

Sample Test Cases
Input 1: 92
Output 1: A

Input 2: 76
Output 2: B

Input 3: 45
Output 3: Fail
*/

public class Q6_ReportCard {
    public static void main(String[] args) {

        int marks = 92; // enter marks between 0–100

        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 75 && marks < 90) {
            System.out.println("B");
        } else if (marks >= 50 && marks < 75) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }
    }
}
