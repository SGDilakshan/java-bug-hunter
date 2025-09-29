package day7.practicequestion;

/*
Write a program to create a Student class with attributes name and age, and display the details using a print() method.
*/

class Student {
    String name;
    int age;

    void print() {
        System.out.println(name + " " + age);
    }
}

public class Q03_Student {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.print();  // prints null 0
        s1.name = "Dilakshan";
        s1.age = 25;
        s1.print();  // prints Dilakshan 25
    }
}