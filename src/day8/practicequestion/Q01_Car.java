package day8.practicequestion;

/*
Create a class Car with attributes brand and year.
Write a parameterized constructor to initialize the attributes.
Implement a method display() to print the car’s brand and year.
In the main method, create a Car object and call the display() method.
*/

public class Q01_Car {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 2025);
        c1.display();
    }
}

class Car {
    String brand;
    int year;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }


}