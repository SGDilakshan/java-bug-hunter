package day7.practicequestion;

// Write a Java program using recursion to print numbers from 1 to n.

public class Q02_OneToN {
    static void print(int n){
        if(n == 0){
            return;
        } else {
            print(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        print(10);
    }
}
