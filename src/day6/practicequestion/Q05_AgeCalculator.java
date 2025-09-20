package day6.practicequestion;

// Write a Java program with a method ageCalculator(String name, int birthYear) that calculates and displays a person’s age from their year of birth.

import java.time.LocalDate;

public class Q05_AgeCalculator {
    public static String ageCalculator(String name, int DOB) {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - DOB;
        String result = name + " age " + age;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ageCalculator("Dilakshan", 2000));

    }
}

