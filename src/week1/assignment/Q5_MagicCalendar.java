package week1.assignment;

/*
5. The Magic Calendar
A kingdom celebrates a festival only in leap years.

Input Format
• An integer year

Output Format
• "Leap Year" if it is a leap year
• "Not a Leap Year" otherwise

Sample Test Cases
Input 1:
2020
Output 1:
Leap Year

Input 2:
1900
Output 2:
Not a Leap Year

Input 3:
2000
Output 3:
Leap Year
*/

public class Q5_MagicCalendar {
    public static void main(String[] args) {
        int year = 2020;

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
