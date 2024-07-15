/**
 * Book
 */
public class Book {

    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    void borrowBook() {
        if (isAvailable()) {
            System.out.println("Book borrowed");
            isBorrowed = true;
        } else {
            System.out.println("Book not available");
        }
    }

    void returnBook() {
        if (isBorrowed) {
            System.out.println("Book returned");
            isBorrowed = false;
        } else {
            System.out.println("Book not borrowed");
        }
    }

    boolean isAvailable() {
        return !isBorrowed;
    }
}