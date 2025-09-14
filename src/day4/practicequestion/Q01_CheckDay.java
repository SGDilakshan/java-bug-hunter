package day4.practicequestion;

// Write a Java program that takes an integer between 1 and 7 and displays the corresponding day of the week using a switch statement.
// 1 → Monday
// 2 → Tuesday
// 3 → Wednesday
// 4 → Thursday
// 5 → Friday
// 6 → Saturday
// 7 → Sunday
// If the input number is not between 1 and 7, print "Invalid day".

public class Q01_CheckDay {
    public static void main(String[] args) {
        int number = 4;
        switch (number){
            case 1:
                System.out.println("Monday");
                return;
            case 2:
                System.out.println("Tuesday");
                return;
            case 3:
                System.out.println("Wednesday");
                return;
            case 4:
                System.out.println("Thursday");
                return;
            case 5:
                System.out.println("Friday");
                return;
            case 6:
                System.out.println("Saturday");
                return;
            case 7:
                System.out.println("Sunday");
                return;
            default:
                System.out.println("Invalid day");
        }
    }
}
