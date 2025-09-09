package Week_01;

/*
4. The Biggest Treasure
Three pirates find three treasure chests with different amounts of gold coins.

Input Format
• Three integers a, b, c

Output Format
• Print the largest value

Sample Test Cases
Input 1:
10 25 7
Output 1:
25

Input 2:
5 5 9
Output 2:
9

Input 3:
100 50 75
Output 3:
100
*/

public class Q4_BiggestTreasure {
    public static void main(String[] args) {
        int a = 100, b = 50, c = 75;

        if ((a >= b) && (a >= c)) {
            System.out.println(a);
        }else if ((b >= c) && (b >= a)) {
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }
}
