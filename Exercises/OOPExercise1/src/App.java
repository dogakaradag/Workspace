public class App {
    public static void main(String[] args) {
        // Create authors
        Author author1 = new Author("J.K. Rowling", "jkrowling@example.com", "British author, best known for the Harry Potter series.");
        Author author2 = new Author("George Orwell", "georgeorwell@example.com", "English novelist, essayist, journalist and critic.");
        Author author3 = new Author("J.R.R. Tolkien", "jrrtolkien@example.com", "English writer, poet, philologist, and university professor.");

        // Create books
        Book book1 = new Book(1, "Harry Potter and the Sorcerer's Stone", 1997, author1, "Fantasy");
        Book book2 = new Book(2, "1984", 1949, author2, "Dystopian");
        Book book3 = new Book(3, "The Lord of the Rings", 1954, author3, "Fantasy");

        // Create a LibraryManager instance
        LibraryManager libraryManager = new LibraryManager();

        // Add books to the library
        libraryManager.addItem(book1);
        libraryManager.addItem(book2);
        libraryManager.addItem(book3);

        // Display all items in the library
        System.out.println("All items in the library:");
        libraryManager.displayAllItems();

        // Retrieve and display the details of a book by its id
        int searchId = 2;
        System.out.println("Details of the book with ID " + searchId + ":");
        LibraryItem item = libraryManager.getItem(searchId);
        if (item != null) {
            item.displayInfo();
        } else {
            System.out.println("Book not found.");
        }

        // Remove a book by its id
        int removeId = 1;
        libraryManager.removeItem(removeId);
        System.out.println("Removed book with ID " + removeId + ". Remaining items in the library:");
        libraryManager.displayAllItems();

        // final
    }
}
