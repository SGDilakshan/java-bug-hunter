package day3.practicequestion;

// Write a Java program that demonstrates type casting by converting a double value to an int value and displaying both values.

public class Q3_TypeCastingExample {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d; // explicit type casting
        System.out.println("Double value: " + d);
        System.out.println("After casting to int: " + i);
    }
}
