package week3.assignment;

/*
Create a class Rectangle with attributes length and breadth.
Write methods to calculate area and perimeter.
Create objects and display results.
*/

public class Q01_Rectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2.0, 3.0);
        r1.display();

        Rectangle r2 = new Rectangle(4.0, 5.0);
        r2.display();
    }
}

// Proper Rectangle class
class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public double getPerimeter() {
        return 2 * (length + breadth);
    }

    public void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("-----------------------");
    }
}
