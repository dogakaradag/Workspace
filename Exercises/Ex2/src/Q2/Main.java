package Q2;

public class Main {
    public static void main(String[] args) {
        // Creating Library object
        Library library = new Library();

        // Creating Book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");

        // Adding books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Displaying all books in the library
        library.displayBooks();

        // Learn what is toString method and how can it be implemented!

        // Searching for a book by title
        Book searchedBookByTitle = library.searchByTitle("1984");
        if (searchedBookByTitle != null) {
            System.out.println("\nBook found by title:\n" + searchedBookByTitle);
        } else {
            System.out.println("\nBook not found by title.");
        }

        // Searching for a book by author
        Book searchedBookByAuthor = library.searchByAuthor("F. Scott Fitzgerald");
        if (searchedBookByAuthor != null) {
            System.out.println("\nBook found by author:\n" + searchedBookByAuthor);
        } else {
            System.out.println("\nBook not found by author.");
        }

        // Removing a book from the library
        library.removeBook("9780061120084");

        // Displaying all books in the library after removal
        System.out.println("\nBooks in the Library after removal:");
        library.displayBooks();
    }
}
