package week2.assignment;

/*
Pattern Printing - Pyramid of Stars
For n = 5, print the following pattern:
    *
   ***
  *****
 *******
*********
*/

public class Q10_StarPyramid {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
