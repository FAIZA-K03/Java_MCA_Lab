/*Problem 6: Main Program
Scenario: In the main program, instantiate the classes, add books to the catalog, create users, and
simulate the borrowing and returning of books. Display the catalog's status after each operation.*/

public class LibraryMain {

    public static void main(String[] args) {

        // Create Catalog
        Catalog catalog = new Catalog();

        Book book1 = new Book(1, "Java Basics", "John Doe", "Programming", true);
        catalog.addBook(book1);
     
       
        User user1 = new User(101, "Alice");
        user1.borrowBook(1);

        catalog.updateBookStatus(1, false);

        // Display Catalog after borrowing
        System.out.println("Catalog:");
        catalog.displayBooks();

        // Display User Details
        user1.displayUserDetails();

        System.out.println("----------------------------------");

        // Add Book 2
        Book book2 = new Book(2, "Advanced Java", "Jane Smith", "Programming", true);
        catalog.addBook(book2);

        // Create User 2
        User user2 = new User(102, "Bob");

        // User borrows Book 2
        user2.borrowBook(2);
        catalog.updateBookStatus(2, false);

        // User returns Book 2
        user2.returnBook(2);
        catalog.updateBookStatus(2, true);

        // Display Catalog after return
        System.out.println("Catalog:");
        catalog.displayBooks();

        // Display User Details
        user2.displayUserDetails();
    }
}