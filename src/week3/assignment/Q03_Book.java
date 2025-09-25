package week3.assignment;

/*
Create a class Book with attributes title, author, and price. Implement:
- A default constructor
- A parameterized constructor
- A method displayBookDetails() to print book details.
Create objects using both constructors.
*/

public class Q03_Book {
    public static void main(String[] args) {
        // Object using default constructor
        Book b1 = new Book();
        b1.displayBookDetails();

        // Object using parameterized constructor
        Book b2 = new Book("Java Programming", "James Gosling", 895.99);
        b2.displayBookDetails();
    }
}

class Book {
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display details
    public void displayBookDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : Rs." + price);
        System.out.println("-----------------------------------");
    }
}