package day2.practicequestion;

public class Q1_CheckSpeed {
    public static void main(String[] args) {
        int speed = 70;
        int speedLimit = 60;

        if (speed > speedLimit) {
            System.out.println("Overspeeding! Pay Fine");
        } else {
            System.out.println("You are within the speed limit");
        }
    }
}
