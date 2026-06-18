/*Problem 2: User Class
Scenario: You need to design a User class to represent library users. The class should include
attributes such as user ID, name, and a list to store borrowed books. Implement methods to borrow
and return books.*/
import java.util.ArrayList;

public class User {

    // Data members
    private int userId;
    private String name;
    private ArrayList<Integer> borrowedBooks;

    // Constructor
    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getter methods
    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Method to borrow a book
    public void borrowBook(int bookId) {
        borrowedBooks.add(bookId);
    }

    // Method to return a book
    public void returnBook(int bookId) {
        borrowedBooks.remove(Integer.valueOf(bookId));
    }

    // Method to display user details
    public void displayUserDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Borrowed Books: " + borrowedBooks);
    }
}