package day5.practicequestion;

// Write a Java program to print the following 0-1 triangle pattern for 5 rows

public class Q04_ZeroOneTriangle {
    public static void main(String[] args) {

        /*

        Method - 1
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=i; j++) {
                if ((i+j)%2==0) {
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
         */

        for (int x = 1; x <= 5; x++) {
            boolean value = true;

            if (x % 2 == 0) {
                value = false;
            }
            for (int y = 1; y <= x; y++) {
                if(value) {
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
                value = !value;
            }
            System.out.println();
        }

    }
}
