package day4.practicequestion;

// Write a Java program to print 5 rows where each row starts with the row number followed by numbers 1 to 5

public class Q11_NumberGrid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i+"\t");
            for (int j = 1; j <= 5; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
