package day5.practicequestion;

// Write a Java program to print the following inverted right-angled triangle of * (stars) for 3 rows

public class Q07_InvertedRightAngledTriangle {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
