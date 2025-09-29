package day7.practicequestion;

// Write a Java program using recursion to print numbers from n down to 1 and return 1.

public class Q01_NToOne {

    public static int nToOne(int n) {
        if (n == 1){
            return 1;
        }
        System.out.println(n);
        return nToOne(n-1);
    }

    public static void main(String[] args) {
        System.out.println(nToOne(15));
    }
}
