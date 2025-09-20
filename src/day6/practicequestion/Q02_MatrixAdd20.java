package day6.practicequestion;

// Write a Java program to add 20 to every element of a 2D array (matrix) and print the new matrix.

public class Q02_MatrixAdd20 {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3,4},{5,6,7,8},{8,9,10,11}};

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+20+" ");
            }
            System.out.println();
        }
    }
}
