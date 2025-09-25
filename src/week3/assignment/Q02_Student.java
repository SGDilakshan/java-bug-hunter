package week3.assignment;

/*
Create a Student class with attributes name, rollNumber, and marks.
Write a method to display student details.
Create 3 student objects and print their details.
*/

public class Q02_Student {
    public static void main(String[] args) {
        Student s1 = new Student("Dilakshan",1,98);
        Student s2 = new Student("Keerthana",2,97);
        Student s3 = new Student("Venuja",3,77);

        s1.display();
        s2.display();
        s3.display();
    }
}

class Student {
    String name;
    int rollNumber;
    int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("------------------------------------");
    }
}