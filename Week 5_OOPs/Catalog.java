/*Problem 3: Catalog Class
Scenario: You need to design a Catalog class to represent the library catalog. The class should use
collections (e.g., ArrayList) to store a collection of books. Implement methods to add books to the
catalog, display available books, and update book status.*/
import java.util.ArrayList;

public class Catalog{

    // Collection to store books
    private ArrayList<Book> books;

    // Constructor
    public Catalog() {
        books = new ArrayList<>();
    }

    // Method to add book to catalog
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books
    public void displayBooks() {
        System.out.println("Catalog:");
        for (Book book : books) {
            System.out.println("Book ID: " + book.getBookId() +
                    ", Title: " + book.getTitle() +
                    ", Author: " + book.getAuthor() +
                    ", Genre: " + book.getGenre() +
                    ", Available: " + book.isAvailable());
        }
    }

    // Method to update book availability
    public void updateBookStatus(int bookId, boolean status) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                book.setAvailable(status);
                break;
            }
        }
    }
}