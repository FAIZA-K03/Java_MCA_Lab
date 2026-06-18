// NonFictionBook.java

public class NonFictionBook extends Book {

    // Constructor
    public NonFictionBook(int bookId, String title, String author, String genre, boolean available) {
        super(bookId, title, author, genre, available);
    }

    // Overriding method
    @Override
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("Type: Non-Fiction");
    }
}