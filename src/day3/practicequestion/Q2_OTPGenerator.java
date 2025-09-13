package day3.practicequestion;

// Write a Java program to generate a 6-digit OTP using Math.random() and display it.

public class Q2_OTPGenerator {
    public static void main(String[] args) {
        int otp = (int)(Math.random() * 900000) + 100000;
        System.out.println("Your OTP is: " + otp);
    }
}