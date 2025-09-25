package week3.assignment;

/*
Create a class Employee with private attributes name, id, and salary.
- Provide getter and setter methods.
- In the main method, create an employee object, set details, and print them.
*/

public class Q05_Employee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Dilakshan");
        e1.setId("SD001");
        e1.setSalary(5000);

        // Print employee details
        e1.details();
    }
}

class Employee {
    private String name;
    private String id;
    private double salary;

    // Setters
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display details
    public void details() {
        System.out.println("Name  : " + name);
        System.out.println("ID    : " + id);
        System.out.println("Salary: " + salary);
        System.out.println("-------------------------");
    }
}
