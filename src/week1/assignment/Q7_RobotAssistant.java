package week1.assignment;

/*
7. The Robot Assistant
A scientist built a robot that performs basic operations.

Input Format
• First line: two integers a and b
• Second line: an integer op representing the operation
    o 1 → Addition
    o 2 → Subtraction
    o 3 → Multiplication
    o 4 → Division

Output Format
• Print the result of the operation

Sample Test Cases
Input 1:
10 5
1
Output 1:
15

Input 2:
20 4
4
Output 2:
5

Input 3:
6 7
3
Output 3:
42
*/

import java.util.Scanner;

public class Q7_RobotAssistant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,op;

        System.out.print("Enter the first integer: ");
        a = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        b = scanner.nextInt();

        System.out.print("Enter the operation: ");
        op = scanner.nextInt();

        switch (op){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}

