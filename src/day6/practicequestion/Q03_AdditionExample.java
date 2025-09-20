package day6.practicequestion;

// Write a Java program with a method add(int a, int b) that returns the sum of two integers and demonstrate it in main.

public class Q03_AdditionExample {

    static int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
        System.out.println(add(500, 1000));
    }
}
