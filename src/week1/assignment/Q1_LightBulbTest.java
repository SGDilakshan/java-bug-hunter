package week1.assignment;

/*
1. The Light Bulb Test
Ramesh bought a smart light bulb that switches ON only if he enters an even number, otherwise it stays OFF.

Input Format
• An integer n

Output Format
• Print "ON" if the number is even
• Print "OFF" if the number is odd

Sample Test Cases
Input 1:
4
Output 1:
ON

Input 2:
7
Output 2:
OFF

Input 3:
0
Output 3:
ON
*/

public class Q1_LightBulbTest {
    public static void main(String[] args) {
        int n = 4;
        if( n%2 == 0 ){
            System.out.println("ON");
        }else{
            System.out.println("OFF");
        }
    }
}
