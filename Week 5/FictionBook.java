/*Problem 5: Inheritance and Polymorphism
Scenario: Utilize inheritance to create a more specific type of book (e.g., FictionBook, NonFictionBook) that extends the base Book class. Demonstrate polymorphism through a method
like displayDetails() that can provide different information based on the book type.*/
public class FictionBook extends Book {

    // Constructor
    public FictionBook(int bookId, String title, String author, String genre, boolean available) {
        super(bookId, title, author, genre, available);
    }

    // Overriding method (Polymorphism)
    @Override
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("Type: Fiction");
    }
}